package sprint3.uppg14;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private List<Object> l = new ArrayList<>();
    public int size(){
        return l.size();
    }

    public synchronized List getL() {
        return l;
    }

    public synchronized void put (Object o){
       l.add(o);
       notify();
    //void put(Object o) – Objektet o läggs in sist i kön
    }
    public synchronized Object take(){
        while (l.isEmpty()){
            try {
                wait();
            }catch (InterruptedException e){
                return null;
            }
        }
        Object o = l.get(0);
        l.remove(0);
        return o;
//Object take() – returnerar det objekt som ligger först i kön
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