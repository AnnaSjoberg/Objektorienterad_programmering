package sprint2.Uppg9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AMain {
    public AMain() {
        Path readFrom = Paths.get("src/sprint2/Uppg9/Personuppgifter.txt");
        Path writeTo = Paths.get("src/sprint2/Uppg9/tallPeople.txt");

        try (BufferedReader bReader = Files.newBufferedReader(readFrom);
             BufferedWriter bWriter = Files.newBufferedWriter(writeTo)) {
            String temp;

            while ((temp = bReader.readLine()) != null) {
                temp += "\n" + bReader.readLine();

                int tempHeight = heightToInt(temp);

                if(isOver2Meters(tempHeight)){
                    bWriter.write(temp);
                    bWriter.newLine();
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public int heightToInt(String input) {

        String heightString = input.substring(input.lastIndexOf(' '));

        int height = Integer.parseInt(heightString.trim());
        return height;
    }

    public boolean isOver2Meters(int input) {
        return input > 200;
    }

    public static void main(String[] args) {
        AMain main = new AMain();
    }

}
/*
Uppgift 9a – Inläsning/skrivning till fil
Ladda ner filen personuppgifter.txt från Nackademins portal.
Filen innehåller personuppgifter. För varje person står personens namn, adress och på nästa rad
personens ålder, längd och vikt. Du ska läsa in filen i ditt program och hitta alla personer som är
längre än 2 meter.
Skapa sedan en ny textfil som bara innehåller uppgifterna för de långa personerna.
Både infilens och utfilens namn ska läsas in av programmet.
Använd try-with-resources
Exempel på personpost i infilen:
Kalle Nilsson, Xvägen 1, 12345 Ystad
25, 80, 175
 */