package sprint3.uppg4b;

import javax.swing.*;
import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FileLogic {

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


    public void loadFileNames (String cachePath, List<String> fileCache){
        try (FileReader fr = new FileReader(cachePath);
        Scanner sc = new Scanner(fr);){
            while (sc.hasNextLine()){
                fileCache.add(sc.nextLine().trim());
            }
            fr.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
/*
private void laddaFilnamn() {
     try (FileReader r = new FileReader(fileNameCachePath);
        Scanner sc = new Scanner(r);){

        while(sc.hasNextLine()){
            fileCache.add(sc.nextLine().trim());
        }
        r.close();
     }
     catch (IOException e) {
        e.printStackTrace();
     }
   }
 */


