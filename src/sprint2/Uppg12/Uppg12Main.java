package sprint2.Uppg12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uppg12Main {


    public void printList(List<Vehicle> vehicles) {
        vehicles.forEach(deserializedList -> System.out.println(deserializedList.printMe()));
    }

    Uppg12Main() {

        ListGenerator lg = new ListGenerator();
        List<Vehicle> vehicles = lg.generateList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to call the file?");
        String fileName = scanner.next().trim();

        Serializer serializer = new Serializer();
        serializer.serializeList(vehicles, fileName);



        List<Vehicle> deserializedList = serializer.DeserializeList();

        printList(deserializedList);

    }


    public static void main(String[] args) {
        Uppg12Main main = new Uppg12Main();
    }
}
/*
Kopiera koden från uppgift 2 i Sprint 1 (Fordonen).
Gör först en funktion där du skapar en lista av olika Fordonsobjekt, som du sparar ner till fil via
Serialisering.
Sedan, i huvudprogrammet, radera de Fordonsobjekt du skapar upp.
Gör sedan en deserialiseringsfunktion där du läser upp listan av Fordonsobjekt från filen och skriver
ut
 */