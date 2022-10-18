package InUppg.Uppg2;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IOHandlingTest {

    IOHandling obj = new IOHandling();
    String testReadPath = "Test/InUppg/Uppg2/testFileRead.txt";
    String testWritePath = "Test/InUppg/Uppg2/testFileWrite.txt";

    @Test
    public void readFromFileTest() { //skrivit metoden innan testet
        assert (obj.listFromFile(testReadPath).size() == 5);
        assert (obj.listFromFile(testReadPath).get(0).getFullName().equals("Lena Sjö"));
        assert (obj.listFromFile(testReadPath).get(1).getIdNumber().equals("8505205678"));
        assert (obj.listFromFile(testReadPath).get(2).getIdNumber().equals("8703119012"));
        assert (obj.listFromFile(testReadPath).get(3).getFullName().equals("Mats Jåson"));
        assert (obj.listFromFile(testReadPath).get(4).getPurchaseDate().equals("2022-06-08"));
    }

    @Test
    public void WriteToFileTest() {//testen påbörjde innan övig kod (gått fram och tillbaka innan grönt)
        String testDay1 = "2022-09-17";
        String testDay2 = "2022-09-21";
        String testDay3 = "2022-10-05";
        PreviousCustomer p1 = new PreviousCustomer("6203051234", "Lena Sjö", "2202-01-31");
        int linesInFile = countLinesInFile(testWritePath);

        obj.writeToFile(testWritePath, p1, testDay1);
        obj.writeToFile(testWritePath, p1, testDay2);
        obj.writeToFile(testWritePath, p1, testDay3);

        assertTrue(countLinesInFile(testWritePath) == (linesInFile+3));
        assertFalse(countLinesInFile(testWritePath) == 0);

    }

    public final int countLinesInFile(String fileToCount) {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileToCount));) {
            while (reader.readLine() != null) lines++;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }
}

