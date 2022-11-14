package sprint4.uppg8;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public Client() {
        String ip = "127.0.0.1";
        int port = 12345;

        try (Socket sock = new Socket(ip, port);
             ObjectOutputStream outStream = new ObjectOutputStream(sock.getOutputStream());
             ObjectInputStream serverInStream = new ObjectInputStream((sock.getInputStream()))){

            Object serverInput;
            String userInput;
            BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));

            while ((serverInput = serverInStream.readObject()) != null) {

                if (serverInput instanceof Introduction) {
                    System.out.println(((Introduction) serverInput).getGreeting());
                } else if (serverInput instanceof Response) {
                    System.out.println(((Response) serverInput).getResponse());
                }

                userInput= fromUser.readLine();

                if (serverInput != null) {
                    outStream.reset();
                    outStream.writeObject(userInput);
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
