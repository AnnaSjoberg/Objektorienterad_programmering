package sprint2.Uppg9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BMain {
//Inte gjort tester för listan eller felhanteringen.
    public BMain() {
        List<Person> personsList = new ArrayList<>();

        Path readFrom = Paths.get("src/sprint2/Uppg9/Personuppgifter.txt");
        Path writeTo = Paths.get("src/sprint2/Uppg9/BTallPeople.txt");

        try (BufferedReader bReader = Files.newBufferedReader(readFrom);
             BufferedWriter bWriter = Files.newBufferedWriter(writeTo)) {
            String temp;

            while ((temp = bReader.readLine()) != null) {
                temp += "\n" + bReader.readLine();

                personsList = addToList(temp);

                for (Person p:personsList) {
                    if (isOver2Meters(p.getHeight())){
                        bWriter.write(p.getFullInformation());
                        bWriter.newLine();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Person> addToList(String fromFile) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(fromFile));
        return list;
    }
    public boolean isOver2Meters(int input) {
        return input >= 200;
    }

    public static void main(String[] args) {
        BMain main = new BMain();
    }
}
/*
För att jobba på bästa objektorienterade sätt:
• Skapa upp en klass ”Person”
• Tillverka en List<Person> där du skapar upp en instans av Personuppgift för varje person i
filen, och lägger in i listan
• Sök igenom listan för att hitta de långa personerna.
• Skriv testerna först och koden sen.
 */