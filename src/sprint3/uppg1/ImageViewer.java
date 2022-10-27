package sprint3.uppg1;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class ImageViewer extends JFrame {

    JLabel imageViewer;
    JButton button = new JButton("Show next picture");
    final String imagesPath = "/Users/HP/OneDrive - Nackademin AB/OOP/bilder/";
    Path imageFolderPath = Paths.get(imagesPath);
    int imageIndex;
    int imageCount;
    List<String> imageFileNames = new ArrayList<>();

    protected List<String> loadImageNames(Path imageDir) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(imageDir)) {
            for (Path file : stream) {
                imageFileNames.add(file.toString());
                System.out.println(file.toString());
            }
        } catch (IOException | DirectoryIteratorException x) {
            x.printStackTrace();
        }
        return imageFileNames;
    }

    public ImageViewer() {

        imageFileNames = loadImageNames(imageFolderPath);
        imageCount = imageFileNames.size();
        imageViewer = new JLabel(new ImageIcon(imageFileNames.get(imageIndex)));


        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        add(panel);
        button.addActionListener(new OurActionListener(imageViewer));
        panel.add(imageViewer, BorderLayout.NORTH);
        panel.add(button, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
//här låter jag den visa bilderna en i taget i ordning 1-5


    public static void main(String[] args) {
        ImageViewer iv = new ImageViewer();
    }
}
