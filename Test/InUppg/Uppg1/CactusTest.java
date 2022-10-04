package InUppg.Uppg1;

import org.junit.jupiter.api.Test;

class CactusTest {
    Cactus cactus = new Cactus("name", "owner", true);
    @Test
    void testAmountToGive() {
        assert (cactus.amountToGive()==2);
        assert (cactus.amountToGive()!=20);
    }
}