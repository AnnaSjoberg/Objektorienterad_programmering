package InUppg.uppg3;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Main extends JFrame {
// kommentar
    JLabel message = new JLabel();
    JButton newGame = new JButton("New game");


     JButton[][] buttonsarray = {{
         new JButton("1"),
         new JButton("2"),
         new JButton("3"),
         new JButton("4")},
         {new JButton("5"),
                 new JButton("6"),
                 new JButton("7"),
                 new JButton("8")},
         {new JButton("9"),
                 new JButton("10"),
                 new JButton("11"),
                 new JButton("12")},
         {new JButton("13"),
                 new JButton("14"),
                 new JButton("15"),
                 new JButton(" ")}};

     List<JButton> buttonsList = List.of(); //alternativt sätt att skapa upp alla knapparna.
    // Funderar på om detta är enklare för att kunna randomisera ordningen på knapparna när man ska starta nytt spel

    public Main() {
        setLayout(new BorderLayout());


        PanelBuilder panelBuilder = new PanelBuilder();
        JPanel gamePanel = panelBuilder.gamePanel(buttonsarray);
        add(gamePanel, BorderLayout.SOUTH);

        add(newGame,BorderLayout.WEST);
        add(message,BorderLayout.EAST);



        //standard avslutning
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        Main m = new Main();
    }
}
