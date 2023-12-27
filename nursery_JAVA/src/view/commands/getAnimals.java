package view.commands;

import view.Console;

public class getAnimals {
  private Console console;

  public getAnimals(Console console) {
    this.console = console;
  }

  public String getDescription() {
    return "Получить список животных";
  }

  public void execute() {
    console.getAnimals();
  }
}
