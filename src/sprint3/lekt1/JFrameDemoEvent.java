package sprint3.lekt1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDemoEvent extends JFrame implements ActionListener {
    JLabel label = new JLabel("Don't press the button!");
    JButton button = new JButton("OK");

    JFrameDemoEvent() {
        JPanel panel = new JPanel();
        button.addActionListener(this);
        add(panel);

        panel.add(label);
        panel.add(button);

        pack();
        //  setSize(150,100);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (label.getText().equalsIgnoreCase("Don't press the button!")) {
            label.setText("No...");
            button.setText("Buzzkill");
        } else if (label.getText().equalsIgnoreCase("No...")) {
            label.setText("I said NO!");
            button.setText("Fine!");
        }else {
            label.setText("I give up!");
            button.setText("I win!");
        }
    }

        public static void main (String[]args){
            JFrameDemoEvent demo = new JFrameDemoEvent();


        }

    }
