package view;

import java.util.ArrayList;
import java.util.List;

import view.commands.addAnimal;
import view.commands.addCommand;
import view.commands.exit;
import view.commands.getAnimalCounter;
import view.commands.getAnimals;
import view.commands.getCommandList;
import view.commands.sortByBirthDate;

public class Menu {
  private List<getAnimals> list;
  private addAnimal addAnimalCmd;
  private addCommand addCommandCmd;
  private getCommandList getCommandListCmd;
  private sortByBirthDate sortByBirthDateCmd;
  private getAnimalCounter getAnimalCounterCmd;
  private exit exit;

  public Menu(Console console) {
    list = new ArrayList<>();
    list.add(new getAnimals(console));

    addAnimalCmd = new addAnimal(console);
    getCommandListCmd = new getCommandList(console);
    addCommandCmd = new addCommand(console);
    sortByBirthDateCmd = new sortByBirthDate(console);
    getAnimalCounterCmd = new getAnimalCounter(console);
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
    stringBuilder.append(addCommandCmd.getDescription());
    stringBuilder.append("\n");

    stringBuilder.append(list.size() + 3);
    stringBuilder.append(". ");
    stringBuilder.append(getCommandListCmd.getDescription());
    stringBuilder.append("\n");

    stringBuilder.append(list.size() + 4);
    stringBuilder.append(". ");
    stringBuilder.append(sortByBirthDateCmd.getDescription());
    stringBuilder.append("\n");

    stringBuilder.append(list.size() + 5);
    stringBuilder.append(". ");
    stringBuilder.append(getAnimalCounterCmd.getDescription());
    stringBuilder.append("\n");

    stringBuilder.append(list.size() + 6);
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
      addCommandCmd.execute();
    } else if (index == list.size() + 2) {
      getCommandListCmd.execute();
    } else if (index == list.size() + 3) {
      sortByBirthDateCmd.execute();
    } else if (index == list.size() + 4) {
      getAnimalCounterCmd.execute();
    } else if (index == list.size() + 5) {
      exit.execute();
    } else {
      list.get(index).execute();
    }
  }
}
