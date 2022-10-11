package sprint2.Uppg1;

import org.junit.jupiter.api.Test;

public class SquareTest {
    Square square = new Square(3,2);


    @Test
    public void getCircumferenceTest(){
        assert (square.getCircumference() == 10);
        assert (square.getCircumference() != 12);
    }

    @Test
    public void getAreaTest(){
        assert (square.getArea() == 6);
        assert (square.getArea() != 16);
    }
}


/*
Uppgift 1b – Geometriska figurer, square
• Skapa testklassen SquareTest i din testkatalog
• Skapa klassen Square som implementerar Figure
• Låt Square ha length och width (integers)
• Skriv tester getAreaTest() och getCircumferenceTest()
• Skriv sedan funktionerna som räknar ut Area och omkrets
• Verifiera att testerna går gröna
 */