package model.animals;

import java.time.LocalDate;
import java.util.List;

public class PackAnimals extends Animals {
    public PackAnimals(String name, String type, LocalDate birthDate, List<String> commands) {
        super(name, type, birthDate, commands);
    }
}
