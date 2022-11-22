package main.files.credentials;

import java.time.LocalDate;

public class Student extends Person{
    private double gpa;
    public Student(String firstname, String lastname,  LocalDate birthdate,double gpa) {
        super(firstname, lastname, birthdate);
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
