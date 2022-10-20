package sprint2.Uppg11;

import java.time.Duration;
import java.time.LocalTime;

public class TVProgram {
    private LocalTime start;
    private LocalTime end;
    private int durationMinutes;
    public TVProgram(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public int getDurationMinutes() {
        Duration duration = Duration.between(start, end);
        return (int) duration.toMinutes();
    }

}
