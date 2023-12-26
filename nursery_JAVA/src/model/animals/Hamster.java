package model.animals;

import java.time.LocalDate;
import java.util.List;

public class Hamster extends Pets {
    public Hamster(long id, String name, String type, LocalDate birthDate, List<String> commands) {
        super(id, name, type, birthDate, commands);
    }
}
