package sprint3.uppg14;

public class Consumer implements Runnable {
    public Thread activity = new Thread(this);
    private long interval;
    private MyQueue q;

    public Consumer(long interval, MyQueue q) {
        this.interval = interval*1000;
        this.q = q;
    }

    public long getInterval() {
        return interval;
    }

    public MyQueue getQ() {
        return q;
    }


    @Override
    public void run() {
        while (XThread.delay(interval)){
            Product p = q.take();
            System.out.println( p.getName() + " Priority level: " + p.getPrio());
            //System.out.flush();
        }
    }
}
/*Skapa ytterligare två klasser.
Producer (String s, int time, MyQueue q)
Consumer (int time, MyQueue q)
Varje instans av dessa ska exekvera i en egen tråd.
Producenten lägger in strängar i kön i det tidsintervall som anges i time-variabeln. Gör en utskrift när
producenten har lagt sitt ord i kön
Konsumenten plockar ut strängar ur kön i det tidsintervall som anges i time-variabeln. Gör en utskrift
när konsumenten har plockat ett ord från kön. Interaktionerna med kön ska vara synkroniserade


14d
Ändra Konsument-klassen så att även prioriteten skrivs ut när ett objekt tas ur kön
 */