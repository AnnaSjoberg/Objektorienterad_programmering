package InUppg.Uppg2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOHandling {
    //klass som innehåller alla metoder som läser/skriver i fil (ink deras felhanteringar)
    //Här lägga in var för ifTest???
    public List<Person> readFromFile(String fileName) {
        Path inputFilePath = Paths.get(fileName);
        String firstLine;
        String secondLine;
        List<Person> personsFromFile = new ArrayList<>();
        String[] splitFirstLine = new String[2];

        try (Scanner readScanner = new Scanner(inputFilePath)) {
            while (readScanner.hasNext()) {
                firstLine = readScanner.nextLine();
                splitFirstLine = firstLine.split(",");
                secondLine = readScanner.nextLine();
                Person temp = new Person(splitFirstLine[0].trim(), splitFirstLine[1].trim(), secondLine.trim());
                personsFromFile.add(temp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return personsFromFile;
    }

    public void writeToFile(String fileName, Person person, String date) {

//Printwriter pw = new Printwriter(new Filewriter(minFil, true))
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName,true))) {
            String temp = person.getIdNumber() + ", " + person.getFullName() + "\n" + date + "\n";
            writer.append(temp);
            writer.close();


        } catch (FileNotFoundException e) {
            System.out.println("Filen kan inte hittas");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Okänt IO-fel");
            e.printStackTrace();
        }

    }


//obj.writeToFile(testWritePath, Person person, String date);


}
