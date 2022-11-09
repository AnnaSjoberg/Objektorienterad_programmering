package sprint4.uppg3;

import javax.swing.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.MulticastSocket;

public class Receiver extends Thread {
    MulticastSocket mcS;
    JTextArea ta;

    public Receiver(MulticastSocket mcS, JTextArea ta) {
        this.mcS = mcS;
        this.ta = ta;
    }


    @Override
    public void run() {

        while (true) {
            byte[] bytes = new byte[256];
            DatagramPacket dgP = new DatagramPacket(bytes, bytes.length);
            try {
                mcS.receive(dgP);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String output = new String(dgP.getData(), 0, dgP.getLength());
            ta.setText(ta.getText() + output + "\n");
        }
    }
}
