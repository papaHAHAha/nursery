package model.animals;

import java.time.LocalDate;
import java.util.List;

public class Hamster extends Pets {
    public Hamster(String name, LocalDate birthDate, List<String> commands) {
        super(name,"hamster", birthDate, commands);
    }
}
