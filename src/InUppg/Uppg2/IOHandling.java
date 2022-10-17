package InUppg.Uppg2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOHandling {
    //klass som innehåller alla metoder som läser/skriver i fil (ink deras felhanteringar)
    //Här lägga in var för ifTest???
    public List<Person> readFromFile(String fromFile) {
        Path inputFilePath = Paths.get(fromFile);
        String firstLine;
        String secondLine;
        List<Person> personsFromFile = new ArrayList<>();

        try (Scanner readScanner = new Scanner(inputFilePath)) {
            while (readScanner.hasNext()) {
                firstLine = readScanner.nextLine();
                secondLine = readScanner.nextLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    String outputFilePath = "src/InUppg/Uppg2/ptTrackingFile.txt";
}
