package InUppg.uppg3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class PanelBuilder extends JFrame {

    public JPanel gamePanel (JButton[][] buttons){
        JPanel res = new JPanel(new GridLayout(4,4));

        res.add(buttons[0][0]);
        res.add(buttons[0][1]);
        res.add(buttons[0][2]);
        res.add(buttons[0][3]);
        res.add(buttons[1][0]);
        res.add(buttons[1][1]);
        res.add(buttons[1][2]);
        res.add(buttons[1][3]);
        res.add(buttons[2][0]);
        res.add(buttons[2][1]);
        res.add(buttons[2][2]);
        res.add(buttons[2][3]);
        res.add(buttons[3][0]);
        res.add(buttons[3][1]);
        res.add(buttons[3][2]);
        res.add(buttons[3][3]);

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
