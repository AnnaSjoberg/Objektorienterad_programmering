package sprint2.Uppg8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AMain {
    public boolean test;
    protected String tempString;
    protected double tempDouble;
    protected double highest = 0;
    protected double lowest = 0;
    protected double meanValue = 0;
    protected int dayCounter = 0;
    public AMain(boolean test) {
        this.test=test;
        try (BufferedReader br = new BufferedReader(new FileReader("src/sprint2/Uppg8/temp.txt"))) {
            while (!test && (tempString = br.readLine()) != null) {
                tempDouble = convertToDouble(tempString);
                if (dayCounter == 0 || tempDouble > highest) {
                    highest = tempDouble;
                }
                if (dayCounter == 0 || tempDouble < lowest) {
                    lowest = tempDouble;
                }
                meanValue += tempDouble;
                dayCounter++;
            }
            System.out.println(compileInfo(highest,lowest,meanValue, dayCounter));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) { //generisk felkod,
            e.printStackTrace();
        }
    }
    public double convertToDouble (String s){
        s=s.replace(',', '.');
        return Double.parseDouble(s);
    }
    public StringBuilder compileInfo(double high, double low, double mean, int i){
        StringBuilder compilation = new StringBuilder("Month with " + i + " days:");
        compilation.append("\nHighest recorded temperature of the month: " + high + "\u00B0C");
        compilation.append("\nLowest recorded temperature of the month: " + low + "\u00B0 C");
        compilation.append("\nAverage temperature of the month: " + mean/i + "\u00B0 C");
        return compilation;
    }

    public static void main(String[] args) {
        AMain a = new AMain(false);
    }
}
/*
Skriv ett program som läser filen och skriver ut högsta och lägsta värden, samt beräknar
medeltemperaturen för månaden.
Använd dig av klassen FileReader wrappad i en BufferedReader för att läsa från filen.
 */