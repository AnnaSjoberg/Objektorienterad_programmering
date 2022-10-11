package sprint2.Uppg1;

import org.junit.jupiter.api.Test;

class FigureTest {
    Figure figure = new Circle(7);

    @Test
    void convertAreaToIntTest() {
        assert (figure.convertAreaToInt() == 153);
        assert (figure.convertAreaToInt() != 159);
    }
}