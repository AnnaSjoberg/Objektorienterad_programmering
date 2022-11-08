package sprint4.uppg4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SenderC  extends JFrame implements ActionListener {
    JPanel inputPanel = new JPanel();
    JTextField inputField =new JTextField("",15);
    JButton submit = new JButton("Submit");

    String city;
    String temp ="";
    String concatString = "";


    int portNo = 12345;
    InetAddress toAddress = InetAddress.getLocalHost();
    DatagramSocket dgS = new DatagramSocket();

    public SenderC() throws IOException, InterruptedException {
        city = JOptionPane.showInputDialog("Location: ").toUpperCase().trim();
        if (city == null || city.length()==0){
            System.exit(0);
        }

        setTitle(city);
        add(inputPanel);
        submit.setBackground(Color.red);
        inputPanel.add(inputField);
        inputPanel.add(submit);
        inputPanel.setBackground(Color.pink);
        submit.addActionListener(this);
        inputField.addActionListener(this);

        pack();
        setLocation(1100,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        temp = inputField.getText().trim();
        concatString = city + ":\t" + temp + "\u00B0C";

        byte[] dataAsBytes =concatString.getBytes();
        DatagramPacket dgP = new DatagramPacket(dataAsBytes,dataAsBytes.length,toAddress,portNo);
        try {
            dgS.send(dgP);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        inputField.setText("");

    }
/*
Låt sensorprogrammet först fråga användaren efter vilken stad hen befinner sig i. Läs sedan in de
temperaturer användaren skriver från kommandoraden och skicka stadens namn och temperaturen till
mottagaren
 */

    public static void main(String[] args) throws IOException, InterruptedException {
        SenderC c = new SenderC();
    }
}
