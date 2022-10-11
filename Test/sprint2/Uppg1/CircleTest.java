package sprint2.Uppg1;

import org.junit.jupiter.api.Test;

public class CircleTest {
    Circle circle = new Circle(7);

    @Test
    public void getCircumferenceTest(){
        assert (circle.getCircumference() == 43.982297150257105);
        assert (circle.getCircumference() != 15.654852);
    }


    @Test
    public void getAreaTest(){
        System.out.println(circle.getArea());
        assert (circle.getArea() == 153.93804002589985);
        assert (circle.getArea() != 15.654852);
    }
}
