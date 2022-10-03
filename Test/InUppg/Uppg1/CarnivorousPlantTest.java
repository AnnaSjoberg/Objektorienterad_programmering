package InUppg.Uppg1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousPlantTest {
    CarnivorousPlant c = new CarnivorousPlant("name", "owner", 0.3, "color");
    @Test
    void amountToGive() { //mängd = 0,1 + 0,2*höjd (liter)
        assert (c.amountToGive() == 0.16);
        assert (c.amountToGive() != 2.5);
    }
}//här blev det lite konstigt ibland med uträkningen.
// tex när jag lät höjden vara 3.
// Då blir uträkningen i koden av någon anledning 0.700_000_000_000_001 istället för 0.7.
//Samma problem uppstår också vid height=0.4.
//Däremot går det bra att height är antingen 0.3 eller 4.