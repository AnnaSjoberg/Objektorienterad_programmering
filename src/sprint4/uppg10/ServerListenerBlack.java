package sprint4.uppg10;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListenerBlack {
    public ServerListenerBlack(){
        int port = 12345;
        try (ServerSocket serverSocket = new ServerSocket(port);){

            while (true){
                Socket socket = serverSocket.accept();
                Server server = new Server(socket);
                server.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        ServerListenerBlack sl = new ServerListenerBlack();
    }
}
