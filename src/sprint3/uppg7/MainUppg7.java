package sprint3.uppg7;

import javax.swing.*;
import java.awt.*;

public class MainUppg7 extends JFrame {
    JButton button = new JButton("Colour me!");

    MainUppg7(){
        setLayout(new GridLayout(2,2));
        add(button);

        button.addMouseListener(new OurMouseAdapter());
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
/*

Gör ett program med en JButton.
Skriv en muslyssnare som kan kopplas till knappen.
Fixa så att knappens bakgrundsfärg blir röd varje gång man drar musen över knappen
 */

    public static void main(String[] args) {
        MainUppg7 mu7 = new MainUppg7();
    }
}
