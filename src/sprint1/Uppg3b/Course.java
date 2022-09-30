package sprint1.Uppg3b;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Teacher teacher;
    private List<Student> listOfStudents = new ArrayList<>();
    private int maxNumberOfStudents;


    public Course(String name, Teacher teacher, int maxNumberOfStudents) {
        this.name = name;
        setTeacher(teacher);
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
        teacher.registerCourse(getName());
    }

    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void registerStudent(Student student) {
        if (getListOfStudents().size() < getMaxNumberOfStudents()) {
            getListOfStudents().add(student);
            student.registerCourse(getName());
        } else {
            System.out.println("Course is full");
        }
    }

    public void printOut() {
        String message = getName() + "\n" +
                "Teacher: " + getTeacher().getName() + "\n" +
                "Students:";
        for (Student element : listOfStudents) {
            message += "\n" + element.getName();
        }
        System.out.println(message);
    }
}

/*
Gör en funktion som skriver ut en klasslista för din kurs med kursnamnet, läraren och
studenterna
 */