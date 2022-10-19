package InUppg.Uppg22;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public Main() {
        boolean testRun = false;
        String originalFile = "src/InUppg/Uppg22/customers.txt";
        String ptTrackingFile = "src/InUppg/Uppg22/ptTrackingFile.txt"; //kan tas bort ifall jag bestämmer mig för att använda klassen Comparator som RegistrationDesk och sköter utskrifter i dialog och fil där
        List<Customer> fileIntoList = IOHandling.listFromFile(originalFile);
        RegistrationDesk registrationDesk = new RegistrationDesk(ptTrackingFile,testRun);
        while (true) {
            registrationDesk.compareVisitor(fileIntoList);
        }//kommer fortsätta tills användaren trycker på avbryt i dialogrutan
//        String visitorInput = JOptionPane.showInputDialog("Ange namn eller personnummer:").trim();
  //      Comparator comparator = new Comparator();
    //    comparator.compareVisitor(fileIntoList, visitorInput); //Detta ger utskrift i dialogruta för medlemsskap. ger dock ingen registrering i PTtracking

        /*
        for (Customer element:fileIntoList) { //ger utskrifter för (enbart) nuvarande och föredetta medlemmar. Skriver till fil
            if (element.getIdNumber().equals(visitorInput) || element.getFullName().equals(visitorInput)){
                if (element.isActiveMember()){
                    JOptionPane.showMessageDialog(null, "Giltigt årskort. Välkommen!");
                    IOHandling.writeToFile(ptTrackingFile,element, LocalDate.now().toString());
                }else {
                    JOptionPane.showMessageDialog(null, "Årskortet har gått ut. Gammal medlem");
                }
            }
        }

         */


    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}

/*
Gymet ”Best Gym Ever” har problem. Deras datasystem har kraschat och går inte att använda.
Konsulten som byggde systemet är bortrest och kan inte komma och laga systemet på flera veckor.
Dessutom har någon postat på nätet att Best Gym Evers system är sönder och att alla kan komma dit
och träna gratis, vilket har gjort att en hel del skumma typer har dykt upp.
Nu ber receptionisten dig om hjälp. Hen har lyckats rota fram en fil från hårddisken med alla kunders
namn, personnummer och när de senast betalade årsavgiften till gymmet. Hen undrar om du kan
skriva ett program där man skriver in en kunds personnummer eller namn när personen dyker upp
på gymet, sen söker programmet i filen och visar upp om kunden är en nuvarande medlem (dvs om
årsavgiften betalades för mindre än ett år sedan), en före detta kund (om årsavgiften betalades för
mer än ett år sedan) eller om personen inte finns i filen och sålunda aldrig har varit medlem och är
obehörig.
Posterna i filen vi läser från ser ut enligt följande:
7502031234, Anna Andersson
2022-05-03
8505132345, Per Persson
2019-12-29
...osv...
Filen ligger uppladdad på Nackademins portal.
Dessutom undrar gymets personlige tränare om du kan fixa att när en betalande kund dyker upp så
sparas det ner att kunden har varit och tränat, i en egen, annan fil. Detta för att personlige tränaren
ska kunna fortsätta tracka hur ofta klienterna tränar. (Vi kan anta att om en kund kommer till
gymmet tränar hen, även om personen egentligen bara sitter i loungen och käkar banan). Tränaren
behöver veta namn, personnummer och datum när kunden var på gymmet (så detta ska alltså sparas
i hens fil).
 */