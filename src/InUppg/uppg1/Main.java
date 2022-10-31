package InUppg.uppg1;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
    PalmTree laura = new PalmTree("Laura", "Hugo", 5, false); //inkapsling i sub- och superklass
    Cactus igge = new Cactus("Igge", "Theo", true);
    CarnivorousPlant meatloaf = new CarnivorousPlant("Meatloaf", "Ture", 0.7, "Rosa");
    PalmTree putte = new PalmTree("Putte", "Viggo", 1, true); //alla ovanstående ärver Plant

    List<WateringInfo> vatteninfo = new ArrayList<>(); //WateringInfo = Interface som implementeras av superklassen

    Main() { //Huvudklassens konstruktor
        vatteninfo.add(laura);
        vatteninfo.add(igge);
        vatteninfo.add(meatloaf);
        vatteninfo.add(putte);

        while (true) {
            String inputName = JOptionPane.showInputDialog("Vilken växt vill du vattna?");
            if (inputName == null) {
                JOptionPane.showMessageDialog(null, "Programmet avslutas.");
                System.exit(0);
            }
            inputName = inputName.trim();
            boolean foundItem = false;
            for (WateringInfo element : vatteninfo) {
                if (inputName.equalsIgnoreCase(element.name())) {
                    JOptionPane.showMessageDialog(null, element.printOut()); //Polymorfism printOut
                    foundItem = true;
                }
            }
            if (!foundItem) { //Inmatat namn återfinns inte i listan över växter.
                JOptionPane.showMessageDialog(null, "Växten finns inte på hotellet.");
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}