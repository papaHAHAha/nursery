import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import model.animals.Animals;
import model.animals.AnimalsRegistry;
import view.Console;
import view.View;

public class Main {
  public static void main(String[] args) {
    AnimalsRegistry<Animals> animalList = new AnimalsRegistry<>();

    Animals animal1 = new Animals("Smudge", "Cat", LocalDate.of(2020, 02, 20),
        new ArrayList<>(Arrays.asList("Sit", "Pounce", "Scratch")));
    animalList.add(animal1);

    View view = new Console();
    view.setAnimals(animalList);
    view.start();
  }
}
