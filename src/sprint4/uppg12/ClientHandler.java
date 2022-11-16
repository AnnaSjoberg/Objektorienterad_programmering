package sprint4.uppg12;

import java.io.*;
import java.net.Socket;

public class ClientHandler extends Thread {
    private Socket socket;
    private MultiWriter multiWriter;

    public ClientHandler(Socket socket, MultiWriter multiWriter) {
        this.socket = socket;
        this.multiWriter = multiWriter;
    }

    public void run() {
        try (PrintWriter pwOut = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader brIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {

            String connection = brIn.readLine();
            for (PrintWriter writer : multiWriter.getAllWriters()) {
                writer.println(connection + " has joined the chat");
            }
            multiWriter.addWriterToList(pwOut);

            String message;
            while ((message = brIn.readLine().trim()) != null) {
                if (message.endsWith("has left the chat")) {
                    multiWriter.removeWriterFromList(pwOut);
                    //return;
                }
                for (PrintWriter writer : multiWriter.getAllWriters()) {
                    if (!writer.equals(pwOut)) {
                        writer.println(message);
                    }
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
