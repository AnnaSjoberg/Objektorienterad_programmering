package sprint3.uppg1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class ImageViewer extends JFrame implements ActionListener {

    JLabel imageViewer;
    JButton nextPic = new JButton("Show next picture");
    JButton randomPic = new JButton("Show random picture");
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
        panel.add(imageViewer, BorderLayout.NORTH);
        panel.add(nextPic, BorderLayout.WEST);
        panel.add(randomPic, BorderLayout.EAST);
        nextPic.addActionListener(this);
        randomPic.addActionListener(this);
        setSize(200, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        ImageViewer iv = new ImageViewer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextPic) {
            imageIndex = (imageIndex + 1) % imageCount;
            imageViewer.setIcon(new ImageIcon(imageFileNames.get(imageIndex)));
        } else if (e.getSource() == randomPic) {
            int randomizer = (int) (Math.random() * imageCount);

            imageIndex = (imageIndex + randomizer) % imageCount;
            imageViewer.setIcon(new ImageIcon(imageFileNames.get(imageIndex)));
        }
    }
}
