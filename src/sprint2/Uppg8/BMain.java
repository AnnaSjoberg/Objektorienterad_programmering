package sprint2.Uppg8;

import java.io.*;
import java.util.Scanner;

public class BMain {

    public BMain() {
        double temp;
        double highest = 0;
        double lowest = 0;
        double meanValue = 0;
        int i = 0;
        try  {
            Scanner scanner = new Scanner(new File("src/sprint2/Uppg8/temp.txt"));
            while (scanner.hasNextLine()) {
                temp = convertToDouble(scanner.nextLine().trim());
                if (i == 0 || temp > highest) {
                    highest = temp;
                }
                if (i == 0 || temp < lowest) {
                    lowest = temp;
                }
                meanValue += temp;
                i++;
            }
            System.out.println(compileInfo(highest,lowest,meanValue,i));
        } catch (Exception e) { //generisk felkod,
            System.out.println("fastnat i catch");
            e.printStackTrace();
        }
    }
    public double convertToDouble (String s){
        s=s.replace(',', '.');
        return Double.parseDouble(s);
    }
    public StringBuilder compileInfo(double high, double low, double mean, int i){
        StringBuilder compilation = new StringBuilder("Month with " + i + " days");
        compilation.append("\nHighest recorded temperature of the month: " + high + "\u00B0C");
        compilation.append("\nLowest recorded temperature of the month: " + low + "\u00B0 C");
        compilation.append("\nAverage temperature of the month: " + mean/i + "\u00B0 C");
        return compilation;
    }

    public static void main(String[] args) {
        BMain a = new BMain();
    }
}
/*
Skriv ett program som läser filen och skriver ut högsta och lägsta värden, samt beräknar
medeltemperaturen för månaden.
Använd dig av klassen FileReader wrappad i en BufferedReader för att läsa från filen.
 */