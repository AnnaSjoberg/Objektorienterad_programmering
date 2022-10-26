package sprint3.uppg6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Fluff extends JFrame {
    protected JButton b1;
    protected JButton b2;
    protected JTextField tf;
    protected JPanel panel;

    public Fluff(JButton b1, JButton b2, JTextField tf) {

        this.b1 = b1;
        this.b2 = b2;
        this.tf = tf;
    }

    public void buildPanel() {
        setLayout(new BorderLayout());
        add(tf, BorderLayout.CENTER);
        add(b1, BorderLayout.WEST);
        add(b2, BorderLayout.EAST);
        addWindowListener(windowListener);


    }

    WindowAdapter windowListener = new WindowAdapter() {
        @Override
        public void windowActivated(WindowEvent e) {
            tf.requestFocus();
        }
    };
}
