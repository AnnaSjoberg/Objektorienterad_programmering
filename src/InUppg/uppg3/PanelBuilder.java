package InUppg.uppg3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class PanelBuilder extends JFrame {

    public JPanel gamePanel (List<JButton> list){
        JPanel res = new JPanel(new GridLayout(4,4));
        for (JButton button:list) {
            res.add(button);
        }
        return res;
    }

    public JPanel gamePanelFromList (List<JButton> list){ //alt ifall man använder en lista för att lagra knapparna ist för arrayen
        JPanel panel = new JPanel(new GridLayout(4,4));
        for (JButton button:list) {
            panel.add(button);
        }
        return panel;
    }

}
