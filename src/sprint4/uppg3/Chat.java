package sprint4.uppg3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;

public class Chat extends JFrame implements ActionListener {
    JButton leaveButton = new JButton("Leave chat");
    JTextField textField = new JTextField();
    JTextArea textArea = new JTextArea();
    String name;
    InetAddress toAddress;
    int portNo = 23456;
    MulticastSocket mcS;

    public Chat() throws IOException {

        setUpNetwork();

        name = JOptionPane.showInputDialog("Enter your name:");
        if (name == null || name.length() == 0) {
            System.exit(0);
        }
        name = name.toUpperCase().trim();

        PanelBuilder pb = new PanelBuilder();
        pb.buildPanel(leaveButton, textArea, textField, name);
        leaveButton.addActionListener(this);
        textField.addActionListener(this);

        Receiver receiver = new Receiver(mcS, textArea);
        receiver.start();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = name + ": ";
        if (e.getSource() == leaveButton) {
            input += "HAS LEFT THE BUILDING";
            send(input);
            System.exit(0);
        } else {
            input += textField.getText().trim();
            send(input);
            textField.setText("");
        }
    }

    public void setUpNetwork() throws IOException {
        toAddress = InetAddress.getByName("234.235.236.237");
        InetSocketAddress group = new InetSocketAddress(toAddress, portNo);
        NetworkInterface netIF = NetworkInterface.getByName("wlan1");
        mcS = new MulticastSocket(portNo);
        mcS.joinGroup(group, netIF);
    }

    public void send(String input){
        byte[] dataAsBytes = input.getBytes();
        DatagramPacket dgP = new DatagramPacket(dataAsBytes, dataAsBytes.length, toAddress, portNo);
        try {
            mcS.send(dgP);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) throws IOException {
        Chat c = new Chat();
    }
}
