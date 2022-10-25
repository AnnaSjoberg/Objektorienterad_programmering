package sprint3.uppg1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OurActionListener implements ActionListener {
    JLabel label;
    public OurActionListener (JLabel label){
        this.label=label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setIcon(new ImageIcon("/Users/HP/OneDrive - Nackademin AB/OOP/bilder/z2.jpg"));
    }
}
