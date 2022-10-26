package sprint3.uppg4a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main4 extends JFrame implements ActionListener {
    JTextField nameF = new JTextField();
    JButton openB = new JButton("Open");
    JButton saveB = new JButton("Save");
    JButton printB = new JButton("Print");
    JButton exitB = new JButton("Exit");
    JLabel promptL = new JLabel("Filename: ", JLabel.CENTER);
    JTextArea textArea = new JTextArea();


    public Main4(){
        Builder builder = new Builder(promptL,nameF,openB,saveB,printB,exitB,textArea);
        JPanel optionsP = builder.buildTopPanel();
        JScrollPane scrollPane = builder.buildScrollPane();

        //setLayout(new GridLayout(2,1));
        add(optionsP,BorderLayout.NORTH);
        add(scrollPane,BorderLayout.CENTER);

        openB.addActionListener(this);
        saveB.addActionListener(this);
        printB.addActionListener(this);
        exitB.addActionListener(this);

        //setSize(500,500);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ButtonActionLogic logic = new ButtonActionLogic();
            if (e.getSource() == openB) {
                logic.readInFile(nameF.getText(), textArea);

            } else if (e.getSource() == saveB) {
                logic.writeToFile(nameF.getText(),textArea);

            } else if (e.getSource() == printB) {
                logic.print(textArea);
            } else if (e.getSource() == exitB) {
                System.exit(0);
            }

    }

/*
Bygg en TextEditor.
När användaren trycker på ”Öppna” ska den fil som skrivits in i JTextField-rutan öppnas och
innehållet ska visas i stora textytan.
När användaren trycker ”Spara” ska texten i stora textrutan sparas ner till det filnamn som anges i
JTextField-rutan.
När användaren trycker ”Skriv” ska textrutans print-funktion anropas.
När användaren trycker ”Avsluta” ska programmet avslutas.
 */


    public static void main(String[] args) {
        Main4 m = new Main4();
    }
}
