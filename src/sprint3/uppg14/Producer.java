package sprint3.uppg14;

public class Producer implements Runnable{
    public Thread activity = new Thread(this);
    private String produce;
    private long productionRate;
    private MyQueue q;

    public Producer(String produce, long productionRate, MyQueue q) {
        this.produce = produce;
        this.productionRate = productionRate*1000;
        this.q = q;
    }

    public String getProduce() {
        return produce;
    }

    public long getProductionRate() {
        return productionRate;
    }

    public MyQueue getQ() {
        return q;
    }

    @Override
    public void run() {
        while (XThread.delay(productionRate)){
            q.put(produce);
        }
    }
}
