package sprint4.uppg5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public Server(){
        Database database = new Database();
        int port = 12345;
        try(ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader bRead = new BufferedReader(new InputStreamReader(socket.getInputStream()))){

            writer.println("Connection established. Enter your search: ");
            String respone;

            while ((respone = bRead.readLine())!=null){
                writer.println(database.getBuddy(respone.trim()));

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        Server server = new Server();
    }
}
