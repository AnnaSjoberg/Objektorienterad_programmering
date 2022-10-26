package sprint3.uppg5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockPaperScissors extends JFrame implements ActionListener {
    /*
    två paneler med tre JButtons + en JLabel i varje  Label överst med Användare / Dator. Text på knapparna med Sten Sax Påse
    en label där ställningen redovisas (hur många segrar)


    vid knapptryckning (anv) : vald knapp ändrar färg
                                slumpvis knapp väljs hos "datorn" -> ändrar färg
                                kontroll av segrare
                                utskrift till redovisning
                                nollställ knapparna för nytt spel
     */
    JButton userRock = new JButton("Sten");
    JButton userScissors = new JButton("Sax");
    JButton userPaper = new JButton("Påse");

    JButton computerRock = new JButton("Sten");
    JButton computerScissors = new JButton("Sax");
    JButton computerPaper = new JButton("Påse");

    JLabel headLabel = new JLabel("Let's play!");
    JLabel winnerLabel = new JLabel(" ");
    JLabel userLabel = new JLabel("Användare");
    JLabel computerLabel = new JLabel("Datorn");
    JLabel userScoreLabel = new JLabel();
    JLabel scoreDividerLabel = new JLabel("-");
    JLabel computerScoreLabel = new JLabel();
    int userWin, computerWin;

    public RockPaperScissors() { //konstruktor
        setLayout(new BorderLayout());
        JPanel headPanel = new JPanel(new BorderLayout());
        JPanel userPanel = new JPanel(new GridLayout(4, 1));
        JPanel computerPanel = new JPanel(new GridLayout(4, 1));
        JPanel scorePanel = new JPanel(new FlowLayout());//alt GridLayout med 1,3 ??

        add(headPanel, BorderLayout.NORTH);
        add(userPanel, BorderLayout.WEST);
        add(computerPanel, BorderLayout.EAST);
        add(scorePanel, BorderLayout.SOUTH);

        headPanel.add(headLabel, BorderLayout.NORTH);
        headPanel.add(winnerLabel,BorderLayout.SOUTH);

        userPanel.add(userLabel);
        userPanel.add(userRock);
        userPanel.add(userScissors);
        userPanel.add(userPaper);

        computerPanel.add(computerLabel);
        computerPanel.add(computerRock);
        computerPanel.add(computerScissors);
        computerPanel.add(computerPaper);

        scorePanel.add(userScoreLabel, RIGHT_ALIGNMENT);
        scorePanel.add(scoreDividerLabel, CENTER_ALIGNMENT);
        scorePanel.add(computerScoreLabel, LEFT_ALIGNMENT);

        userRock.addActionListener(this);
        userScissors.addActionListener(this);
        userPaper.addActionListener(this);

       // pack();
        setSize(150,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final int ROCK = 0, SCISSORS = 1, PAPER = 2;
        int uChoice=-1;
        if (e.getSource() == userRock) {
            uChoice = ROCK;
            userRock.setBackground(Color.MAGENTA);
            userScissors.setBackground(Color.LIGHT_GRAY);
            userPaper.setBackground(Color.LIGHT_GRAY);

        } else if (e.getSource() == userScissors) {
            uChoice = SCISSORS;
            userRock.setBackground(Color.LIGHT_GRAY);
            userScissors.setBackground(Color.MAGENTA);
            userPaper.setBackground(Color.LIGHT_GRAY);

        } else if (e.getSource() == userPaper) {
            uChoice = PAPER;
            userRock.setBackground(Color.LIGHT_GRAY);
            userScissors.setBackground(Color.LIGHT_GRAY);
            userPaper.setBackground(Color.MAGENTA);

        }

        int cChoice = (int) (Math.random() * 3);

        if (cChoice == ROCK) {
            computerRock.setBackground(Color.CYAN);
            computerScissors.setBackground(Color.LIGHT_GRAY);
            computerPaper.setBackground(Color.LIGHT_GRAY);

        } else if (cChoice == SCISSORS) {
            computerRock.setBackground(Color.LIGHT_GRAY);
            computerScissors.setBackground(Color.CYAN);
            computerPaper.setBackground(Color.LIGHT_GRAY);

        } else if (cChoice == PAPER) {
            computerRock.setBackground(Color.LIGHT_GRAY);
            computerScissors.setBackground(Color.LIGHT_GRAY);
            computerPaper.setBackground(Color.CYAN);

        }
        if (uChoice==cChoice){
            winnerLabel.setText("It's a draw!");
        } else if (userWon(uChoice,cChoice)) {
            winnerLabel.setText("You won!");
            userScoreLabel.setText(String.valueOf(++userWin));
        }else if(!userWon(uChoice,cChoice)) {
            winnerLabel.setText("Computer won!");
            computerScoreLabel.setText(String.valueOf(++computerWin));
        }

    }
    //Sten slår sax                 sten=0
    //Sax slår påse                 sax=1
    //Påse slår sten                påse=2

    protected boolean userWon (int user, int computer){
        return ((user==0 && computer==1)
         || (user==1 && computer==2)
         || (user==2 && computer==0));
    }

    public static void main(String[] args) {
        RockPaperScissors r = new RockPaperScissors();
    }
}
