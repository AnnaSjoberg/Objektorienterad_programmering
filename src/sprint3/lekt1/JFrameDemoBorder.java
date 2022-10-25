package sprint3.lekt1;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.NORTH;

public class JFrameDemoBorder extends JFrame {
    JLabel label = new JLabel("Don't press the button!");
    JButton button1 = new JButton("I said no!");
    JButton button2 = new JButton("Well, Okay then!");

    JFrameDemoBorder() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        add(panel);
        panel.add(label,BorderLayout.NORTH);
        panel.add(new JButton("No..."), BorderLayout.CENTER);
        panel.add(button1,BorderLayout.SOUTH);
        panel.add(button2,BorderLayout.SOUTH);
        pack();
        //  setSize(150,100);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        JFrameDemoBorder border = new JFrameDemoBorder();


    }
}
