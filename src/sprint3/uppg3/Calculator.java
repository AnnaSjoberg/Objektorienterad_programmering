package sprint3.uppg3;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    protected final List<Integer> availableUnits = List.of(1000, 500, 200, 100, 50, 20, 10, 5, 2, 1);

    public int calculateChange(int price, int paid) {
        return paid - price;
    }

    public List<Integer> howManyOfEach(int changeSum, List<Boolean> wantedUnits) {
        System.out.println(wantedUnits);
        List<Integer> returnList = new ArrayList<>();
        for (int i = 0; i < wantedUnits.size(); i++) {
            if ((wantedUnits.get(i)) && (changeSum >= availableUnits.get(i))) {
                returnList.add(changeSum / availableUnits.get(i));
                changeSum = changeSum % availableUnits.get(i);
            } else {
                returnList.add(0);
            }
        }
        System.out.println(returnList);
        return returnList;
    }

    public List<String> unitsListToString(List<Integer> list) {
        List<String> res = new ArrayList<>();
        String bigSuffix = "-lappar";
        String smallSuffix = "-kronor";
        for (int i = 0; i < list.size(); i++) {
            String temp = "  ";
            if (list.get(i) > 0) {
                temp += list.get(i) + " " + availableUnits.get(i);
                if (i <= 5) {
                    temp += bigSuffix;
                } else {
                    temp += smallSuffix;
                }
                res.add(temp);
            }
        }
        return res;
    }

}
