package sprint4.uppg9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public Client(){
        String ipAddr = "127.0.0.1";
        int port = 33333;

        try (Socket sock = new Socket(ipAddr,port);
             PrintWriter outPW = new PrintWriter(sock.getOutputStream(),true);
             BufferedReader fromServer = new BufferedReader(new InputStreamReader(sock.getInputStream()));
             BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));
        ){
            String serverInput;
            String userInput;

            while ((serverInput=fromServer.readLine())!=null){
                System.out.println("Server: " + serverInput);
                if (serverInput.equalsIgnoreCase("bye.")){
                    break;
                }
                if ((userInput=fromUser.readLine())!=null){
                    outPW.println(userInput);
                }
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        Client c = new Client();
    }
}
