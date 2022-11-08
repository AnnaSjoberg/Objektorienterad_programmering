package sprint4.uppg0;

import java.net.*;
public class InetAddressDemo
{
    public static void main(String args[]) throws UnknownHostException {
        //Mitt eget IP
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println("1 Address --- "+Address);
        System.out.println("2 Address.getHostAddress() --- " + Address.getHostAddress());
        System.out.println("3 Address.getHostName() --- "+Address.getHostName());
        System.out.println("4 Address.isMulticastAddress() --- "+Address.isMulticastAddress());

        //Loopback, pekar alltid på den egna datorn
        InetAddress loopback = InetAddress.getLoopbackAddress();
        System.out.println("5 loopback --- " +loopback);

        Address = InetAddress.getByName("192.168.68.54");
        System.out.println("6 " +Address);

        //IP till dn.se
        Address = InetAddress.getByName("dn.se");
        System.out.println(Address);

        //Ett datornamn kan ha flera IP
        InetAddress SW[] = InetAddress.getAllByName("www.hm.se");

        for (int i=0; i<SW.length; i++) {
            System.out.println(SW[i]);
        }


    }
}