import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("nika",
                "natro",
                LocalDate.of(2003,1,1), 3.4);

        System.out.println(std1.getSalary());
    }

}