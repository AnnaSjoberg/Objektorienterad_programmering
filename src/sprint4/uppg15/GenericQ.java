package sprint4.uppg15;

import java.util.LinkedList;
import java.util.List;

public class GenericQ <Q> implements Queue<Q>{
    private List<Q> qList = new LinkedList<>();

    @Override
    public void put(Q q) {
        qList.add(q);
    }

    @Override
    public Q take() {
        Q component = qList.get(0);
        qList.remove(0);
        return component;
    }

    @Override
    public int size() {
        return qList.size();
    }
}
