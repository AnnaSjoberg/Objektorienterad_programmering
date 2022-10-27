package sprint3.uppg8a;



import javax.swing.*;
import java.awt.*;

public class ImageViewer extends JFrame {

    JLabel image = new JLabel(new ImageIcon("/Users/HP/OneDrive - Nackademin AB/OOP/bilder/z1.jpg"));
    JButton button = new JButton("Show next picture");
    public ImageViewer(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));
        add(panel);
        button.addActionListener(new OurActionListener(image));
        panel.add(image);
        panel.add(button);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }




    public static void main(String[] args) {
        ImageViewer iv = new ImageViewer();
    }
}
