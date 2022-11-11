package sprint4.uppg4b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Sender extends JFrame implements ActionListener {
    JPanel inputPanel = new JPanel();
    JTextField inputField = new JTextField("", 15);
    JButton submit = new JButton("Submit");

    String city;
    String temp = "";
    String concatString = "";


    int portNo = 12345;
    InetAddress toAddress = InetAddress.getByName("234.235.236.237");
    MulticastSocket mcS = new MulticastSocket();

    public Sender() throws IOException {
        city = JOptionPane.showInputDialog("Location: ");
        if (city == null || city.length() == 0) {
            System.exit(0);
        }
        city = city.toUpperCase().trim();

        graphicsBuilder();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        temp = inputField.getText().trim();
        concatString = city + ":\t" + temp + "\u00B0C";

        byte[] dataAsBytes = concatString.getBytes();
        DatagramPacket dgP = new DatagramPacket(dataAsBytes, dataAsBytes.length, toAddress, portNo);
        try {
            mcS.send(dgP);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        inputField.setText("");

    }

    void graphicsBuilder (){

        setTitle(city);
        add(inputPanel);
        submit.setBackground(Color.yellow);
        inputPanel.add(inputField);
        inputPanel.add(submit);
        inputPanel.setBackground(Color.orange);
        submit.addActionListener(this);
        inputField.addActionListener(this);

        pack();
        setLocation(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) throws IOException, InterruptedException {
        Sender a = new Sender();
    }
}
