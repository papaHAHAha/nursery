package view.commands;

import java.util.Scanner;

import view.Console;

public class getCommandList {
  private Console console;

  public getCommandList(Console console) {
    this.console = console;
  }

  public String getDescription() {
    return "Вывести список комманд животного";
  }

  public void execute() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Введите ID животного: ");
      int id = scanner.nextInt();

      console.getCommandList(id);
  }
}