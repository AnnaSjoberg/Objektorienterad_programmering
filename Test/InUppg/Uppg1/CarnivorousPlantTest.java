package InUppg.Uppg1;

import org.junit.jupiter.api.Test;

class CarnivorousPlantTest {
    CarnivorousPlant c = new CarnivorousPlant("name", "owner", 4, "color");
    @Test
    void testAmountToGive() { //mängd = 0,1 + 0,2*höjd (liter)
        assert (Math.abs(c.amountToGive()-0.9) < 0.00001);
        assert (c.amountToGive() != 2.5);
    }
}