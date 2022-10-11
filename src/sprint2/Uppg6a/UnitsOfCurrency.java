package sprint2.Uppg6a;

public enum UnitsOfCurrency {
    ONE(1,"enkronorsmynt"),
    TWO(2,"tvåkronorsmynt"),
    FIVE(5,"femkronorsmynt"),
    TEN(10,"tiokronorsmynt"),
    TWENTY(20, "20-kronorssedel"),
    FIFTY(50, "50-kronorssedel"),
    ONE_HUNDRED(100, "100-kronorssedel"),
    TWO_HUNDRED(200, "200-kronorssedel"),
    FIVE_HUNDRED(500, "500-kronorssedel"),
    ONE_THOUSAND(1000, "1000-kronorssedel");

    private final Integer unitAsInt;
    private final String unitAsString;

    UnitsOfCurrency(Integer unitAsInt, String unitAsString) {
        this.unitAsInt = unitAsInt;
        this.unitAsString = unitAsString;
    }

    public Integer getUnitAsInt() {
        return unitAsInt;
    }

    public String getUnitAsString() {
        return unitAsString;
    }
}
/*
 I(1, "ett"), V(5, "fem"), X(10, "tio"), L(50, "femtio"),
    C(100, "hundra"), D(500, "femhundra"), M(1000, "tusen");

    private final Integer  digit;
    private final String  aString;

    RomerskaSiffror (Integer digit, String s)  {
        this.digit = digit;
        this.aString = s;
    }

    Integer getDigit(){
        return digit;
    }

    String getString(){
        return aString;
    }
 */