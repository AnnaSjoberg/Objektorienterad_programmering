package sprint4.uppg4b;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.*;

public class Receiver extends JFrame {

    JPanel panel = new JPanel();
    JTextArea data = new JTextArea(30,20);

    public Receiver() throws IOException {
        graphicsBuilder();

        int portNo = 12345;
        MulticastSocket mcS = new MulticastSocket(portNo);
        byte[] bytes = new byte[256];
        InetAddress ipAddress = InetAddress.getByName("234.235.236.237");

        InetSocketAddress group = new InetSocketAddress(ipAddress,portNo);
        NetworkInterface netIF = NetworkInterface.getByName("wlan1");

        mcS.joinGroup(group,netIF);

        while (true){
            DatagramPacket dgP = new DatagramPacket(bytes, bytes.length);
            mcS.receive(dgP);
            String output = new String(dgP.getData(), 0, dgP.getLength());
            data.setText(data.getText() + output + "\n");
        }
    }

    void graphicsBuilder (){

        panel.setBackground(Color.gray);
        data.setBackground(Color.lightGray);
        add(panel);
        panel.add(data);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) throws IOException {
        Receiver r = new Receiver();
    }
}
