package sprint4.uppg9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    Protocol protocol = new Protocol();
    public Server(){
        int port = 33333;

        try(ServerSocket serverSocket = new ServerSocket(port);
            Socket sock = serverSocket.accept();
            PrintWriter outPW = new PrintWriter(sock.getOutputStream(),true);
            BufferedReader inBR = new BufferedReader(new InputStreamReader(sock.getInputStream()))
        ){
            String output;
            String input;


            outPW.println(protocol.processInput(null));

            while ((input = inBR.readLine())!=null) {
                output = protocol.processInput(input.trim());

                outPW.println(output);

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) {
        Server s = new Server();
    }
}
