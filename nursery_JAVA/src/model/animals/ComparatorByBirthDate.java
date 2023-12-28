package model.animals;

import java.util.Comparator;

public class ComparatorByBirthDate<E extends AnimalItem<E>> implements Comparator<E> {
  @Override
  public int compare(E o1, E o2){
    return o2.getBirthDate().compareTo(o1.getBirthDate());
  }
  
}
