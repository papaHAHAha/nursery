package model.animals;

import java.time.LocalDate;
import java.util.List;

public class Donkey extends PackAnimals {
    public Donkey(long id, String name, String type, LocalDate birthDate, List<String> commands) {
        super(id, name, type, birthDate, commands);
    }
}
