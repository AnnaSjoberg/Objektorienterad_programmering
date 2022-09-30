package sprint1.Uppg3a;

public class Teacher extends Person {
    private Course[] courseArray;
    private int numberOfCourses;

    public Teacher(String name, String idNumber, String address, int numberOfCourses) {
        super(name, idNumber, address);
        this.numberOfCourses = numberOfCourses;
        courseArray = new Course[this.numberOfCourses];
    }

    public Course[] getCourseArray() {
        return courseArray;
    }

    public void setCourseArray(Course[] courseArray) {
        this.courseArray = courseArray;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }
}
