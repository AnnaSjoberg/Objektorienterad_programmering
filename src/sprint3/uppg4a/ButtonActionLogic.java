package sprint3.uppg4a;

import javax.swing.*;
import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ButtonActionLogic {

    public void readInFile(String fileName, JTextArea ta) {
        try (FileReader fr = new FileReader(fileName)) {
            ta.read(fr, null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String fileName, JTextArea ta) {
        try (FileWriter fw = new FileWriter(fileName)) {
            ta.write(fw);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void print(JTextArea ta) {
        try{
            ta.print();
        } catch (PrinterException e) {
            e.printStackTrace();
        }
    }
}



