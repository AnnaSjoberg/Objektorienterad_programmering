package sprint2.Uppg11;

import org.junit.jupiter.api.Test;

public class VideoTapeTest {
    VideoTape videoTape1 = new VideoTape(120, 15);
    VideoTape videoTape2 = new VideoTape(240, 40);

    @Test
    public void getRemainingTimeTest() {
        assert (videoTape1.getRemainingTime() == 105);
        assert (videoTape2.getRemainingTime() != 0);
    }
}
