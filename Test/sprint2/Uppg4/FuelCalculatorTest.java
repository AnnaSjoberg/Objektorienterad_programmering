package sprint2.Uppg4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FuelCalculatorTest {
    FuelCalculator f = new FuelCalculator(12345, 23456, 7890);

    @Test
    public void getYearlyDistanceTest() {
        assert (f.getYearlyDistance() == 11111);
        assert (f.getYearlyDistance() != 5132);
    }

    @Test
    public void getAverageConsumptionTest() {
        System.out.println(f.getAverageConsumption());
        assert (f.getAverageConsumption() == 0.7101071010710107);
        assert (f.getAverageConsumption() != 0.854);
    }

    @Test
    public void oneLineToStringTest(){
        assertTrue (f.oneLineToString(11111).equals("Antal körda mil: 11111.0"));
        assertTrue (f.oneLineToString(7890).equals("Antal liter bensin: 7890.0"));
        assertTrue (f.oneLineToString(0.71010710107101).equals("Förbrukning per mil: 0.71"));
        assertFalse (f.oneLineToString(0.71010710107101).equals("Felfelfel"));
    }
}

/*
Antal körda mil: 1487.0
Antal liter bensin: 1235.4
Förbrukning per mil: 0.83


  @Test
    public final void outputFormattingCorrectTest(){
        assertTrue(c.printDistanceDrivenDuringLastYear(1487).equals("Antal körda mil: 1487.0"));
        assertTrue(c.printGasUsedLastYear(1235.4).equals("Antal liter bensin: 1235.4"));
        assertTrue(c.printAverageGasUsage(0.83).equals("Förbrukning per mil: 0.83"));
    }


 */