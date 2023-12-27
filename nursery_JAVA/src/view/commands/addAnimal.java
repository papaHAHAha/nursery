package view.commands;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import view.Console;

public class addAnimal {
  private Console console;

  public addAnimal(Console console) {
    this.console = console;
  }

  public String getDescription() {
    return "Добавить животное";
  }

  public void execute() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Введите имя животного: ");
      String name = scanner.nextLine();
      System.out.print("Введите тип: ");
      String type = scanner.nextLine();
      System.out.print("Введите дату рождения (гггг-мм-дд): ");
      String birthDateStr = scanner.nextLine();
      System.out.println("Введите список команд через запятую (например, Sit, Stay, Fetch): ");
      String commandsStr = scanner.nextLine();
        
      LocalDate birthDate = LocalDate.parse(birthDateStr);
      List<String> commands = List.of(commandsStr.split(", "));

      console.addAnimal(name, type, birthDate, commands);;
  }
}
