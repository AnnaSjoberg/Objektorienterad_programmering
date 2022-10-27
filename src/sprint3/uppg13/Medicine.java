package sprint3.uppg13;

public class Medicine extends Thread{
    private String prep;
    private int interval;



    public Medicine (String prep, int interval){
        this.prep = prep;
        this.interval=interval*1000;//omvandla sek till millisek
    }

    public String getPrep() {
        return prep;
    }

    public int getInterval() {
        return interval;
    }

    @Override
    public void run() {
        while (!interrupted()){
            try{
                System.out.println("Dags för " + prep);
                sleep(interval);
            }catch (InterruptedException e){
                e.printStackTrace();
                break;
            }
        }
    }
}
