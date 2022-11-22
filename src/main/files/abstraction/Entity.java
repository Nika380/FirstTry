package main.files.abstraction;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Entity {
    private LocalDate birthdate;
    public int getAge() {
        return (int) ChronoUnit.YEARS.between(birthdate, LocalDate.now());

    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
