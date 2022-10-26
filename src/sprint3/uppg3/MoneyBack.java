package sprint3.uppg3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoneyBack extends JFrame implements ActionListener {

    JTextField price = new JTextField(10);
    JTextField sumPaid = new JTextField(10);

    JLabel pricePrompt = new JLabel("Varans pris: ");
    JLabel sumPaidPrompt = new JLabel("Summa överlämnade pengar: ");
    JLabel wantedUnitsPrompt = new JLabel("Vilka valörer vill du ha din växel i?");
    JLabel changeReturned = new JLabel("Växel: ");

    JCheckBox x1000 = new JCheckBox("1000-lappar", false);
    JCheckBox x500 = new JCheckBox("500-lappar", false);
    JCheckBox x200 = new JCheckBox("200-lappar", false);
    JCheckBox x100 = new JCheckBox("100-lappar", false);
    JCheckBox x50 = new JCheckBox("50-lappar", false);
    JCheckBox x20 = new JCheckBox("20-lappar", false);
    JCheckBox x10 = new JCheckBox("10-kronor", false);
    JCheckBox x5 = new JCheckBox("5-kronor", false);
    JCheckBox x2 = new JCheckBox("2-kronor", false);
    JCheckBox x1 = new JCheckBox("1-kronor", true);
    JPanel north = new JPanel();
    JPanel west = new JPanel();
    JPanel east = new JPanel();
    JPanel south = new JPanel();
    JPanel highUnits = new JPanel();
    JPanel lowUnits = new JPanel();
    public MoneyBack() {


        setLayout(new BorderLayout());


        north.setLayout(new BorderLayout());
        west.setLayout(new BorderLayout());
        east.setLayout(new BorderLayout());
        south.setLayout(new GridLayout(11,1));
        highUnits.setLayout(new GridLayout(5, 1));
        lowUnits.setLayout(new GridLayout(5, 1));

        add(west, BorderLayout.WEST);
        west.add(pricePrompt, BorderLayout.NORTH);
        west.add(sumPaidPrompt, BorderLayout.SOUTH);

        add(east, BorderLayout.EAST);
        east.add(price, BorderLayout.NORTH);
        east.add(sumPaid, BorderLayout.SOUTH);

        add(north, BorderLayout.NORTH);
        north.add(wantedUnitsPrompt, BorderLayout.NORTH);
        north.add(highUnits, BorderLayout.WEST);
        north.add(lowUnits, BorderLayout.EAST);
        highUnits.add(x1000);
        highUnits.add(x500);
        highUnits.add(x200);
        highUnits.add(x100);
        highUnits.add(x50);
        lowUnits.add(x20);
        lowUnits.add(x10);
        lowUnits.add(x5);
        lowUnits.add(x2);
       // lowUnits.add(x1);

        add(south, BorderLayout.SOUTH);
        south.add(changeReturned);

        price.addActionListener(this);
        sumPaid.addActionListener(this);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        List<Boolean> wantedUnits = new ArrayList<>();
        Calculator calculator = new Calculator();
        int change=0;
        if (obj == price || obj == sumPaid){
            Scanner scPrice = new Scanner(price.getText());
            Scanner scSumPaid = new Scanner(sumPaid.getText());

            if (scPrice.hasNextInt() && scSumPaid.hasNextInt()){
                int priceAsInt = scPrice.nextInt();
                int sumPaidAsInt = scSumPaid.nextInt();
                change = calculator.calculateChange(priceAsInt,sumPaidAsInt);
            }

            changeReturned.setText("Växel: " + change + " kr.");
            south.add(changeReturned);

            if (x1000.isSelected()){
                wantedUnits.add(true);
            } else {
                wantedUnits.add(false);
            }
            if (x500.isSelected()){
                wantedUnits.add(true);
            } else {
                wantedUnits.add(false);
            }
            if (x200.isSelected()){
                wantedUnits.add(true);
            } else {
                wantedUnits.add(false);
            }
            if (x100.isSelected()){
                wantedUnits.add(true);
            } else {
                wantedUnits.add(false);
            }
            if (x50.isSelected()){
                wantedUnits.add(true);
            } else {
                wantedUnits.add(false);
            }
            if (x20.isSelected()){
                wantedUnits.add(true);
            } else {
                wantedUnits.add(false);
            }
            if (x10.isSelected()){
                wantedUnits.add(true);
            } else {
                wantedUnits.add(false);
            }
            if (x5.isSelected()){
                wantedUnits.add(true);
            } else {
                wantedUnits.add(false);
            }
            if (x2.isSelected()){
                wantedUnits.add(true);
            } else {
                wantedUnits.add(false);
            }if (x1.isSelected()){
                wantedUnits.add(true);
            }
        }
        List<Integer> unitsList = calculator.howManyOfEach(change,wantedUnits);
        //calculationMessage.append(calculator.unitsListToString(unitsList));
        //changeReturned.setText(String.valueOf(calculationMessage));
        List<String> changeList = calculator.unitsListToString(unitsList);

        for (int i = 0; i < changeList.size(); i++) {
            //JLabel temp = new JLabel();
        }

        for (String listElement:changeList) {
            //String temp = listElement;
            JLabel temp = new JLabel(listElement);
            //changeReturned.setText();
            south.add(temp);
        }

    }

    /*
     public String unitsListToString (List<Integer> list){
        String res ="";
        String bigSuffix = "-lappar";
        String smallSuffix = "-kronor";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >0 ){

                res += list.get(i)%availableUnits.get(i) + " " + availableUnits.get(i);

                if (i <= 5){
                    res += bigSuffix;
                }else {
                    res += smallSuffix;
                }
            }
        }
        return res;
    }

     */


    public static void main(String[] args) {
        MoneyBack main = new MoneyBack();
    }
}
/*
Gör ett grafiskt program som beräknar hur mycket växel man får tillbaka när man handlar.
Ange pris på vara och hur mycket du betalar i två JTextFields
Gör checkboxar för tusenlappar, 500-lappar, 200-lappar, hundralappar, femtilappar, tjugolappar, tior,
femmor, tvåkronor och enkronor
Låt användaren checka rutorna för de valörer hen vill ha växeln i
Räkna ut hur många tusenlappar, 500-lappar, 200-lappar, hundralappar, femtilappar, tjugolappar, tior,
femmor, tvåkronor och enkronor (alltså dem som användaren har checkat) man får tillbaka.
Det går bra att återanvända kod du tidigare har skrivit.

 JTextField price
 JTextField paid

Skapa lista över de rutor som checkats. (true på indexet för den valutan, false om inte checkat)
skicka in listan i metod tillsammans med summan i växel


 */