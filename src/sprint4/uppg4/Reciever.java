package sprint4.uppg4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Reciever {

    public Reciever() throws IOException {
        int portNo = 12345;
        DatagramSocket dgS = new DatagramSocket(portNo);
        byte[] bytes = new byte[256];

        while (true){
            DatagramPacket dgP = new DatagramPacket(bytes, bytes.length);
            dgS.receive(dgP);
            String output = new String(dgP.getData(), 0, dgP.getLength());
            System.out.println(output);
        }
    }

    public static void main(String[] args) throws IOException {
        Reciever r = new Reciever();
    }
}
