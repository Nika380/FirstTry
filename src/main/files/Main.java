package main.files;

import main.files.shapes.Drawable;
import main.files.shapes.Square;
import main.files.shapes.Triangle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        main.files.credentials.Person std1 = new main.files.credentials.Student("nika",
//                "natro",
//                LocalDate.of(2003,1,1), 3.4);
//
//        main.files.credentials.Person fsdt1 = new main.files.credentials.ForeignStudent("jay", "jones",
//                LocalDate.of(1990, 3, 3),3.1,"Frane");
//
//        main.files.credentials.Person tech = new main.files.credentials.Teacher("Mr", "Jones",
//                LocalDate.of(1976,8,12));
//
//        ArrayList<main.files.credentials.Person> lst = new ArrayList<>();
//        lst.add(fsdt1);
//        lst.add(std1);
//        lst.add(tech);
//
//        for(main.files.credentials.Person person : lst) {
//            System.out.println(person.getFirstname());
//        }

        ArrayList<Drawable> drawlist = new ArrayList<>();
        drawlist.add(new Triangle(1,3,4));
        drawlist.add(new Square(2));


    }

}