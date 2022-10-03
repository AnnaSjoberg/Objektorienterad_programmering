package InUppg.Uppg1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTreeTest {
    PalmTree palmTree = new PalmTree("name", "owner", 5, false);
    @Test
    void amountToGive() {
        assert (palmTree.amountToGive() == 2.5); //mängd = höjd * 0,5 (liter)
        assert (palmTree.amountToGive() != 5);
    }
}