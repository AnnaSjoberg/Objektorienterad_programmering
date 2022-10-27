import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



import javax.swing.*;

class Main extends JFrame implements ActionListener {

    JPanel p = new JPanel();
    JPanel frågor = new JPanel();
    JPanel svar = new JPanel();
    JPanel resultat = new JPanel();
    JPanel valör = new JPanel();
    JLabel prisLabel = new JLabel("Ange pris på varan: ");
    JLabel betaltLabel = new JLabel("Ange vad du betalade: ");
    JLabel växelTillbakaLabel = new JLabel("Växel du ska få tillbaka: ");
    //  JLabel valörer = new JLabel("Valörer valda: ");
    JTextField pris = new JTextField(5);
    JTextField betalt = new JTextField(5);

    JLabel antal1000lappar = new JLabel();
    JLabel antal500lappar = new JLabel();
    JLabel antal200lappar = new JLabel();
    JLabel antal100lappar = new JLabel();
    JLabel antal50lappar = new JLabel();
    JLabel antal20lappar = new JLabel();
    JLabel antal10kronor = new JLabel();
    JLabel antal5kronor = new JLabel();
    JLabel antal2kronor = new JLabel();
    JLabel antal1kronor = new JLabel();
    JCheckBox tusen = new JCheckBox("1000", false);
    JCheckBox femhundra = new JCheckBox("500", false);
    JCheckBox tvåhundra = new JCheckBox("200", false);
    JCheckBox hundra = new JCheckBox("100", false);
    JCheckBox femtio = new JCheckBox("50", false);
    JCheckBox tjugo = new JCheckBox("20", false);
    JCheckBox tio = new JCheckBox("10", false);
    JCheckBox fem = new JCheckBox("5", false);
    JCheckBox två = new JCheckBox("2", false);
    JCheckBox ett = new JCheckBox("1", false);

    Main() {
        add(p);
        p.setLayout(new BorderLayout());
        p.add(frågor, BorderLayout.WEST);
        p.add(svar, BorderLayout.CENTER);
        p.add(valör, BorderLayout.NORTH);
        p.add(resultat, BorderLayout.SOUTH);

        frågor.setLayout(new GridLayout(3, 1));
        frågor.add(prisLabel);
        frågor.add(betaltLabel);

        svar.setLayout(new GridLayout(3, 1));
        svar.add(pris);
        svar.add(betalt);

        resultat.setLayout(new GridLayout(1, 1));
        resultat.add(växelTillbakaLabel);
        resultat.add(antal1000lappar);
        resultat.add(antal500lappar);
        resultat.add(antal200lappar);
        resultat.add(antal100lappar);
        resultat.add(antal50lappar);
        resultat.add(antal20lappar);
        resultat.add(antal10kronor);
        resultat.add(antal5kronor);
        resultat.add(antal2kronor);
        resultat.add(antal1kronor);


        valör.setLayout(new GridLayout(10, 1));
        valör.add(tusen);
        valör.add(femhundra);
        valör.add(tvåhundra);
        valör.add(hundra);
        valör.add(femtio);
        valör.add(tjugo);
        valör.add(tio);
        valör.add(fem);
        valör.add(två);
        valör.add(ett);

        tusen.addActionListener(this);
        femhundra.addActionListener(this);
        tvåhundra.addActionListener(this);
        hundra.addActionListener(this);
        femtio.addActionListener(this);
        tjugo.addActionListener(this);
        tio.addActionListener(this);
        fem.addActionListener(this);
        två.addActionListener(this);
        ett.addActionListener(this);

        pris.addActionListener(this);
        betalt.addActionListener(this);

        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pris || e.getSource() == betalt) {
            int priset = Integer.parseInt(pris.getText());
            int betalat = Integer.parseInt(betalt.getText());
            int tillbaka = betalat - priset;
            if (tusen.isSelected()) {
                antal1000lappar.setText(tillbaka / 1000 + "tusenlappar");

                tillbaka = tillbaka % 1000;
            }
            if (femhundra.isSelected()) {
                antal500lappar.setText(tillbaka / 500 + "femhurndralappar");
                tillbaka = tillbaka % 500;
            }
            if (tvåhundra.isSelected()) {
                antal200lappar.setText(tillbaka / 200 + "tvåhurndralappar");
                tillbaka = tillbaka % 200;
            }
            if (hundra.isSelected()) {
                antal100lappar.setText(tillbaka / 100 + "hurndralappar");
                tillbaka = tillbaka % 100;
            }
            if (femtio.isSelected()) {
                antal50lappar.setText(tillbaka / 50 + "femtiolappar");
                tillbaka = tillbaka % 50;
            }
            if (tjugo.isSelected()) {
                antal20lappar.setText(tillbaka / 20 + "tjugolappar");
                tillbaka = tillbaka % 20;
            }
            if (tio.isSelected()) {
                antal10kronor.setText(tillbaka / 10 + "10-kronor");
                tillbaka = tillbaka % 10;
            }
            if (fem.isSelected()) {
                antal5kronor.setText(tillbaka / 5 + "femkronor");
                tillbaka = tillbaka % 5;
            }
            if (två.isSelected()) {
                antal2kronor.setText(tillbaka / 2 + "tvåkronor");
                tillbaka = tillbaka % 2;
            }
            if (ett.isSelected()) {
                antal1kronor.setText(tillbaka / 1 + "enkronor");
                tillbaka = tillbaka % 1;
            }
        }
    }
    public static void main(String[] args) {
        Main pengarTillbaka = new Main();
    }
}

