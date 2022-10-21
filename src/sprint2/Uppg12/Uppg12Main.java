package sprint2.Uppg12;

import java.util.List;
import java.util.Scanner;

public class Uppg12Main {

    Uppg12Main(){

        Car car1 = new Car(50, 1295, 6, 3, 4);
        Car car2 = new Car(10, 1495, 5, 1, 4);
        Boat boat1 = new Boat(5, 500, 750);
        Boat boat2 = new Boat(10, 425, 950);
        Bicycle bike1 = new Bicycle(25, 15, 3, 2,3);
        Bicycle bike2 = new Bicycle(30, 20, 14, 8,2);
        Train train1 = new Train(300, 5000, 6);
        Train train2 = new Train(170, 15000, 15);

        List<Vehicle> vehicles = List.of(car1,car2,bike1,bike2,boat1,boat2,train1,train2);

        Serializer serializer = new Serializer(vehicles);
        Deserializer deserializer = new Deserializer();
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