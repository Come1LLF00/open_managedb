package interaction.sender;

import interaction.instructions.Command;
import java.io.PrintStream;

/**
 * Интерфейс Invoker — часть паттерна "Команда", который отвечает вызывает все доступные команды по имени;
 * по совместительству — обработчик всех прихотей пользователя т.е. организует работу с ним в интерактивном режиме.
 * <p>
 *  Только классы этого интерфейса определяют: какая команда отправиться следующей на исполнение.
 *  Также хранит поток, через который общается с пользователем.
 * </p>
 * @author Come_1LL_F00 aka Lenar Khannanov
 * @author Leargy aka Anton Sushkevich
 * @see Prompter
 * @see ConsolePrompter
 * @see FilePrompter
 * @see interaction.customer.Receiver
 * @see interaction.customer.TotalCommander
 */
public interface Invoker {
  /**
   * Метод signup отвечает за добавление комманд в словарь комманд
   * @param command_name, Command instruct
   * @see Command
   */
  void signup(String command_name, Command instruct);
  /**
   * Метод scan просит у пользователя ввод и анализирует: какая команда требуется.
   * Возвращаемый тип показывает нужен ли дальнейший ввод.
   * @return boolean is input ended
   */
  boolean scan();
  PrintStream getMainStream();
}
