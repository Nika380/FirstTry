import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
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
    private LocalDate birthdate;

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

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(birthdate, LocalDate.now());

    }

    private static int count;
    public static int getCount() {
        return count;
    }

}
