package sprint4.uppg14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main14 extends JFrame implements ActionListener {
    JPanel panel = new JPanel(new BorderLayout());
    JButton call = new JButton("");
    JLabel response = new JLabel("");
    JLabel head = new JLabel("Call and response", JLabel.CENTER);
    String callString;
    String responseString;
    Color backgroundColor;
    String fontName;
    int fontStyle;
    int fontSize;
    public Main14() {
        Properties properties = new Properties();
        PropConverter propConverter = new PropConverter();

        try {
           // properties.load(new FileInputStream("src/sprint4/uppg14/PropFile.properties"));
            properties.loadFromXML(new FileInputStream("src/sprint4/uppg14/propFileX.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        callString = properties.getProperty("callString","Hejsan");
        responseString = properties.getProperty("responseString","Svejsan");
        fontName = properties.getProperty("fontName","Arial");
        fontSize=Integer.parseInt(properties.getProperty("fontSize", "20"));
        String fontStyleString = properties.getProperty("fontStyle", "PLAIN");
        String backgroundColorProp = properties.getProperty("backgroundColor","white");

        fontStyle = propConverter.setFontStyleFromString(fontStyleString.trim());
        backgroundColor =propConverter.setColorFromString(backgroundColorProp.trim());

        buildGraphics();
    }

    public void buildGraphics() {

        add(panel);
        panel.add(head, BorderLayout.NORTH);
        panel.add(call, BorderLayout.WEST);
        panel.add(response, BorderLayout.CENTER);
        panel.setBackground(backgroundColor);
        response.setFont(new Font(fontName, fontStyle, fontSize));
        call.setText(callString);
        call.addActionListener(this);

        setSize(500,100);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        response.setText(responseString);
        response.setHorizontalAlignment(JLabel.CENTER);
    }

    public static void main(String[] args) {
        Main14 m = new Main14();
    }
}
