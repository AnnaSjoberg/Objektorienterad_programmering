package sprint1.Harry.MedI;

import java.util.Comparator;
import java.util.List;

public class Inventory {
    CarAd car1 = new CarAd(81000, "Seat Ibiza", "En riktig liten pärla",
            2015,10500, "röd", true,false, false);
    CarAd car2 = new CarAd(30000, "Volvo 850", "Stabil familjebil",
            2005,25700, "Silver", true,true, false);
    CarAd car3 = new CarAd(100000, "Toyota Aygo", "Liten och smidig",
            2018,5250, "Gunmetal", false,true,false);
    CarAd car4 = new CarAd(210000, "Volwswagen Golf", "Med turbomotor och extra allt!",
            2020,6000, "Mörkgrön", true,true,false);
    CarAd car5 = new CarAd(410000, "Skoda Enyak", "Elbil!",
            2021,2650, "Vit", true,true,true);
    CarAd car6 = new CarAd(130000, "Volvo PV", "Extremt välskött!",
            1962,15250, "Turkos", true,false,false);

    CaravanAd caravan1 = new CaravanAd(113000,"Smålandia","Med gott om plats för hela familjen!",
            2020,4500,true,6);
    CaravanAd caravan2 = new CaravanAd(63000,"Adria","Besök hela Sverige!",
            2010,14500,false,4);
    CaravanAd caravan3 = new CaravanAd(73000,"Cabby","Ta med vännerna på semester!",
            2014,10450,true,4);
    CaravanAd caravan4 = new CaravanAd(49950,"Kabe","Liten och lättkörd!",
            2000,9300,false,2);

    MotorBikeAd motorBike1 = new MotorBikeAd(22000, "Suzuki", "Ett riktigt vrålåk",
            2017,10505, 115, false);
    MotorBikeAd motorBike2 = new MotorBikeAd(87000, "Harley Davidson", "Giganternas gigant",
            2020,9500, 125, true);
    MotorBikeAd motorBike3 = new MotorBikeAd(12000, "Yamaha", "Ett projekt för mekanikern",
            1991,40505, 122, false);


    Inventory(List<VehicleAd>adList){
        adList.add(car1);
        adList.add(car2);
        adList.add(car3);
        adList.add(car4);
        adList.add(car5);
        adList.add(car6);
        adList.add(caravan1);
        adList.add(caravan2);
        adList.add(caravan3);
        adList.add(caravan4);
        adList.add(motorBike1);
        adList.add(motorBike2);
        adList.add(motorBike3);

        adList.sort(Comparator.comparing(VehicleAd::getPrice));

    }
}


