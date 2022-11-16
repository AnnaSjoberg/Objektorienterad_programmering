package sprint4.uppg12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//är det möjligt att ha även actionListener här, så allting som rör grafiken hamnar i en egen klass?
public class GraphicsBuilder extends JFrame implements ActionListener {
    private JButton button;
    private JTextArea area;
    private JTextField field;
    private String name;

    public GraphicsBuilder(JButton button, JTextArea area, JTextField field, String name){
        this.button=button;
        this.area=area;
        this.field=field;
        this.name=name;
    }


    public void buildPanel() {
        setLayout(new BorderLayout());
        setTitle(name);
        add(button, BorderLayout.NORTH);
        add(area, BorderLayout.CENTER);
        add(field, BorderLayout.SOUTH);

        field.addActionListener(this);
        button.addActionListener(this);

        setVisible(true);
        setSize(300, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
