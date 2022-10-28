package sprint3.uppg14;

public class Producer implements Runnable {
    public Thread activity = new Thread(this);
    private Product product;
    private int prio;
    private long productionRate;
    private MyQueue q;


    public Producer(String productString, int priority, long productionRate, MyQueue q) {
        this.prio = priority;
        this.product = new Product(productString, prio);
        this.productionRate = productionRate * 1000;
        this.q = q;

    }

    public Product getProduct() {
        return product;
    }

    public int getPrio() {
        return prio;
    }

    public long getProductionRate() {
        return productionRate;
    }

    public MyQueue getQ() {
        return q;
    }

    @Override
    public void run() {
        activity.setPriority(prio);
        while (XThread.delay(productionRate)) {
            q.put(product);
        }
    }
}
