package sprint1.Uppg1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarOwnerTest {
    CarOwner b = new CarOwner("B", "hemma", 34);
    CarOwner c = new CarOwner("C", "hemma", 43);


    @Test
    void getListOfCars() {
        assert (b.getListOfCars().size() == 0);
    }

    @Test
    void buyCar() {
        b.getListOfCars().add("ABC789");
        assert (b.getListOfCars().size()==1);
        assert (b.getListOfCars().get(0).equals("ABC789"));
        assert (c.getListOfCars().size()!=10);

    }

    @Test
    void sellCar() {
        c.getListOfCars().add("ERS345");
        c.getListOfCars().add("BIL002");
        assert (c.getListOfCars().size() == 2);
        c.getListOfCars().remove("ERS345");
        assert (c.getListOfCars().size() == 1);
    }
}