package sprint3.uppg13;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main13 {
    Medicine m1;
    Medicine m2;
    Medicine m3;
    Medicine m4;
    Medicine m5;

    public Main13() {
        List<String> inputList = new ArrayList<>();
        String temp;
        int counter = 1;
        while (counter <= 5) {
            temp = JOptionPane.showInputDialog("Ange namn och tidsintervall för preparat nr " + counter++ + ":");
            if (temp == null) {
                break;
            }
            inputList.add(temp);
        }
        while (true) {
            try {
                String[] splitString;
                splitString = inputList.get(0).split(",");
                m1 = new Medicine(splitString[0].trim(), Integer.parseInt(splitString[1].trim()));
                splitString = inputList.get(1).split(",");
                m2 = new Medicine(splitString[0].trim(), Integer.parseInt(splitString[1].trim()));
                splitString = inputList.get(2).split(",");
                m3 = new Medicine(splitString[0].trim(), Integer.parseInt(splitString[1].trim()));
                splitString = inputList.get(3).split(",");
                m4 = new Medicine(splitString[0].trim(), Integer.parseInt(splitString[1].trim()));
                splitString = inputList.get(4).split(",");
                m5 = new Medicine(splitString[0].trim(), Integer.parseInt(splitString[1].trim()));
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }

        temp = JOptionPane.showInputDialog("Hur länge ska du behandlas?");
        int duration = Integer.parseInt(temp) * 1000;

        m1.start();
        if (m2 != null) {
            m2.start();
        }
        if (m3 != null) {
            m3.start();
        }
        if (m4 != null) {
            m4.start();
        }
        if (m5 != null) {
            m5.start();
        }
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        m1.interrupt();
        if (m2 != null) m2.interrupt();
        if (m3 != null) m3.interrupt();
        if (m4 != null) m4.interrupt();
        if (m5 != null) m5.interrupt();


    }


    public static void main(String[] args) {
        Main13 m13 = new Main13();
    }
}
/*
Skriv ett program som (i mycket tidskomprimerad form) skriver ut när en person ska ta sina
mediciner.
Gör meddelanderutor som först frågar efter medicintyp och sedan efter hur många gånger per minut
medicinen ska tas. (det går också bra att fråga och svara i consolen)
Låt medicinerna representeras av en klass ”Medicine” som ärver Thread
Starta en ny tråd för varje medicintyp som skriver ut medicinens namn, samt när den ska tas, på
System.out
 */