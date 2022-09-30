package sprint1.Uppg3a;

public class Student extends Person {
    private String[] courseNames;
    private int numberOfCourses;
    private int arraysCounter = 0;

    public Student(String name, String idNumber, String address, int numberOfCourses) {
        super(name, idNumber, address);
        this.numberOfCourses = numberOfCourses;
        courseNames = new String[this.numberOfCourses];
    }

    public String[] getCourseNames() {
        return courseNames;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public int getArraysCounter() {
        return arraysCounter;
    }

    public void registerCourse(String courseName) {
        if (arraysCounter < getNumberOfCourses()) {
            courseNames[arraysCounter++] = courseName;
        } else {
            System.out.println("Schedule is full");
        }
    }

    public void printOut() {
        String message = getName() + "'s courses:";
        for (int i = 0; i < getArraysCounter(); i++) {
            message += "\n" + courseNames[i];
        }
        System.out.println(message);
    }
}