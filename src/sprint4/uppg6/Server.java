package sprint4.uppg6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public Server(){
        Database database = new Database();
        int port = 12345;
        try(ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            BufferedReader bRead = new BufferedReader(new InputStreamReader(socket.getInputStream()))){

            out.writeObject("Connection established. Enter your search: ");
            String userRequest;

            while ((userRequest = bRead.readLine())!=null){
                Buddy dbResponse = database.getBuddy(userRequest.trim());
                if (dbResponse == null) {
                    out.writeObject("Not found in phonebook");
                }else {
                    out.writeObject(dbResponse);
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        Server server = new Server();
    }
}
