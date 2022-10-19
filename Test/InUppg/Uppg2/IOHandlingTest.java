package InUppg.Uppg2;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IOHandlingTest {


    IOHandling obj = new IOHandling();
    String testReadPath = "Test/InUppg/Uppg2/testFileRead.txt";
    String testWritePath = "Test/InUppg/Uppg2/testFileWrite.txt";

    @BeforeAll
    static void beforeAll() {
        try (PrintWriter pw = new PrintWriter(new FileWriter("Test/InUppg/Uppg2/testFileWrite.txt"))) {
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void listFromFileTest() { //Kod före test
        assert (obj.listFromFile(testReadPath).size() == 5);
        assert (obj.listFromFile(testReadPath).get(0).getFullName().equals("Lena Sjö"));
        assert (obj.listFromFile(testReadPath).get(1).getIdNumber().equals("8505205678"));
        assert (obj.listFromFile(testReadPath).get(2).getIdNumber().equals("8703119012"));
        assert (obj.listFromFile(testReadPath).get(3).getFullName().equals("Mats Jåson"));
        assert (obj.listFromFile(testReadPath).get(4).getPurchaseDate().equals("2022-06-08"));

    }

    @Test
    public void WriteToFileTest() {//testen påbörjde innan övrig kod (gått fram och tillbaka innan grönt)
        // Test för kontroll av filens innhåll skrivet efter kod
        String testDay1 = "2022-09-17";
        String testDay2 = "2022-09-21";
        String testDay3 = "2022-10-05";
        Customer p1 = new Customer("6203051234", "Lena Sjö", "2022-01-31");

        obj.writeToFile(testWritePath, p1, testDay1);
        obj.writeToFile(testWritePath, p1, testDay2);
        obj.writeToFile(testWritePath, p1, testDay3);

        String fileContent = fileReader(testWritePath);
        assertTrue(fileContent.startsWith(p1.getIdNumber()));
        assertTrue(fileContent.contains(p1.getFullName()));
        assertTrue(fileContent.contains(testDay2));
        assertTrue(fileContent.endsWith(testDay3));
        assertFalse(fileContent.contains("Mats Jåson"));

        assertTrue(countLinesInFile(testWritePath) == 3);
        assertFalse(countLinesInFile(testWritePath) == 0);

    }

    public String fileReader(String fileName) {
        String res = "";
        try (Scanner scanner = new Scanner(new File(fileName))) {

            while (scanner.hasNextLine()) {
                res += scanner.nextLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return res;
    }
    public final int countLinesInFile(String fileToCount) { //Kod före test
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

