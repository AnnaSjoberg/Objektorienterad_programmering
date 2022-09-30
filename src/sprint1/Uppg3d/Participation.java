package sprint1.Uppg3d;

public class Participation {
    private Student student;
    private Course course;

    public Participation(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }
}
/*
Uppgift 3d – Refaktorering - Deltagande
Nu ska vi bygga om koden från 3b på ett bättre sätt, där man slipper den trista dubbellagringen av
data!
• Ta bort listan av Kurs hos Student och listan av Student hos Kurs

• Skapa istället klassen Deltagande. Ett objekt av typen Deltagande ska innehålla en Student
och en Kurs, och markerar därmed att en student går en kurs. Notera hur vi flyttar ut
dubbellagringen till en egen klass, och vips så lagras det bara på ett ställe. WIN!!!


 */