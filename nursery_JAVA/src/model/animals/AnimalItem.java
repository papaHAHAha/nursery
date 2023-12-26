package model.animals;

import java.time.LocalDate;
import java.util.List;

public interface AnimalItem {
    long getId();
    void setId(long id);
    String getName();
    void setName(String name);
    LocalDate getBirthDate();
    void setBirthDate(LocalDate birthDate);
    List<String> getCommands();
    void setCommands(List<String> commands);
}
