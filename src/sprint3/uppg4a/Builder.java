package sprint3.uppg4a;

import javax.swing.*;
import java.awt.*;

public class Builder extends JFrame {
    private JLabel l;
    private JTextField tf;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JTextArea ta;

    public Builder(JLabel l, JTextField tf, JButton b1, JButton b2, JButton b3, JButton b4, JTextArea ta) {
        this.l = l;
        this.tf = tf;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.ta = ta;
    }

    public JPanel buildTopPanel() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 6));
        p.add(l);
        p.add(tf);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        return p;
    }

    public JScrollPane buildScrollPane() {
        ta.setRows(10);
        ta.setColumns(50);
        ta.setFont(new Font("Monospaced", Font.PLAIN, 14));
        return new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }
}
