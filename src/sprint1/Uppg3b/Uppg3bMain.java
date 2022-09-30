package sprint1.Uppg3b;

public class Uppg3bMain {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Mats", "", "Mats' house", 1);
        Teacher teacher2 = new Teacher("Inga-Lena", "", "Inga-Lena's house", 3);

        Course course1 = new Course("Physics", teacher1, 8);
        Course course2 = new Course("Swedish", teacher2, 8);
        Course course3 = new Course("English", teacher2, 8);
        Course course4 = new Course("Mathematics", teacher2, 8);

        Student student1 = new Student("Anna", "123", "Anna's home", 1);
        Student student2 = new Student("Lena", "456", "Lena's home", 2);
        Student student3 = new Student("Emma", "789", "Emma's home", 1);
        Student student4 = new Student("Frida", "147", "Frida's home", 2);
        Student student5 = new Student("Theo", "258", "Theo's home", 4);
        Student student6 = new Student("Hugo", "369", "Hugo's home", 3);
        Student student7 = new Student("Ture", "159", "Ture's home", 4);
        Student student8 = new Student("Viggo", "357", "Viggo's home", 4);

        course1.registerStudent(student1);
        course1.registerStudent(student2);
        course1.registerStudent(student5);
        course1.registerStudent(student7);
        course1.registerStudent(student8);
        course1.printOut();

        System.out.println();

        course2.registerStudent(student4);
        course2.registerStudent(student5);
        course2.registerStudent(student6);
        course2.registerStudent(student7);
        course2.registerStudent(student8);

        course3.registerStudent(student5);
        course3.registerStudent(student6);
        course3.registerStudent(student7);
        course3.registerStudent(student8);

        course4.registerStudent(student3);
        course4.registerStudent(student4);
        course4.registerStudent(student5);
        course4.registerStudent(student6);
        course4.registerStudent(student7);
        course4.registerStudent(student8);
        course4.printOut();

        System.out.println();

        student3.printOut();
        System.out.println();

        teacher2.printOut();
    }
}
