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

}
