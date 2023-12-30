package view.commands;

import view.Console;

public class getAnimalCounter {
  private Console console;

  public getAnimalCounter(Console console) {
    this.console = console;
  }

  public String getDescription() {
    return "Счетчик(позволяет вывести на экран общее количество созданных животных любого типа)";
  }

  public void execute() {
    console.getAnimalCounter();
  }
}

