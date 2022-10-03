package InUppg.Uppg1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<WateringInfo> vatteninfo = new ArrayList<>();
        PalmTree laura = new PalmTree("Laura", "Hugo", 5, false);
        Cactus igge = new Cactus("Igge", "Ture", true);
        CarnivorousPlant meatloaf = new CarnivorousPlant("Meatloaf", "Theo", 0.7, "Rosa");
        PalmTree putte = new PalmTree("Putte", "Viggo", 1, true);
    }
}

/*
Kaktusen Igge, 20 cm hög                        2 cl = 0,02 l
• Palmen Laura, 5 meter hög             Formel: mängd = höjd * 0,5 (liter)
• Köttätande växten Meatloaf, 0,7 meter hög         Formel: mängd = 0,1 + 0,2*höjd (liter)
• Palmen Putte, 1 meter hög


Tanke för att lösa själva utskriftsfunktionen.
Lagra alla växterna i en lista.
Ta in namnet från dialogrutan
Jämför med alla växterna i listan
när man hittat den som matchar skrivs den mängd vatten ut som just den ska ha, samt vilken typ
 */