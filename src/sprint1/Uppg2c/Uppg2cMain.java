package sprint1.Uppg2c;

public class Uppg2cMain {
    public static void main(String[] args) {
        Car car = new Car(50, 1295, 6, 3, 4);
        Boat boat = new Boat(5, 500, 750);
        Bicycle bike = new Bicycle(25, 15, 3, 2,3);
        Train train = new Train(300, 5000, 6);

        System.out.println(train.printMe());

        Printable p = new Car(75,1450,5,5,5);
        System.out.println(p.printMe());

        Wheeled w = new Bicycle(15,20,1,1,1);

    }
}
