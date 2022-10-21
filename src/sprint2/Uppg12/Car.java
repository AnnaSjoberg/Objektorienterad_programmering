package sprint2.Uppg12;

import java.io.Serializable;

//wheels -> 2d
public class Car extends Vehicle implements Printable, Wheeled {
    private int numberOfGears;
    private int currentGear;

    private int wheels; //2d


    public Car(int speed, double weight, int numberOfGears, int currentGear, int wheels) {
        super(speed, weight);
        if (numberOfGears > 0) {
            this.numberOfGears = numberOfGears;
        }
        if (currentGear > 0 && currentGear <= getNumberOfGears()) {
            this.currentGear = currentGear;
        }
        if (wheels > 0) { //2d
            this.wheels = wheels;
        }
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void changeGear(int speed) {
        if (speed < super.getSpeed() && getCurrentGear() > 1) {
            setCurrentGear(getCurrentGear() - 1);
        } else if (speed > super.getSpeed() && getCurrentGear() < getNumberOfGears()) {
            setCurrentGear(getCurrentGear() + 1);
        } else {
            return;
        }
    }


    @Override
    public String printMe() {
        String printOut = "Available data on car: \n" +
                "Weight: " + getWeight() + " kg. \n" +
                "Speed: " + getSpeed() + " kph. \n" +
                "Number of gears: " + getNumberOfGears() + ". \n" +
                "Current gear: " + getCurrentGear() + ". \n" +
                "Number of wheels: " + getNumberOfWheels(); //2d egen utökning att lägga in det som hörde till det andra interfacet här
        return printOut;
    }

    @Override
    public int getNumberOfWheels() { //2d
        return this.wheels;
    }

}
