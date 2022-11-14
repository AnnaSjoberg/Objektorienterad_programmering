package sprint4.uppg5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public Client (){
        String ip = "127.0.0.1";
        int port = 12345;

        try (Socket sock = new Socket(ip,port);
             PrintWriter writer = new PrintWriter(sock.getOutputStream(),true);
             BufferedReader serverReader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
             BufferedReader userReader = new BufferedReader(new InputStreamReader(System.in))){

            String serverInput;
            String userInput;

            serverInput=serverReader.readLine();
            System.out.println(serverInput);

            while ((userInput = userReader.readLine())!=null) {
                writer.println(userInput);

                serverInput=serverReader.readLine();
                System.out.println(serverInput);
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
