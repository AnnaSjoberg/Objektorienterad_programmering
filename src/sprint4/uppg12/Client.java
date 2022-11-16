package sprint4.uppg12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends JFrame implements ActionListener {
    private JButton button = new JButton("Leave chat");
    private JTextArea area = new JTextArea();
    private JTextField field = new JTextField();
    String username;
    String ipAddr = "localhost";
    int port = 12345;
    private PrintWriter pwOut;
    private BufferedReader brIn;

    public Client() {
        username= JOptionPane.showInputDialog("Enter your chosen user name:").trim();
        buildPanel();

        try{
            Socket socket = new Socket(ipAddr,port);
            pwOut = new PrintWriter(socket.getOutputStream(), true);
            brIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String fromServer;
            while ((fromServer=brIn.readLine())!=null){
                area.append(fromServer + "\n");
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void buildPanel() {
        setLayout(new BorderLayout());
        setTitle(username);
        add(button, BorderLayout.NORTH);
        add(area, BorderLayout.CENTER);
        add(field, BorderLayout.SOUTH);
        area.setEditable(false);
        field.addActionListener(this);
        button.addActionListener(this);

        setVisible(true);
        setSize(300, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String input = username + ": ";
        if(e.getSource()==button){
            //skicka att personen lämnar
            input += "HAS LEFT THE BUILDING";
            pwOut.println(input);
            System.exit(0);
        }else {
            input += field.getText().trim();
            pwOut.println(input);
            field.setText("");
        }


    }

    public static void main(String[] args) {
        Client c = new Client();
    }
}
