package sprint4.uppg15;

import java.util.ArrayList;
import java.util.List;

public class GenericNumberQ <Q extends Number> implements Queue<Q>{
    private List<Q> numList = new ArrayList<>();

    public List<Q> getNumList() {
        return numList;
    }

    @Override
    public void put(Q q) {
        numList.add(q);
    }

    @Override
    public Q take() {
        Q number = numList.get(0);
        numList.remove(0);
        return number;
    }

    @Override
    public int size() {
        return numList.size();
    }

    public double calcSum (){
        double sum=0;
        for (Q comp:numList) {

        }
        return sum;
    }


    public Q calcSum2(){

        Double sum =0.0;
        for (Q q:numList) {

            try {
                if ( q.getClass() == Byte.class||q.getClass() == Integer.class|| q.getClass() == Short.class||
                        q.getClass() == Long.class|| q.getClass() == Float.class|| q.getClass() == Double.class){
                     sum+=q.doubleValue();
                }
            }catch (Exception e){
                e.printStackTrace();
                Integer ajdå = 0;
                return (Q)ajdå;
            }
        }return (Q) sum;
    }
}
