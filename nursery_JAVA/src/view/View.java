package view;

import model.animals.Animals;
import model.animals.AnimalsRegistry;

public interface View {
  void start();
  void print(String text);
  void exit();
  public void setAnimals(AnimalsRegistry<Animals> animalList);
}
