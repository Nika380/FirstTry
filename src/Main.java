import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Person std1 = new Student("nika",
//                "natro",
//                LocalDate.of(2003,1,1), 3.4);
//
//        Person fsdt1 = new ForeignStudent("jay", "jones",
//                LocalDate.of(1990, 3, 3),3.1,"Frane");
//
//        Person tech = new Teacher("Mr", "Jones",
//                LocalDate.of(1976,8,12));
//
//        ArrayList<Person> lst = new ArrayList<>();
//        lst.add(fsdt1);
//        lst.add(std1);
//        lst.add(tech);
//
//        for(Person person : lst) {
//            System.out.println(person.getFirstname());
//        }

        ArrayList<Drawable> drawlist = new ArrayList<>();
        drawlist.add(new Triangle(1,3,4));
        drawlist.add(new Square(2));


    }

}