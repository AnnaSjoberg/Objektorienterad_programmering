package sprint1.Uppg3a;

public class Course {
    private String name;
    private Teacher teacher;
    private Student[] studentsArray;
    private int arraysCounter = 0;
    private int maxNumberOfStudents;


    public Course(String name, Teacher teacher, int maxNumberOfStudents) {
        this.name = name;
        this.teacher = teacher;
        this.maxNumberOfStudents = maxNumberOfStudents;
        studentsArray = new Student[this.maxNumberOfStudents];
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }


    public Student[] getStudentsArray() {
        return studentsArray;
    }

    public int getArraysCounter() {
        return arraysCounter;
    }

    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }


    public void registerStudent(Student student) {
        if (arraysCounter < getMaxNumberOfStudents()) {
            studentsArray[arraysCounter++] = student;
            student.registerCourse(getName());
        } else {
            System.out.println("Course is full");
        }
    }

    public void printOut() {
        String message = getName() + "\n" +
                "Teacher: " + getTeacher().getName() + "\n" +
                "Students:";
        for (int i = 0; i < getArraysCounter(); i++) {
            message += "\n" + studentsArray[i].getName();
        }
        System.out.println(message);
    }
}

/*
Gör en funktion som skriver ut en klasslista för din kurs med kursnamnet, läraren och
studenterna
 */