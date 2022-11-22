package main.files.credentials;

import main.files.abstraction.Entity;

import java.time.LocalDate;

public class Person extends Entity {
    public Person(String firstname, String lastname, LocalDate birthdate) {
        setFirstname(firstname);
        setLastname(lastname);
        setBirthdate(birthdate);
        setSalary(0);
        count++;
    }
    private String firstname;
    private String lastname;
    private Integer salary;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;

    }




    private static int count;
    public static int getCount() {
        return count;
    }

}
