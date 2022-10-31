import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import javax.swing.*;

class Main extends JFrame {


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

    public Main(){
        System.out.println(buttonsarray[1][1].toString());
    }

    public static void main(String[] args) {
        Main pengarTillbaka = new Main();
    }
}

