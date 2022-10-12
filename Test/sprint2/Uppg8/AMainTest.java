package sprint2.Uppg8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AMainTest {
        AMain a = new AMain(true);
    @Test
    void convertToDoubleTest() {
        String testString = "8,7";
        assert (a.convertToDouble(testString)==8.7);
    }

    @Test
    void compileInfoTest() {
    }
}