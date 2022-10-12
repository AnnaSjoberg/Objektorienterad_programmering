package sprint2.Uppg6abc;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public Main (){
        System.out.println("Pris: ");
        int price = scanner.nextInt();
        System.out.println("Överlämnad summa: ");
        int moneyPaid = scanner.nextInt();
        ChangeCalculator changeCalculator =  new ChangeCalculator(price,moneyPaid);
        System.out.println(changeCalculator.getReturnAmount());
        System.out.println(changeCalculator.getListOfChange());
        System.out.println(changeCalculator.printMe());
    }

    public static void main(String[] args) {

        Main main = new Main();
    }
}
/*

Uppgift 6a – Växel tillbaka med TDD
Skriv ett program som beräknar hur mycket växel som ska ges tillbaka.
Indata till programmet är det pris man ska betala samt det belopp man betalar med. Läs och skriv
till/från kommandoraden.
Beräkna hur många 1000-lappar, 500-lappar, 200-lappar, 100-lappar, 50-lappar, 20-lappar, 10-kronor,
5-kronor, 2-kronor och enkronor man ska få tillbaka utifrån, av användaren, givna belopp.
Växeln ska alltid innehålla så mycket som möjligt av högsta möjliga valörer
Skriv helst testerna först, koden sen. Om det känns väldigt svårt är det bättre att fuska med detta än att
inte skriva nån kod alls
 */