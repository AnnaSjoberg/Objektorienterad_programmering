package sprint1.Uppg1;

import org.junit.jupiter.api.Test;

class CarTest {
    CarOwner ownerB = new CarOwner("B", "hemma", 50);
    CarOwner ownerC = new CarOwner("C", "hemhemma", 75);
    Car carA = new Car("ABC789", "", "", ownerB);

    @Test
    void getOwner() {
        assert (carA.getOwner() == ownerB);
        assert (carA.getOwner() != ownerC);
    }

    @Test
    void changeOwners() {
        assert (carA.getOwner() == ownerB);
        carA.getOwner().sellCar("ABC789");
        carA.setOwner(ownerC);
        carA.getOwner().buyCar("ABC789");

        assert (carA.getOwner() == ownerC);
    }

    @Test
    void setOwner() {
        assert (carA.getOwner() == ownerB);
        carA.setOwner(ownerC);
        assert (carA.getOwner() == ownerC);
    }
}