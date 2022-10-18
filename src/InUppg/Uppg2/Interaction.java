package InUppg.Uppg2;

import javax.swing.*;

public class Interaction {


    public String registerVisitor(boolean isTest, String testInput){
        if (isTest){
            return testInput;
        }else {
            return JOptionPane.showInputDialog("Ange namn eller personnummer: ").trim();
        }
    }


}
