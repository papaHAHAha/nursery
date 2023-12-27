package model.animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalsRegistry<E extends AnimalItem<E>> {
  private List<E> animalList;
  private long animalId;

  public AnimalsRegistry() {
    this.animalList = new ArrayList<>();
  }

  public boolean add(E animal) {
    String animalType = ((Animals) animal).getAnimalType().toLowerCase();
    // System.out.println("Trying to add animal with type: " + animalType);

    if (animal == null || !isValidType(animalType)) {
      // System.out.println("Animal not added: Invalid type - " + animalType);
      return false;
    }

    if (!animalList.contains(animal)) {
      animalList.add(animal);
      animal.setId(animalId++);
      // System.out.println("Animal added: " + animal.toString());
      return true;
    }
    return false;
  }

  public boolean isValidType(String type) {
    return Arrays.asList("cat", "dog", "hamster", "horse", "camel", "donkey").contains(type.toLowerCase());
  }

  @Override
  public String toString() {
    return getInfo();
  }

  public String getInfo() {
    StringBuilder sb = new StringBuilder();
    sb.append("Список животных: ");
    for (E animal : animalList) {
      sb.append(animal);
      sb.append("\n");
    }
    return sb.toString();
  }
}
