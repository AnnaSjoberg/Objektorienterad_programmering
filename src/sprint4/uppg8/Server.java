package sprint4.uppg8;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public Server(){
       Protocol protocol = new Protocol();
        int port = 12345;
        try(ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream((socket.getInputStream()));) {

            Object inputObj;
            Object outputObj;

            out.writeObject(protocol.processInput(null));

            while ((inputObj = (String)in.readObject())!=null) {
                outputObj = protocol.processInput(((String) inputObj).trim());
                out.reset();
                out.writeObject(outputObj);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        Server server = new Server();
    }
}
