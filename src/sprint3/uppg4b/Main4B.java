package sprint3.uppg4b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
//import java.util.ArrayList;

public class Main4B extends JFrame implements ActionListener {


    private final String cachePath = "src/sprint3/uppg4b/fileNameCache.txt";
    Vector<String> fileCache = new Vector<>();
    JComboBox<String> nameCBox;
    JButton openB = new JButton("Open");
    JButton saveB = new JButton("Save");
    JButton printB = new JButton("Print");
    JButton exitB = new JButton("Exit");
    JLabel promptL = new JLabel("Filename: ", JLabel.CENTER);
    JTextArea textArea = new JTextArea();
    FileLogic logic = new FileLogic();

    public Main4B(){

        logic.loadFileNames(cachePath,fileCache);

        Builder builder = new Builder(promptL,nameCBox,openB,saveB,printB,exitB,textArea);
        nameCBox = builder.configureComboBox(fileCache);
        JPanel optionsP = builder.buildTopPanel();
        JScrollPane scrollPane = builder.buildScrollPane();


//        nameCBox = new JComboBox<>(fileCache);
        //      nameCBox.setSelectedIndex(-1);
        //    nameCBox.setEditable(true);


        add(optionsP,BorderLayout.NORTH);
        add(scrollPane,BorderLayout.CENTER);

        nameCBox.addActionListener(this);
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

            if (e.getSource() ==nameCBox || e.getSource() == openB) {
                logic.readInFile((String)nameCBox.getSelectedItem(), textArea);
                if (fileCache.indexOf((String)nameCBox.getSelectedItem())==-1){
                    nameCBox.addItem((String)nameCBox.getSelectedItem());
                }
            } else if (e.getSource() == saveB) {
                logic.writeToFile((String)nameCBox.getSelectedItem(),textArea);

                /*
                 if (e.getSource() == namn || e.getSource() == ??ppna)      {
       l??sInFil((String)namn.getSelectedItem());
       if(fileCache.indexOf((String)namn.getSelectedItem()) == -1){
        namn.addItem((String)namn.getSelectedItem());
       }
     }
     else if (e.getSource() == spara)
       sparaFil((String)namn.getSelectedItem());
                 */


            } else if (e.getSource() == printB) {
                logic.print(textArea);
            } else if (e.getSource() == exitB) {
                System.exit(0);
            }

    }

/*
Bygg en TextEditor.
N??r anv??ndaren trycker p?? ?????ppna??? ska den fil som skrivits in i JTextField-rutan ??ppnas och
inneh??llet ska visas i stora textytan.
N??r anv??ndaren trycker ???Spara??? ska texten i stora textrutan sparas ner till det filnamn som anges i
JTextField-rutan.
N??r anv??ndaren trycker ???Skriv??? ska textrutans print-funktion anropas.
N??r anv??ndaren trycker ???Avsluta??? ska programmet avslutas.

Byt ut textf??ltet d??r filnamnen skrivs in mot en JComboBox.
??ndra programmet s?? att det automatiskt kommer ih??g de 5 senaste filerna som redigerats och visar
dem i comboboxens dropdown.
Namnen p?? filerna sparas i en egen fil ???filecache.txt??? och l??ses in n??r programmet startar.
N??r programmet avslutar, skriv ner filnamnen som st??r i dropdown:en till ???filecache.txt???.
 */


    public static void main(String[] args) {
        Main4B m = new Main4B();
    }
}
