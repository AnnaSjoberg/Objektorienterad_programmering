package sprint4.uppg1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
//sender
    public Server(){
        int port = 33333;
        try (ServerSocket serverSocket = new ServerSocket(port);
             Socket sock = serverSocket.accept();
             PrintWriter writer = new PrintWriter(sock.getOutputStream(),true)){

            String message = "Hej!";
            while (true){
                writer.println(message);
                Thread.sleep(5000);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
    }
}
