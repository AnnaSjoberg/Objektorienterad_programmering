package sprint1.Uppg3d;

import java.util.ArrayList;
import java.util.List;

public class Uppg3dMain {
    Teacher teacher1 = new Teacher("Mats", "", "Mats' house", 1);
    Teacher teacher2 = new Teacher("Inga-Lena", "", "Inga-Lena's house", 3);
    Course course1 = new Course("Physics", teacher1);
    Course course2 = new Course("Swedish", teacher2);
    Course course3 = new Course("English", teacher2);
    Course course4 = new Course("Mathematics", teacher2);

    Student student1 = new Student("Anna", "123", "Anna's home");
    Student student2 = new Student("Inga-Lena", "456", "Lena's home");
    Student student3 = new Student("Emma", "789", "Emma's home");
    Student student4 = new Student("Frida", "147", "Frida's home");

    Participation participation1 = new Participation(student1, course1);
    Participation participation2 = new Participation(student1, course2);
    Participation participation3 = new Participation(student2, course3);
    Participation participation5 = new Participation(student3, course2);
    Participation participation6 = new Participation(student3, course3);
    Participation participation4 = new Participation(student3, course4);
    Participation participation7 = new Participation(student4, course2);
    Participation participation8 = new Participation(student4, course4);

    List<Participation> participationList = new ArrayList<>();
    Printer printer = new Printer();

    Uppg3dMain() {

        participationList.add(participation1);
        participationList.add(participation2);
        participationList.add(participation3);
        participationList.add(participation4);
        participationList.add(participation5);
        participationList.add(participation6);
        participationList.add(participation7);
        participationList.add(participation8);

        printer.printStudent(student3, participationList);
        printer.printCourse(course2, participationList);
        printer.printAll(participationList);
    }

    public static void main(String[] args) {
        Uppg3dMain uMain = new Uppg3dMain();
    }
}
/*
• Skapa upp objekt av Kurser och Studenter. Skapa sen objekt av Deltagande där du kopplar
ihop vilka studenter som går vilka kurser. Lägg alla Deltaganden i en lista så att man lätt kan
iterera över alla Deltaganden.

 */