import java.time.LocalDate;

public class ForeignStudent extends Student{
    private String country;
    public ForeignStudent(String firstname, String lastname, LocalDate birthdate, double gpa, String country) {
        super(firstname, lastname, birthdate, gpa);
        setCountry(country);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
