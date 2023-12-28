package model.animals;

import java.time.LocalDate;

public interface AnimalItem<E> {
    void setId(long id); 
    LocalDate getBirthDate();
}
