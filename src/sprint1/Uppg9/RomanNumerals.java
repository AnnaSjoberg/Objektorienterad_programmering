package sprint1.Uppg9;

public enum RomanNumerals {
    I("one", 1),
    V("five", 5),
    X("ten", 10),
    L("fifty", 50),
    C("one hundred", 100),
    D("five hundred", 500),
    M("one thousand", 1000);

    private final String numberAsString;
    private final Integer numberAsInteger;

    RomanNumerals(String numberAsString, Integer numberAsInteger) {
        this.numberAsString = numberAsString;
        this.numberAsInteger = numberAsInteger;
    }

    String getNumberAsString() {
        return numberAsString;
    }

    Integer getNumberAsInteger() {
        return numberAsInteger;
    }
}
