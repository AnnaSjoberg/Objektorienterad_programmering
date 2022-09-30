package sprint1.Uppg1;

public class Uppg1Main {

    public static void main(String[] args) {
        CarOwner owner1 = new CarOwner("Anna", "Casa de Anna", 35);
        CarOwner owner2 = new CarOwner("Emma", "Hemma hos Emma", 37);
        CarOwner owner3 = new CarOwner("Hugo", "Hugos hus", 6);
        CarOwner owner4 = new CarOwner("Ture", "Tures gömställe", 4);
        CarOwner owner5 = new CarOwner("Viggo", "Villa Viggo", 4);
        CarOwner owner6 = new CarOwner("Theo", "Theos terass", 12);

        Car car1 = new Car("ABC123", "Enyaq", "Skoda", owner1);
        Car car2 = new Car("XYZ789", "eNiro", "Kia", owner2);
        Car car3 = new Car("NOP456", "Freemont", "Fiat", owner5);

        car1.changeOwners(owner4);
        car2.changeOwners(owner4);
        car3.changeOwners(owner6);

        //Min utökning där jag skapar en lista i CarOwner över vilka bilar som ägs av personen
        System.out.println(owner2.listOfCarsToString());
        System.out.println(owner4.listOfCarsToString());
    }
}
/*          BRUTIT UT KODEN OCH LAGT DIREKT UNDER KLASSEN, STÄLLET FÖR I MAIN
package sprint1.Uppg1;

public class Uppg1Main {
    CarOwner owner1 = new CarOwner("Anna", "Casa de Anna", 35);
    CarOwner owner2 = new CarOwner("Emma", "Hemma hos Emma", 37);
    CarOwner owner3 = new CarOwner("Hugo", "Hugos hus", 6);
    CarOwner owner4 = new CarOwner("Ture", "Tures gömställe", 4);
    CarOwner owner5 = new CarOwner("Viggo", "Villa Viggo", 4);
    CarOwner owner6 = new CarOwner("Theo", "Theos terass", 12);

    Car car1 = new Car("ABC123", "Enyaq", "Skoda", owner1);
    Car car2 = new Car("XYZ789", "eNiro", "Kia", owner2);
    Car car3 = new Car("NOP456", "Freemont", "Fiat", owner5);

    Uppg1Main(){
        car1.changeOwners(owner4);
        car2.changeOwners(owner4);
        car3.changeOwners(owner6);
        System.out.println(car1.toString());
    }

    public static void main(String[] args) {

        Uppg1Main uppg1Main = new Uppg1Main();
        //min egen utökning, som skapade en lista med de bilar varje person äger
        //System.out.println(owner2.listOfCarsToString());
        //System.out.println(owner4.listOfCarsToString());
    }
}

 */