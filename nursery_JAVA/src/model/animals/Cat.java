package model.animals;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Pets {
    public Cat(long id, String name, String type, LocalDate birthDate, List<String> commands) {
        super(id, name, type, birthDate, commands);
    }
}
