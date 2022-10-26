package sprint3.uppg6;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;

public class OurFocusListener implements FocusListener {


    @Override
    public void focusGained(FocusEvent e) {
        e.getComponent().setBackground(Color.BLUE);
    }

    @Override
    public void focusLost(FocusEvent e) {
        e.getComponent().setBackground(Color.gray);
    }
}
