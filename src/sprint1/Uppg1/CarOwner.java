package sprint1.Uppg1;

import java.util.ArrayList;
import java.util.List;

public class CarOwner extends Person {
    private List<String> listOfCars = new ArrayList<>();

    public CarOwner(String name, String address, int age) {
        super(name, address, age);
    }

    public List<String> getListOfCars() {

        return listOfCars;
    }

    public void setListOfCars(List<String> listOfCars) {

        this.listOfCars = listOfCars;
    }

    void buyCar(String regNumber) {

        listOfCars.add(regNumber);
    }

    void sellCar(String regNumber) {

        listOfCars.remove(regNumber);
    }

    //@Override
    public String listOfCarsToString() {
        String message = getName() + " owns " + getListOfCars().size() + " cars";
        if (getListOfCars().size() > 0) {
            message += " with registration numbers:";
            for (String element : listOfCars) {
                message += '\n' + element;
            }
        }
        return message;
    }
}
