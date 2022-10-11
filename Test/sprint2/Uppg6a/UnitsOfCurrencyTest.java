package sprint2.Uppg6a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitsOfCurrencyTest {

    @Test
    public void getUnitAsIntTest() {
        assert (UnitsOfCurrency.ONE.getUnitAsInt().intValue() == 1);
        assert (UnitsOfCurrency.TWO.getUnitAsInt().intValue() == 2);
        assert (UnitsOfCurrency.FIVE.getUnitAsInt().intValue() == 5);
        assert (UnitsOfCurrency.TEN.getUnitAsInt().intValue() == 10);
        assert (UnitsOfCurrency.TWENTY.getUnitAsInt().intValue() == 20);
        assert (UnitsOfCurrency.FIFTY.getUnitAsInt().intValue() == 50);
        assert (UnitsOfCurrency.ONE_HUNDRED.getUnitAsInt().intValue() == 100);
        assert (UnitsOfCurrency.TWO_HUNDRED.getUnitAsInt().intValue() == 200);
        assert (UnitsOfCurrency.FIVE_HUNDRED.getUnitAsInt().intValue() == 500);
        assert (UnitsOfCurrency.ONE_THOUSAND.getUnitAsInt().intValue() == 1000);
    }

    @Test
    public void getUnitAsStringTest() {
        assert (UnitsOfCurrency.ONE.getUnitAsString().equals("enkronorsmynt"));
        assert (UnitsOfCurrency.TWO.getUnitAsString().equals("tvåkronorsmynt"));
        assert (UnitsOfCurrency.FIVE.getUnitAsString().equals("femkronorsmynt"));
        assert (UnitsOfCurrency.TEN.getUnitAsString().equals("tiokronorsmynt"));
        assert (UnitsOfCurrency.TWENTY.getUnitAsString().equals("20-kronorssedel"));
        assert (UnitsOfCurrency.FIFTY.getUnitAsString().equals("50-kronorssedel"));
        assert (UnitsOfCurrency.ONE_HUNDRED.getUnitAsString().equals("100-kronorssedel"));
        assert (UnitsOfCurrency.TWO_HUNDRED.getUnitAsString().equals("200-kronorssedel"));
        assert (UnitsOfCurrency.FIVE_HUNDRED.getUnitAsString().equals("500-kronorssedel"));
        assert (UnitsOfCurrency.ONE_THOUSAND.getUnitAsString().equals("1000-kronorssedel"));
    }
}