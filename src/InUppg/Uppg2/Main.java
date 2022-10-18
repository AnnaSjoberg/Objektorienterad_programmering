package InUppg.Uppg2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public Main() {
        //skapa en lista med alla personer från filen
        //skicka personlistan för att skapa en medlemslista i member?
        //kunna ta in namn/p-nr och jämföra med medlemslistan  <---- Här borde jag också få in något om ifall det är test.
        //skriva träningstillfällena i PT-filen egen klass för PT?? eller räcker det att göra detta här?

        String filePath = "src/InUppg/Uppg2/customers.txt";
        List<PreviousCustomer> fileIntoList = IOHandling.listFromFile(filePath);
        List<PreviousCustomer> membersList = Member.ceateAllMembersList(fileIntoList);


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