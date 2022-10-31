package InUppg.uppg3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame implements MouseListener {
    // kommentar
    JLabel message = new JLabel();
    JButton newGame = new JButton("New game");

    //alternativt sätt att skapa upp alla knapparna.
    // Funderar på om detta är enklare för att kunna randomisera ordningen på knapparna när man ska starta nytt spel


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


    public Main() {
        buttonsList = List.of(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16);
        setLayout(new BorderLayout());
        currentOrder = g.randomizeList();
        PanelBuilder panelBuilder = new PanelBuilder();
        JPanel gamePanel = panelBuilder.gamePanel(buttonsList, currentOrder);
        add(gamePanel, BorderLayout.SOUTH);

        add(newGame, BorderLayout.WEST);
        add(message, BorderLayout.EAST);

        b1.addMouseListener(this);
        b2.addMouseListener(this);
        b3.addMouseListener(this);
        b4.addMouseListener(this);
        b5.addMouseListener(this);
        b6.addMouseListener(this);
        b7.addMouseListener(this);
        b8.addMouseListener(this);
        b9.addMouseListener(this);
        b10.addMouseListener(this);
        b11.addMouseListener(this);
        b12.addMouseListener(this);
        b13.addMouseListener(this);
        b14.addMouseListener(this);
        b15.addMouseListener(this);
        b16.addMouseListener(this);


        //standard avslutning
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        Object o = e.getSource();
        if (e.getSource() == b6) {
            if (b2.getText().equals("") || b5.getText().equals("")|| b7.getText().equals("") || b10.getText().equals(""))
                System.out.println("hej");

        }
        if (((JButton)e.getSource()).getText().equals("5")){
            System.out.println("5");
        }
    }
//jButton1.getText().equals("X")

    //icke aktuella
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
