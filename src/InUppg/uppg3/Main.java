package InUppg.uppg3;

import javax.swing.*;

public class Main extends JFrame {

    JLabel message = new JLabel();
    JButton newGame = new JButton("New game");


    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b10 = new JButton("10");
    JButton b11 = new JButton("11");
    JButton b12 = new JButton("12");
    JButton b13 = new JButton("13");
    JButton b14 = new JButton("14");
    JButton b15 = new JButton("15");
    JButton b16 = new JButton(" ");
    JButton[][] buttonsarray = {{b1,b2,b3,b4},{b5,b6,b7,b8},{b9,b10,b11,b12},{b13,b14,b15,b16}};

    //kommentar
    public Main() {
        PanelBuilder panelBuilder = new PanelBuilder();
        JPanel gamePanel = panelBuilder.gamePanel(buttonsarray);
    }


    public static void main(String[] args) {
        Main m = new Main();
    }
}
