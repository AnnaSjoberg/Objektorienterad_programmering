package sprint1.Uppg3d;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Teacher teacher;


    public Course(String name, Teacher teacher) {
        this.name = name;
        setTeacher(teacher);
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

}

/*
Gör en funktion som skriver ut en klasslista för din kurs med kursnamnet, läraren och
studenterna
 */