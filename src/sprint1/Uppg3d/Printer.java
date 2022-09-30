package sprint1.Uppg3d;

import java.util.ArrayList;
import java.util.List;

public class Printer {

    public void printStudent(Student student, List<Participation> participationList) {
        String message = student.getName() + "'s courses: ";
        int counter = 0;
        for (Participation element : participationList) {
            if (student == element.getStudent()) {
                if (counter == 0) {
                    message += element.getCourse().getName();
                } else {
                    message += ", " + element.getCourse().getName();
                }
                counter++;
            }
        }
        System.out.println(message);
    }

    public void printCourse(Course course, List<Participation> participationList) {

        String message = "Course: " + course.getName() + "\n" +
                "Teacher: " + course.getTeacher().getName() + "\n" +
                "Students:";
        for (Participation element : participationList) {
            if (course == element.getCourse()) {
                message += "\n" + element.getStudent().getName();
            }
        }
        System.out.println(message);
    }

    public void printAll(List<Participation> participationList) {
        List<Student> alreadyPrinted = new ArrayList<>();
        for (Participation element : participationList) {
            if (!alreadyPrinted.contains(element.getStudent())) {
                printStudent(element.getStudent(), participationList);
                alreadyPrinted.add(element.getStudent());
            }
        }
  /*      for (Participation element : participationList) {
            if (!element.getStudent().equals(alreadyPrinted)) {
                printStudent(element.getStudent(), participationList);
            } else {
                alreadyPrinted = element.getStudent();

            }
        }
        for (int i = 0; i < participationList.size(); i++) {

        }
*/
    }
}
/*
printAll:
Plocka ut första elementets student.
anropa printStudent för studenten.
ta bort elementen som innehåller studenten

* Leta upp första element med en annan student.
* anropa printStudent för studenten.
* ta bort elementen som innehåller studenten

upprepa ** tills inga fler studenter            while (list.size > 0){




 */