package sprint2.Uppg1;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    Triangle triangle = new Triangle(5,8);

    @Test
    public void getCircumferenceTest(){
        assert (triangle.getCircumference() == 18);
        assert (triangle.getCircumference() != 8);
    }

    @Test
    public void getAreaTest(){
        assert (triangle.getArea() == 20);
        assert (triangle.getArea() != 8);
    }
}
/*
Uppgift 1c – geometriska figurer, Triangle
Gör tester för klassen Triangle som representerar en likbent triangel. Skriv sen klassen och ge den en
höjd och en bredd. Låt den implementera Figure. Följ i övrigt punkterna i 1b, skriv tester först,
implementera sedan funktionalitet i Triangle-klassen.
 */