package sprint3.uppg6;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FocusEvent extends JFrame {
    /*
    Konstruera en klass F som ärver JFrame.
    Lägg till två knappar och ett textfält (kallat ”Första”)
    Konstruera en lyssnare som gör att Första alltid hamnar i fokus när fönstret blir aktivt.
    Tips: fönster har metoden requestFocus()
    Konstruera sedan en lyssnare till Första som automatiskt gör komponentens bakgrundsfärg till blå
    varje gång Första får fokus.
     */
    JButton b1 = new JButton("Yes");
    JButton b2 = new JButton("No");

    JTextField first = new JTextField(10);
    Builder builder = new Builder(b1, b2, first);

    public FocusEvent() {
        add(builder.buildPanel());
        first.addFocusListener(new OurFocusListener());

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        FocusEvent fe = new FocusEvent();
    }
}
