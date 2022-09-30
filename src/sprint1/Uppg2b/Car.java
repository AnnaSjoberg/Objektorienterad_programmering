package sprint1.Uppg2b;

public class Car extends Vehicle {
    private int numberOfGears;
    private int currentGear;

    public Car(int speed, double weight, int numberOfGears, int currentGear) {
        super(speed, weight);
        if (numberOfGears > 0) {
            this.numberOfGears = numberOfGears;
        }
        if (currentGear > 0 && currentGear <= getNumberOfGears()) {
            this.currentGear = currentGear;
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
    public String  printMe() {
        String printOut = "Available data on car: \n" +
                "Weight: " + getWeight() + " kg. \n" +
                "Speed: " + getSpeed() + " kph. \n" +
                "Number of gears: " + getNumberOfGears() + ". \n" +
                "Current gear: " + getCurrentGear() + ".";
        return printOut;
    }
}
