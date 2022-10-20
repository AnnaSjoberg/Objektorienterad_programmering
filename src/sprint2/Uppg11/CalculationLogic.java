package sprint2.Uppg11;

import java.time.Duration;
import java.time.LocalTime;

public class CalculationLogic {


    public boolean doesProgramFit (int timeOnTape, int programDuration){
        return timeOnTape >= programDuration;
    }
}
