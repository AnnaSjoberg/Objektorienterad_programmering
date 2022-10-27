package sprint3.uppg14;

public class XThread extends Thread{
    public static boolean delay(long ms){
        if (interrupted()){
            return false;
        }
        try {
            sleep(ms);
        }catch (InterruptedException e){
            return false;
        }
        return true;
    }
}
