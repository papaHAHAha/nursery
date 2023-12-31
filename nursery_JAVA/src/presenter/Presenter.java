package presenter;

import model.animals.Animals;

import java.time.LocalDate;
import java.util.List;

import model.Service;
import model.animals.AnimalsRegistry;
import view.View;

public class Presenter {
  private View view;
  private Service service;

  public Presenter(View view, AnimalsRegistry<Animals> animalList) {
    service = new Service(animalList);
    this.view = view;
  }

  public void setAnimals(AnimalsRegistry<Animals> animalList) {
    service.setAnimals(animalList);
  }

  public void addAnimal(String name, String type, LocalDate birthDate, List<String> commands) {
    String answer = service.addAnimal(name, type, birthDate, commands);
    view.print(answer);
  }

  public void getAnimals() {
    String answer = service.getAnimals();
    view.print(answer);
  }

  public void addCommand(int id, String command) {
    String answer = service.addCommand(id, command);
    view.print(answer);
  }

  public void getCommandList(int id) {
    String answer = service.getCommandList(id);
    view.print(answer);
  }

  public void sortByBirthDate() {
    service.sortByBirthDate();
  }

  public void getAnimalCounter() {
    String answer = service.getAnimalCounter();
    view.print(answer);
  }
}
