package sprint4.uppg7;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

/*
Uppgift 7 – Telefonboken, kustomiserade objekt
Låt oss skapa en ytterligare version av vår telefonbok där vi skickar olika objekt beroende om vi bara
vill meddela att kontakten är upprättad eller som vi svarar på ett request att få data för en person
Vi behöver
• En Intro-klass som vi skickar som bekräftelse på att connection är upprättad
• En Response-klass som innehåller en bool för om en Person hittades i databasen eller inte
o Om en person hittades, lägg med Person-objektet i responset
Använd instanceof för att särskilja på Intro och Response på klientsidan.
 */

    public Server(){
        Database database = new Database();
        int port = 12345;
        try(ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream((socket.getInputStream()));) {

            Object input;
            Buddy outputBuddy;

            out.writeObject(new Introduction());

            while ((input = (String)in.readObject())!=null) {
                outputBuddy = database.getBuddy(((String) input).trim());

                if (outputBuddy == null) {
                    out.writeObject(new Response(false));
                } else {
                    out.writeObject(new Response(true, outputBuddy));
                }

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
