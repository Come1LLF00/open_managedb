package interaction.instructions.base;

import interaction.customer.Receiver;
import interaction.instructions.Decree;

public class Exit extends Decree {
  public Exit(Receiver receiver) {super(receiver);}
  @Override public void execute() {System.exit(0);} // TODO: check if it is bad decision;
  public String toString() {
    return NAME + " : " + SYNTAX;
  }
  public static final String NAME = "exit";
  public static final String BRIEF = "завершить программу";
  public static final String SYNTAX = NAME;
  public static final String DESCRIPTION = "Выход из интерактивного режима без записи данных в файл.\n\t" +
      "!!! ACHTUNG !!! Все внесённые изменения будут\n\t" +
      "утеряны, желательно перед выходом исполнить команду save.";
}