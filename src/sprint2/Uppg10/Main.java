package sprint2.Uppg10;

import java.util.Scanner;

public class Main {

    Main (){
        boolean test=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What city do you want to know the time for? ");
        String inputCity = scanner.nextLine();

        TimeCheck timeCheck = new TimeCheck();
        System.out.println(timeCheck.printCityTime(inputCity));
    }





    public static void main(String[] args) {
        Main main = new Main();
    }
}
