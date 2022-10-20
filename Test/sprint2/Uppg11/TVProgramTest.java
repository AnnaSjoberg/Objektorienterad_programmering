package sprint2.Uppg11;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TVProgramTest {
    LocalTime start = LocalTime.of(19, 15);
    LocalTime end = LocalTime.of(21, 30);
    TVProgram program = new TVProgram(start, end);



    @Test
    public void getDurationMinutesTest() {

        assert (program.getDurationMinutes() == 135);
        assert (program.getDurationMinutes() != 50);
    }

}
//testa logiken i beräkningarna