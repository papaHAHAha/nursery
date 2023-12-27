package model.animals;

import java.time.LocalDate;
import java.util.List;

public class Pets extends Animals {
    public Pets(String name, String type, LocalDate birthDate, List<String> commands) {
        super(name, type, birthDate, commands);
    }
}
