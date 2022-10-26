package sprint3.uppg7;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OurMouseAdapter extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        e.getComponent().setBackground(Color.red);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        e.getComponent().setBackground(Color.pink);
    }

}
