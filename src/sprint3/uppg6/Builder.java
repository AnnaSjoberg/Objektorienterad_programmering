package sprint3.uppg6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Builder extends JFrame {
    protected JButton b1;
    protected JButton b2;
    protected JTextField tf;
    protected JPanel panel = new JPanel();

    public Builder(JButton b1, JButton b2, JTextField tf) {

        this.b1 = b1;
        this.b2 = b2;
        this.tf = tf;
    }

    public JPanel buildPanel() {
        JPanel res = new JPanel();
        res.setLayout(new BorderLayout());
        res.add(tf, BorderLayout.CENTER);
        res.add(b1, BorderLayout.WEST);
        res.add(b2, BorderLayout.EAST);
        addWindowListener(windowListener);

        return res;
    }

    WindowAdapter windowListener = new WindowAdapter() {
        @Override
        public void windowActivated(WindowEvent e) {
            tf.requestFocus();
        }
    };
}
