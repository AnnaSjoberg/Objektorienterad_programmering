package InUppg.Uppg2;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOHandling {

    public static List<Customer> listFromFile(String fileName) {
        Path inputFilePath = Paths.get(fileName);
        String firstLine;
        String secondLine;
        List<Customer> entriesFromFile = new ArrayList<>();
        String[] splitFirstLine;

        try (Scanner readScanner = new Scanner(inputFilePath)) {  //try w resources
            while (readScanner.hasNext()) {
                firstLine = readScanner.nextLine();
                splitFirstLine = firstLine.split(",");
                secondLine = readScanner.nextLine();
                Customer tempCustomer = new Customer(splitFirstLine[0].trim(), splitFirstLine[1].trim(),
                                                        secondLine.trim());
                entriesFromFile.add(tempCustomer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return entriesFromFile;
    }

    public static void writeToFile(String fileName, Customer customer, String date) {

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {        //try w resources
            String temp = customer.getIdNumber() + ", " + customer.getFullName() + "\t\t" + date + "\n";
            writer.append(temp);
        } catch (FileNotFoundException e) {
            System.out.println("Filen kan inte hittas");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Okänt IO-fel");
            e.printStackTrace();
        }
    }
}
