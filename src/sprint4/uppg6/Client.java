package sprint4.uppg6;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public Client (){
        String ip = "127.0.0.1";
        int port = 12345;

        try (Socket sock = new Socket(ip,port);
             PrintWriter writer = new PrintWriter(sock.getOutputStream(),true);
             ObjectInputStream fromServer = new ObjectInputStream((sock.getInputStream()));
             BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in))){

            Object serverInput;
            String userInput;

            serverInput=fromServer.readObject();
            System.out.println(serverInput);

            while ((userInput = fromUser.readLine())!=null) {
                writer.println(userInput);

                serverInput=fromServer.readObject();

                if (serverInput instanceof Buddy){
                    Buddy sentBuddy = (Buddy) serverInput;
                    System.out.println(sentBuddy.getName() + " " + sentBuddy.getAddress() + " "
                            + sentBuddy.getPhoneNumber() + " " + sentBuddy.getbDay());
                }else if (serverInput instanceof String){
                    System.out.println(serverInput);

                }

            }


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        Client client = new Client();
    }
}
