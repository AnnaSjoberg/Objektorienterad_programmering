package InUppg.Uppg1;

import org.junit.jupiter.api.Test;

class PalmTreeTest {
    PalmTree p = new PalmTree("name", "owner", 5, false);
    @Test
    void amountToGive() {
        assert (Math.abs(p.amountToGive()-2.5) < 0.00001); //mängd = höjd * 0,5 (liter)
        assert (p.amountToGive() != 5);
    }
}