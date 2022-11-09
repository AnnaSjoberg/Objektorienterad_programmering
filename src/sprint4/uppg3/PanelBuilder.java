package sprint4.uppg3;

import javax.swing.*;
import java.awt.*;

public class PanelBuilder extends JFrame {

    public void buildPanel(JButton button, JTextArea area, JTextField field, String name) {
        setLayout(new BorderLayout());
        setTitle(name);
        add(button, BorderLayout.NORTH);
        add(area, BorderLayout.CENTER);
        add(field, BorderLayout.SOUTH);
        setVisible(true);
        setSize(300, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
