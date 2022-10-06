package sprint1.Harry.UtanI;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VehicleAd> adList = new ArrayList<>();
        RegisterVehicles registerVehicles = new RegisterVehicles(adList);
        for (VehicleAd element:adList) {
            System.out.println(element.getAdText());
        }
    }
}