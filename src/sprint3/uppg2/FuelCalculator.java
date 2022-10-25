package sprint3.uppg2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class FuelCalculator extends JFrame implements ActionListener {
    JTextField jtf1 = new JTextField();
    JTextField jtf2 = new JTextField();
    JTextField jtf3 = new JTextField();
    JLabel jl1 = new JLabel("Odometer today:");
    JLabel jl2 = new JLabel("Odometer one year ago:");
    JLabel jl3 = new JLabel("Total fuel consumption:");
    JLabel jl4 = new JLabel(" ");
    JLabel jl5 = new JLabel(" ");
    JLabel jl6 = new JLabel(" ");

    public FuelCalculator() {

        setLayout(new GridLayout(2, 1));
        JPanel northPanel = new JPanel();
        JPanel southPanel = new JPanel();

        add(northPanel);
        add(southPanel);


        northPanel.setLayout(new GridLayout(3, 2));
        northPanel.add(jl1);
        northPanel.add(jtf1);
        northPanel.add(jl2);
        northPanel.add(jtf2);
        northPanel.add(jl3);
        northPanel.add(jtf3);


        jtf1.addActionListener(this);
        jtf2.addActionListener(this);
        jtf3.addActionListener(this);

        southPanel.setLayout(new FlowLayout());
        southPanel.add(jl4);//add calc
        southPanel.add(jl5);//add calc
        southPanel.add(jl6);//add calc

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    protected double getYearlyDistance(double today, double old) {
        return today - old;
    }

    protected double getMeanConsumption(double distance, double fuelTotal) {
        return fuelTotal / distance;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jtf1 || ae.getSource() == jtf2 || ae.getSource() == jtf3) {

            try {
                double odoToday = Double.parseDouble(jtf1.getText());
                double odoOld = Double.parseDouble(jtf2.getText());
                double fuelCons = Double.parseDouble(jtf3.getText());


                jl4.setText(String.format("Kilometers driven: %8.0f ", getYearlyDistance(odoToday, odoOld)));
                jl5.setText(String.format("Total fuel consumption: %7.1f ", fuelCons));
                jl6.setText(String.format("Mean fuel consumption: %1.2f ",
                        getMeanConsumption(getYearlyDistance(odoToday, odoOld), fuelCons)));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        FuelCalculator fc = new FuelCalculator();
    }
}
