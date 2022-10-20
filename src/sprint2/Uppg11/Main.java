package sprint2.Uppg11;

public class Main {
    Main() {
        VideoTape tape;
        TVProgram program;
        boolean test = false;

        Interaction interaction = new Interaction(test);
        interaction.setInputForVideoTape(null);
        interaction.setInputForTVProgram(null);
        System.out.println(interaction.compileMessage());

    }


    public static void main(String[] args) {
        Main main = new Main();
    }
}
/*
Uppgift 11 – Videobandspelare
Förr när man fortfarande spelade in film på videoband var det ibland svårt att veta om ett kommande
tv-program skulle få plats på bandet.
Skriv ett program som hjälper oss räkna ut om ett band kommer att räcka eller inte.
Programmet ska fråga efter videobandets längd (i minuter), hittills använd tid av bandet, den tidpunkt
då tv-programmet börjar och den tidpunkt då det slutar (anges som klockslag, tt:mm).
Använd klasserna LocalTime och Duration för att räkna ut tiden. Jobba testdrivet och skriv testerna
innan du skriver koden. Om användaren skriver in något konstigt, visa ett felmeddelande.
 */