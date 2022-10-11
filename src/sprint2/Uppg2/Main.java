package sprint2.Uppg2;

import javax.swing.*;

public class Main {
    Main() {
        String input = JOptionPane.showInputDialog("Mätarställning för ett år sedan:");
        double odometerLastYear = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Mätarställning idag:");
        double odometerToday = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Total bränsleförbrukning under året:");
        double fuelTotal = Double.parseDouble(input);
        FuelCalculator fuelCalculator = new FuelCalculator(odometerLastYear, odometerToday, fuelTotal);

        System.out.println(fuelCalculator.printMe());
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
