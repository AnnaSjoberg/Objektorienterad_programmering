package InUppg.uppg3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main extends JFrame implements ActionListener {

    JLabel message = new JLabel();
    JButton newGame = new JButton("New game");


    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();
    JButton b4 = new JButton();
    JButton b5 = new JButton();
    JButton b6 = new JButton();
    JButton b7 = new JButton();
    JButton b8 = new JButton();
    JButton b9 = new JButton();
    JButton b10 = new JButton();
    JButton b11 = new JButton();
    JButton b12 = new JButton();
    JButton b13 = new JButton();
    JButton b14 = new JButton();
    JButton b15 = new JButton();
    JButton b16 = new JButton();

    List<JButton> buttonsList = new ArrayList<>();


    GameLogic g = new GameLogic();
    List<String> currentOrder = new ArrayList<>();

    // Lägga till en boolean isDemo som skickas med i anropet för att skapa currentOrder
    // så att den blir i nummerordning istället för ranodmiserad.
    public Main() {
        buttonsList = List.of(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16);
        setLayout(new BorderLayout());
        currentOrder = g.randomizeList();
        PanelBuilder panelBuilder = new PanelBuilder();
        JPanel gamePanel = panelBuilder.gamePanel(buttonsList, currentOrder);
        add(gamePanel, BorderLayout.SOUTH);

        add(newGame, BorderLayout.WEST);
        add(message, BorderLayout.EAST);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);

        //standard avslutning
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tempButton;
        int tempButtonNr = currentOrder.indexOf(((JButton) e.getSource()).getText());
        //Testa om tom knapp är till höger om klickad
        if ((e.getSource() == b1 || e.getSource() == b2 || e.getSource() == b3 ||
                e.getSource() == b5 || e.getSource() == b6 || e.getSource() == b7 ||
                e.getSource() == b9 || e.getSource() == b10 || e.getSource() == b11 ||
                e.getSource() == b13 || e.getSource() == b14 || e.getSource() == b15)
                && currentOrder.get(tempButtonNr + 1).equals("")) {

            Collections.swap(currentOrder, tempButtonNr, tempButtonNr + 1);
            interfaceUpdater();

            //Testa om tom knapp är till vänster om klickad
        } else if ((e.getSource() == b2 || e.getSource() == b3 || e.getSource() == b4 ||
                e.getSource() == b6 || e.getSource() == b7 || e.getSource() == b8 ||
                e.getSource() == b10 || e.getSource() == b11 || e.getSource() == b12 ||
                e.getSource() == b14 || e.getSource() == b15 || e.getSource() == b16)
                && currentOrder.get(tempButtonNr - 1).equals("")) {

            Collections.swap(currentOrder, tempButtonNr, tempButtonNr - 1);
            interfaceUpdater();


        }

    }

    public void interfaceUpdater() {
        int i = 0;
        for (JButton button : buttonsList) {
            button.setText(currentOrder.get(i++));
            revalidate();
            repaint();
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
