package sprint1.Harry.MedI;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VehicleAd> inventoryList = new ArrayList<>();
        Inventory inventory = new Inventory(inventoryList);
        double maxRevenue=0;
        for (VehicleAd element:inventoryList) {
            System.out.println(element.printCompleteAd());

            maxRevenue+=element.calculateRevenue();
            System.out.println("Inkomst: " + element.calculateRevenue());
            System.out.println();
        }

        System.out.println("Total inkomst: " + maxRevenue);
    }
}
