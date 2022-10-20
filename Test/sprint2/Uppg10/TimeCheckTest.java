package sprint2.Uppg10;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.List;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeCheckTest {
    TimeCheck tc = new TimeCheck();


    @Test
    public void formatNameTest() {
        //ger tillbaka en string med bara små bokstäver och trimmat
        String testCity1 = "Stockholm ";
        String testCity2 = " LONDON ";
        String testCity3 = "shanghai";

        assert (tc.formatName(testCity1).equals("stockholm"));
        assert (tc.formatName(testCity2).equals("london"));
        assert (tc.formatName(testCity3).equals("shanghai"));
        assert (!tc.formatName(testCity1).equals("HEJ"));
    }


    @Test
    public void printCityTimeTest() {
        String testCityCorrect = "shanghai  ";
        String testCityWrong = "london";
        System.out.println(tc.printCityTime(testCityCorrect));
        assertTrue(tc.printCityTime(testCityCorrect).contains("CST"));
        assertTrue(tc.printCityTime(testCityWrong).contains("not available"));

    }
    //ytterligare tester:

    // skriva ut vad klockan är i den efterfrågade staden

}
/*
Uppgift 10 – Tid
Skriv ett program som tar en stad och skriver ut vad klockan är i den staden just nu på formatet
HH:mm:ss. Implementera detta för åtminstone Toronto, Stockholm och Shanghai (fler städer om du
vill). Googla för att hitta namnen på tidszonerna eller deras id:n.
Programmet ska funka både då användaren skriver stadsnamnet med stora, små, eller blandade
bokstäver. Det ska funka även om användaren lägger in blankslag efter stadens namn.
Om en användare skriver in en stad som ditt program inte kan visa tid för, visa upp ett lämpligt
felmeddelande.
 */