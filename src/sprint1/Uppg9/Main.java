package sprint1.Uppg9;

public class Main {
    public static void main(String[] args) {
        for (RomanNumerals numeral:RomanNumerals.values()) {
            System.out.println(numeral + ": " + numeral.getNumberAsInteger() + " / " + numeral.getNumberAsString());
        }
    }
}

/*
De romerska siffrorna anges med bokstäverna I, V, X, L, C, D och M som står för 1, 5, 10, 50, 100,
500 resp. 1000.
Deklarera en uppräkningstyp Romersksiffra som innehåller uppräkningsvärdena I, V, X, L, C, D och
M. För varje uppräkningsvärde ska det finnas en instansvariabel som innehåller motsvarande
siffervärde.
I ditt huvudprogram, iterera över konstanterna i uppräkningen och skriv ut vad varje romersk siffra har
för värde.
 */