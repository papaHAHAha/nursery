package model.animals;

import java.time.LocalDate;
import java.util.List;

public class Dog extends Pets {
    public Dog(String name, LocalDate birthDate, List<String> commands) {
        super(name,"dog", birthDate, commands);
    }
}
