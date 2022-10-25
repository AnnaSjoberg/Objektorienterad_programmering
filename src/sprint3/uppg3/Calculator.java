package sprint3.uppg3;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    protected final List<Integer> availableUnits = List.of(1000, 500, 200, 100, 50, 20, 10, 5, 2, 1);

    public int calculateChange(int price, int paid) {
        return paid - price;
    }

    public List<Integer> howManyOfEach(int changeSum, List<Boolean> wantedUnits) {
        List<Integer> returnList = new ArrayList<>();
        for (int i = 0; i < wantedUnits.size(); i++) {
            if ((wantedUnits.get(i)) && (changeSum >= availableUnits.get(i))) {
                returnList.add(changeSum / availableUnits.get(i));
                changeSum = changeSum % availableUnits.get(i);
            } else {
                returnList.add(0);
            }
        }
        return returnList;
    }
    public String unitsListToString (List<Integer> list){
        String res ="";
        String bigSuffix = "-lappar";
        String smallSuffix = "-kronor";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >0 ){

                res += list.get(i)%availableUnits.get(i) + " " + availableUnits.get(i) +"\n";

                if (i <= 5){
                    res += bigSuffix;
                }else {
                    res += smallSuffix;
                }
            }
        }
        return res;
    }

}
