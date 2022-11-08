package sprint4.uppg2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

public class SenderA {

    public SenderA() throws IOException, InterruptedException {
        List<String> quotes = List.of("Att skiljas är adjö en smula", "Chocolate is optional", "Övning ger träning",
                                      "Nu är det många runt honom", "Gotta catch'em all");
        int portNo = 22222;
        InetAddress toAddress = InetAddress.getLocalHost();
        DatagramSocket dgSock = new DatagramSocket();

        while(true) {
            byte[] qAsBytesArray = quotes.get((int)(Math.random()*quotes.size())).getBytes();
            DatagramPacket dgPack = new DatagramPacket(qAsBytesArray, qAsBytesArray.length, toAddress, portNo);
            dgSock.send(dgPack);
            Thread.sleep(60000);
        }

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        SenderA a = new SenderA();
    }
}
