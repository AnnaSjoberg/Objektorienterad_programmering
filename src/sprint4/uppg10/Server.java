package sprint4.uppg10;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread{
    Protocol protocol = new Protocol();
    Socket socket;
    public Server (Socket socket){
        this.socket=socket;
    }

    public void run(){


        try(ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
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


}
