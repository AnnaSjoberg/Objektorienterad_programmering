package sprint2.Uppg5;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static javax.swing.JOptionPane.*;

/*
Lägg till den felhantering som behövs.
Fel som behöver fångas upp är
• Om användaren skriver in något annat än siffror där programmet läser in int eller double
• Om användaren skriver in för få parametrar och trycker ”OK”.
Använd exceptions.
 */
public class Main {
    int antalDagar = 0;
    double dagsPris = 0;
    String bil = "";

    Main() {
        String indata = showInputDialog("Ange antal dagar, pris per dag samt bilmodell");
        while (true) {
            if (indata == null) {
                System.exit(0);
            }
            Scanner sc = new Scanner(indata);
            try {
                antalDagar = sc.nextInt();
                 dagsPris = sc.nextDouble();
                 bil = sc.next();

                break;
            } catch (InputMismatchException e) {
                e.printStackTrace();
                indata = showInputDialog("Fel typ av data, försök igen. \n" +
                        "Ange antal dagar, pris per dag samt bilmodell");
            } catch (NoSuchElementException e) {
                e.printStackTrace();
                indata = showInputDialog("För få inmatade parametrar, försök igen. \n" +
                        "Ange antal dagar, pris per dag samt bilmodell");
            } catch (Exception e) {
                e.printStackTrace();
                indata = showInputDialog("Ett oväntat fel inträffade, försök igen. \n" +
                        "Ange antal dagar, pris per dag samt bilmodell");
            }
        }
        double totPris = dagsPris * antalDagar;
        String s = String.format("Totalt pris för %s: %.2f",
                bil, totPris);
        showMessageDialog(null, s);
    }


    public static void main(String[] arg) {
        Main main = new Main();
    }
}



/*      Utan loopning tills korrekt
public static void main (String[] arg) {
        String indata = showInputDialog("Ange antal dagar, pris per dag samt bilmodell");
        Scanner sc = new Scanner(indata);
        try {
            int antalDagar = sc.nextInt();
            double dagsPris = sc.nextDouble();
            String bil = sc.next();
            double totPris = dagsPris * antalDagar;
            String s = String.format("Totalt pris för %s: %.2f",
                    bil, totPris);
            showMessageDialog(null, s);
        }catch (InputMismatchException e){
            System.out.println("InputMismatchException");
            e.printStackTrace();
        }catch (NoSuchElementException e){
            System.out.println("NoSuchElementException");
            e.printStackTrace();
        }
    }
 */