package sprint2.Uppg3;

import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    Main (){
        while (true){
            System.out.println("Skriv vad du vill: ");
            if (scanner.hasNextLine()){
                String input = scanner.nextLine();
                CopyCat copyCat = new CopyCat(input);
                System.out.println(copyCat.printCopy());
            }
        }
    }


    public static void main(String[] args) {
        Main main =  new Main();
    }
}
