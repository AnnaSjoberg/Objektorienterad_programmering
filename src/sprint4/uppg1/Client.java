package sprint4.uppg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
//receiver
    String ipString = "127.0.0.1";
    int port = 33333;
    public Client (){
        try (Socket sock = new Socket(ipString,port );
             BufferedReader bRead = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        ) {
            String input;
            while ((input=bRead.readLine())!=null){
                System.out.println(input);
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        Client client = new Client();
    }
}
