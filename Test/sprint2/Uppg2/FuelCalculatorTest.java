package sprint2.Uppg2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FuelCalculatorTest {
    FuelCalculator f = new FuelCalculator(9845, 13525, 2345);

    @Test
    public void getYearlyDistanceTest() {
        assert (f.getYearlyDistance() == 3680);
        assert (f.getYearlyDistance() != 3980);
    }

    @Test
    public void getAverageConsumptionTest() {
        System.out.println(f.getAverageConsumption());
        assert (f.getAverageConsumption() == 0.6372282608695652);
        assert (f.getAverageConsumption() != 0.854);
    }

    @Test
    public void printMeTest(){
        System.out.println(f.printMe());
        assertTrue (f.printMe().equals("""
                Antal körda mil: 3680.0
                Antal liter bensin: 2345.0
                Förbrukning per mil: 0.64
                """));
      //  assert (!f.printMe().equals("Jag hamrar och spikar och bygger en bil"));
    }
}

/*
Antal körda mil: 1487.0
Antal liter bensin: 1235.4
Förbrukning per mil: 0.83
 */