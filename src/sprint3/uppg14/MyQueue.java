package sprint3.uppg14;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private List<Product> prodList = new ArrayList<>();
    public int size(){
        return prodList.size();
    }

    public synchronized List getProdList() {
        return prodList;
    }

    public synchronized void put (Product p){
        int prio = Thread.currentThread().getPriority();
        int i;
        for (i=size()-1;i>=0 && prio> prodList.get(i).getPrio(); i--)
        ;
        prodList.add((i+1), p);
       notify();
    //void put(Object o) – Objektet o läggs in sist i kön
    }

    /*
      System.out.println("Putting "+ obj.getText());
        int p = Thread.currentThread().getPriority();
        //alternativt sätt att ta fram prioriteten:
        //int p = obj.getPri();
        int i;

        //leta baklänges i kön tills rätt prio hittas
       // i kommer att tilldelas värdet på den plats före där vi vill lägga in vårt obj
        for (i=size()-1; i>=0 && p > ((QueueElement) l.get(i)).pri; i--)
         ;
        l.add(i+1, obj);
        notify()
     */



    public synchronized Product take(){
        while (prodList.isEmpty()){
            try {
                wait();
            }catch (InterruptedException e){
                return null;
            }
        }
        Product p = prodList.get(0);
        prodList.remove(0);
        return p;

    }
    public void printQueue (){
        for (Product p:prodList) {
            System.out.println(p.getName());
        }
    }
}
