package sprint1.Uppg3b;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<String> courseList = new ArrayList<>();
    private int numberOfCourses;

    public Student(String name, String idNumber, String address, int numberOfCourses) {
        super(name, idNumber, address);
        this.numberOfCourses = numberOfCourses;
    }

    public List<String> getCourseList() {
        return courseList;
    }
    public int getNumberOfCourses() {
        return numberOfCourses;
    }
    public void registerCourse(String courseName) {
        if (getCourseList().size() < getNumberOfCourses()) {
            courseList.add(courseName);
        } else {
            System.out.println("Schedule is full");
        }
    }
    public void printOut() {
        String message = getName() + "'s courses:";
        for (String element : courseList) {
            message += "\n" + element;
        }
        System.out.println(message);
    }
}