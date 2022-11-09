package sprint4.uppg15;

import java.util.ArrayList;
import java.util.List;

public class GenericNumberQ <Q extends Number> implements Queue<Q>{
    private List<Q> numList = new ArrayList<>();


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

    public float calcSum (){
        float sum=0;
        for (Q comp:numList) {
            sum+=comp.floatValue();
        }
        return sum;
    }
}
