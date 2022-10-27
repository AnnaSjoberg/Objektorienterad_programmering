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
            System.out.println("Production rate?");
            int rate = scanner.nextInt();
            System.out.println("What produce?");
            producers[i] = new Producer(scanner.next(), rate, queue);
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
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
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
        System.out.println(queue.size() + " items of produce left in the queue.");
        System.exit(0);
        //Låt programmet köra i 10 sek, skriv sedan ut status på kön och avsluta



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
 */