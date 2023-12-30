package view;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import model.animals.Animals;
import model.animals.AnimalsRegistry;
import presenter.Presenter;

public class Console implements View {
  private Presenter presenter;
  private boolean work;
  private Scanner scanner;
  private Menu menu;

  public Console() {
    presenter = new Presenter(this, null);
    scanner = new Scanner(System.in);
    menu = new Menu(this);
    work = true;
  }

  @Override
  public void start() {
    while (work) {
      System.out.println(menu.print());
      String choice = scanner.nextLine();
      menu.execute(choice);
    }
  }

  @Override
  public void exit() {
    work = false;
    System.out.println("Программа завершена.");
  }

  @Override
  public void print(String text) {
    System.out.println(text);
  }

  public void setAnimals(AnimalsRegistry<Animals> animalList) {
    presenter.setAnimals(animalList);
  }

  public void addAnimal(String name, String type, LocalDate birthDate, List<String> commands) {
    presenter.addAnimal(name, type, birthDate, commands);
  }

  public void getAnimals() {
    presenter.getAnimals();
  }

  public void addCommand(int id, String command) {
    presenter.addCommand(id, command);
  }

  public void getCommandList(int id) {
    presenter.getCommandList(id);
  }

  public void sortByBirthDate() {
    presenter.sortByBirthDate();
    getAnimals();
  }

  public void getAnimalCounter() {
    presenter.getAnimalCounter();
  }
}
