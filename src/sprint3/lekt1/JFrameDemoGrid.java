package sprint3.lekt1;

import javax.swing.*;
import java.awt.*;

public class JFrameDemoGrid extends JFrame {
    JLabel label = new JLabel("Don't press the button!");
    JButton button1 = new JButton("I said no!");
    JButton button2 = new JButton("Well, Okay then!");

    JFrameDemoGrid() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        add(panel);
        panel.add(label);
        panel.add(new JButton("No..."));
        panel.add(button1);
        panel.add(button2);
        pack();
        //  setSize(150,100);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        JFrameDemoGrid grid = new JFrameDemoGrid();


    }
}
