package sprint4.uppg4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SenderA {

    public SenderA() throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Location: ");
        String city = sc.next().trim();

        int portNo = 12345;
        InetAddress toAddress = InetAddress.getLocalHost();
        DatagramSocket dgS = new DatagramSocket();

        while (true) {

            System.out.println("Temperature: ");
            String temp = sc.next().trim();
            String concatString = city + " " + temp;
            byte[] dataAsBytes =concatString.getBytes();
            DatagramPacket dgP = new DatagramPacket(dataAsBytes,dataAsBytes.length,toAddress,portNo);
            dgS.send(dgP);

            Thread.sleep(15000);
        }
    }

/*
Låt sensorprogrammet först fråga användaren efter vilken stad hen befinner sig i. Läs sedan in de
temperaturer användaren skriver från kommandoraden och skicka stadens namn och temperaturen till
mottagaren
 */

    public static void main(String[] args) throws IOException, InterruptedException {
        SenderA a = new SenderA();
    }
}
