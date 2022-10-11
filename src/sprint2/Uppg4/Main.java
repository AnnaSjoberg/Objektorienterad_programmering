package sprint2.Uppg4;

import java.util.Scanner;

public class Main {
    Scanner scanner= new Scanner(System.in);

    Main (){
        System.out.println("Ange mätarställningen för ett år sedan: ");
        double odometerLastYear = scanner.nextDouble();
        System.out.println("Ange mätarställningen idag: ");
        double odometerToday = scanner.nextDouble();
        System.out.println("Ange din totala bensinförbrukning: ");
        double fuelTotal = scanner.nextDouble();

        FuelCalculator fuelCalculator = new FuelCalculator(odometerLastYear,odometerToday,fuelTotal);
        System.out.println(fuelCalculator.fullMessage());
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
/*
Skriv ett program som beräknar och skriver ut hur många mil en bil har gått under det senaste året och
dessutom beräknar bilens genomsnittliga bensinförbrukning. Indata till programmet ska vara dagens
mätarställning, mätarställningen för ett år sedan samt antal liter bensin som förbrukats under året.
Använd klassen JOptionPane för att läsa in data.
Utskriften ska ske i kommandofönstret och ha format enligt följande:
Antal körda mil: 1487.0
Antal liter bensin: 1235.4
Förbrukning per mil: 0.83
Skriv testerna innan du skriver koden. Du ska minst ha gjort tester för de beräkningar som görs i
programmet och för att utskrifterna följer specifikationen ovan.

Uppgift 4 – Bensinförbrukning med Scanner
Kopiera uppgift 2 (inklusive tester). Du ska nu refaktorera ditt program så att du använder Scanner,
som läser från System.in, istället för JOptionPane
 */