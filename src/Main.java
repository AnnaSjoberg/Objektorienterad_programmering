import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Main {

    public static void main(String[] args) {
        // Main ö = new Main();

        for (int i = 0; i < 10; i++) {

            int rand = (int) (Math.random() * 3);
            System.out.println(rand);
        }
    }
}