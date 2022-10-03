package InUppg.Uppg1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CactusTest {
    Cactus cactus = new Cactus("name", "owner", true);
    @Test
    void amountToGive() {
        assert (cactus.amountToGive()==2);
        assert (cactus.amountToGive()!=20);
    }
}