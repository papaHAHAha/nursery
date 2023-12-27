package view;

import java.util.ArrayList;
import java.util.List;

import view.commands.addAnimal;
import view.commands.exit;
import view.commands.getAnimals;

public class Menu {
  private List<getAnimals> list;
  private addAnimal addAnimalCmd;
  private exit exit;

  public Menu(Console console) {
    list = new ArrayList<>();
    list.add(new getAnimals(console));

    addAnimalCmd = new addAnimal(console);
    exit = new exit(console);
  }

  public String print() {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < list.size(); i++) {
      stringBuilder.append(i + 1);
      stringBuilder.append(". ");
      stringBuilder.append(list.get(i).getDescription());
      stringBuilder.append("\n");
    }
    stringBuilder.append(list.size() + 1);
    stringBuilder.append(". ");
    stringBuilder.append(addAnimalCmd.getDescription());
    stringBuilder.append("\n");

    stringBuilder.append(list.size() + 2);
    stringBuilder.append(". ");
    stringBuilder.append(exit.getDescription());
    stringBuilder.append("\n");

    return stringBuilder.toString();
  }

  public void execute(String choice) {
    int index = Integer.parseInt(choice) - 1;

    if (index == list.size()) {
      addAnimalCmd.execute();
    } else if (index == list.size() + 1) {
      exit.execute();
    } else {
      list.get(index).execute();
    }
  }
}
