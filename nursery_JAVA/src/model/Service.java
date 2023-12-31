package model;

import model.animals.AnimalsRegistry;
import model.animals.Camel;
import model.animals.Cat;
import model.animals.Dog;
import model.animals.Donkey;
import model.animals.Hamster;
import model.animals.Horse;

import java.time.LocalDate;
import java.util.List;

import model.animals.Animals;;

public class Service {
  private AnimalsRegistry<Animals> animalList;

  public Service(AnimalsRegistry<Animals> animalList) {
    this.animalList = animalList;
  }

  public void setAnimals(AnimalsRegistry<Animals> animalList) {
    this.animalList = animalList;
  }

  public String getAnimals() {
    return animalList.getInfo();
  }

  public String addAnimal(String name, String type, LocalDate birthDate, List<String> commands) {
    Animals newAnimal;
    switch (type.toLowerCase()) {
      case "dog":
        newAnimal = new Dog(name, birthDate, commands);
        break;
      case "cat":
        newAnimal = new Cat(name, birthDate, commands);
        break;
      case "hamster":
        newAnimal = new Hamster(name, birthDate, commands);
        break;
      case "horse":
        newAnimal = new Horse(name, birthDate, commands);
        break;
      case "camel":
        newAnimal = new Camel(name, birthDate, commands);
        break;
      case "donkey":
        newAnimal = new Donkey(name, birthDate, commands);
        break;
      default:
        return "Неверный тип животного";
    }

    if (animalList.add(newAnimal)) {
      return "Животное добавлено";
    } else {
      return "Ошибка при добавлении животного";
    }
  }

  public String addCommand(int id, String command) {
    List<Animals> animalsList = animalList.getAnimalsList();
    for (Animals animal : animalsList) {
      if (animal.getId() == id) {
        if (animal.hasCommand(command)) {
          return "Команда \"" + command + "\" уже существует для животного с id " + id;
        } else {
          animal.addCommand(command);
          return "Команда \"" + command + "\" успешно добавлена для животного с id " + id;
        }
      }
    }
    return "Животное с id " + id + " не найдено";
  }

  public String getCommandList(int id) {
    String res = "Commands: ";
    List<Animals> animalsList = animalList.getAnimalsList();
    for (Animals animal : animalsList) {
      if (animal.getId() == id) {
        res += animal.getCommands();
        break;
      }
    }
    return res;
  }

  public void sortByBirthDate() {
    animalList.sortByBirthDate();
  }

  public String getAnimalCounter() {
    return "Общее количество созданных животных: " + AnimalsRegistry.getAnimalCounter();
}
}
