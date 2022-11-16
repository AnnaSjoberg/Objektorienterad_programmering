package sprint4.uppg12;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener {

    MultiWriter multiWriter = new MultiWriter();

    public ServerListener(){
        int port = 12345;
        try (ServerSocket serverSocket = new ServerSocket(port);){

            while (true){
                Socket clientSocket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(clientSocket,multiWriter);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        ServerListener sl = new ServerListener();
    }
}
