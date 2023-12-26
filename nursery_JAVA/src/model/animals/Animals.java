package model.animals;

import java.time.LocalDate;
import java.util.List;

public class Animals implements AnimalItem {
  private long id;
  private String name;
  private String type;
  private LocalDate birthDate;
  private List<String> commands;

  public Animals(long id, String name, String type, LocalDate birthDate, List<String> commands) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.birthDate = birthDate;
    this.commands = commands;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public String getType() {
    return type;
  }

  public List<String> getCommands() {
    return commands;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setCommands(List<String> commands) {
    this.commands = commands;
  }

  @Override
  public String toString() {
    return "id: " + id +
        ", имя: " + name +
        ", тип: " + type +
        ", дата рождения: " + birthDate +
        ", список команд: " + getCommandsAsString();
  }

  private String getCommandsAsString() {
    return String.join(", ", commands);
  }

  public String getAnimalType() {
    return this.getClass().getSimpleName();
}
}
