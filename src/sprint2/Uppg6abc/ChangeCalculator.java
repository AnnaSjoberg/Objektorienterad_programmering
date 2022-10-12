package sprint2.Uppg6abc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeCalculator {
    private int price;
    private int moneyPaid;
    private final String billSuffix = "-lappar";
    private final String coinSuffix = "-kronor";
    protected final List<Integer> currencyUnitsList = List.of(1, 2, 5, 10, 20, 50, 100, 200, 500, 1000);

    public ChangeCalculator(int price, int moneyPaid) {
        this.price = price;
        this.moneyPaid = moneyPaid;
    }

    public int getPrice() {
        return price;
    }

    public int getMoneyPaid() {
        return moneyPaid;
    }

    public int getReturnAmount() {
        return getMoneyPaid() - getPrice();

    }

    public List<Integer> getListOfChange() {
        List<Integer> listOfChange = new ArrayList<>();
        int temp = getReturnAmount();
        for (int i = currencyUnitsList.size() - 1; i >= 0; ) {
            if (temp >= currencyUnitsList.get(i)) {
                listOfChange.add(currencyUnitsList.get(i));
                temp -= currencyUnitsList.get(i);
                if (temp < currencyUnitsList.get(i)) {
                    i--;
                }
            } else {
                i--;
            }
        }
        return listOfChange;
    }

    public StringBuilder printMe() {
        StringBuilder message = new StringBuilder("");
        if (getReturnAmount() < 0) {
            return message.append("Du betalade för lite.");
        } else if (getReturnAmount() == 0) {
            return message.append("Du betalade med jämna pengar.");
        }
        int numberOfUnits = 1;
        List<Integer> list = getListOfChange();
        for (int i = 0; i < list.size(); i++) {
            if (i == 0 || list.get(i) != list.get(i - 1)) {
                message.append(getEachUnitToString(list.get(i)));
            } else {
                numberOfUnits++;
            }
            if (i == list.size() - 1 || list.get(i) != list.get(i + 1)) {
                message.append(numberOfUnits);
                numberOfUnits = 1;
            }
        }

        return message;
    }

    protected String getEachUnitToString(Integer input) {
        String line = "\nAntal " + input;
        if (input < 20) {
            line += coinSuffix + ": ";
        } else {
            line += billSuffix + ": ";
        }
        return line;
    }

}
