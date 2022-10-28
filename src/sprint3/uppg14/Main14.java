package sprint3.uppg14;

import java.util.Scanner;

public class Main14 {

    public Main14(){
        MyQueue queue = new MyQueue();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many producers?");
        Producer[] producers = new Producer[scanner.nextInt()];
        for (int i = 0; i < producers.length; i++) {
            System.out.println("Producer number " + (i+1) + ":");
            System.out.println("Priority for this producer?");
            int prio = scanner.nextInt();

            System.out.println("Production rate?");
            int rate = scanner.nextInt();

            System.out.println("What produce?");

            producers[i] = new Producer(scanner.next(),prio, rate, queue);
            System.out.println();
        }
        System.out.println("How many consumers?");
        Consumer[] consumers = new Consumer[scanner.nextInt()];
        for (int i = 0; i < consumers.length; i++) {
            System.out.println("Consumer number " + (i+1) + ":");
            System.out.println("Consumption rate?");
            consumers[i] = new Consumer(scanner.nextInt(),queue);
            System.out.println();
        }

        for (int i = 0; i < producers.length; i++) {
            producers[i].activity.start();
        }
        for (int i = 0; i < consumers.length; i++) {
            consumers[i].activity.start();
        }

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(queue.size() + " items of produce left in the queue:");
        queue.printQueue();
        System.exit(0);

    }

    public static void main(String[] args) {
        Main14 m14 = new Main14();
    }
}
/*
Skriv en egen Kö-klass, MyQueue.
Kön ska ha följande funktioner:
void put(Object o) – Objektet o läggs in sist i kön
Object take() – returnerar det objekt som ligger först i kön
Använd dig av wait() i take, om inget objekt finns i kön ska den tråd som vill hämta ett objekt få vänta
Använd dig av notify() i put, när det kommer ett objekt till kön ska de väntande trådarna notifieras.
Denna kod finns i föreläsningarna/filmerna.

 14d
 Förbättra koden så att producenten lägger in objekten i prioritetsordning efter vilken prioritet den tråd
som lägger in objekt i kön har. Nu måste användaren även lägga till prio för varje producent i
huvudprogrammet
Ändra Konsument-klassen så att även prioriteten skrivs ut när ett objekt tas ur kön
Kör och kontrollera att allt funkar, strängar som produceras med högst prio ska hämtas ur kön och
skrivas ut först.
Kör och kontrollera att allt funkar, strängar som produceras med högst prio ska hämtas ur kön och
skrivas ut först


 */