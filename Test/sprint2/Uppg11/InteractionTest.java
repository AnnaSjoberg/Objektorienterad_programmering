package sprint2.Uppg11;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InteractionTest {
    boolean test = true;
    Interaction interaction = new Interaction(test);

    VideoTape testTape1 = new VideoTape(40,25);
    VideoTape testTape2 = new VideoTape(220,10);
    LocalTime start = LocalTime.of(15,00);
    LocalTime end = LocalTime.of(16,10);
    TVProgram testProgram = new TVProgram(start,end);




    @Test
    public void compileMessageTest() {
        interaction.setInputForTVProgram(testProgram);
        interaction.setInputForVideoTape(testTape1);
        assertTrue (interaction.compileMessage().contains("does not fit"));
        interaction.setInputForVideoTape(testTape2);
        assertTrue(interaction.compileMessage().contains("fits on tape"));
    }

}
//k