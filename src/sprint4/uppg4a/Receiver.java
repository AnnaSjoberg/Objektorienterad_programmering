package sprint4.uppg4a;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver extends JFrame {

    JPanel panel = new JPanel();
    JTextArea data = new JTextArea(30,20);


    public Receiver() throws IOException {

        panel.setBackground(Color.gray);
        data.setBackground(Color.lightGray);
        add(panel);
        panel.add(data);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        int portNo = 12345;
        DatagramSocket dgS = new DatagramSocket(portNo);
        byte[] bytes = new byte[256];

        while (true){
            DatagramPacket dgP = new DatagramPacket(bytes, bytes.length);
            dgS.receive(dgP);
            String output = new String(dgP.getData(), 0, dgP.getLength());
            data.setText(data.getText() + output + "\n");
        }
    }

    public static void main(String[] args) throws IOException {
        Receiver r = new Receiver();
    }
}
