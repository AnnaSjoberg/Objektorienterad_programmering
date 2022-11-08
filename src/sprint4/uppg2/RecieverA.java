package sprint4.uppg2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class RecieverA {

    public RecieverA()throws IOException {

        int portNo = 22222;
        DatagramSocket dgSock = new DatagramSocket(portNo);
        byte[] bytes = new byte[256];

        while (true){
            DatagramPacket dgPack = new DatagramPacket(bytes, bytes.length);
            dgSock.receive(dgPack);
            String message = new String(dgPack.getData(),0,dgPack.getLength());
            System.out.println(dgPack.getAddress() + " says ~~~~ " + message);
        }

    }
    public static void main(String[] args)throws IOException {
        RecieverA a = new RecieverA();
    }
}
