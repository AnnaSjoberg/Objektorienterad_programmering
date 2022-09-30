package sprint1.Uppg2b;

public class Uppg2bMain {
    public static void main(String[] args) {
        Car car = new Car(50, 1295, 6, 3);
        Boat boat = new Boat(5, 500, 750);
        Bicycle bike = new Bicycle(25, 15, 3, 2);
        Train train = new Train(300, 5000, 6);

        System.out.println(car.printMe());
        System.out.println();
        System.out.println(boat.printMe());
        System.out.println();
        System.out.println(bike.printMe());
        System.out.println();
        System.out.println(train.printMe());
    }
}
