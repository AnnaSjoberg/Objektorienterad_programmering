package sprint2.Uppg12;

public class Bicycle extends Vehicle implements Wheeled {
    private int numberOfGears;
    private int currentGear;
    private int wheels;//2d

    public Bicycle(int speed, double weight, int numberOfGears, int currentGear, int wheels) {
        super(speed, weight);
        if (numberOfGears > 0) {
            this.numberOfGears = numberOfGears;
        }
        if (currentGear > 0 && currentGear <= getNumberOfGears()) {
            this.currentGear = currentGear;
        }
        if (wheels > 0) {//2d
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

    @Override
    public void setNewSpeed(int speed) {
        changeGear(speed);
        super.setNewSpeed(speed);
    }


    public void changeGear(int speed) {
        if (speed < super.getSpeed() && getCurrentGear() > 1) {
            setCurrentGear(getCurrentGear() - 1);
        } else if (speed > super.getSpeed() && getCurrentGear() < getNumberOfGears()) {
            setCurrentGear(getCurrentGear() + 1);
        } else {
            System.out.println("Cannot change gears as requested");
        }

    }

    @Override
    public String printMe() {
        String res = super.printMe();
        res = "Available data on bicycle: \n" +
                "Weight: " + getWeight() + " kg. \n" +
                "Speed: " + getSpeed() + " kph. \n" +
                "Number of gears: " + getNumberOfGears() + ". \n" +
                "Current gear: " + getCurrentGear() + ".";
        return res;
    }

    @Override
    public int getNumberOfWheels() { //2d
        return this.wheels;
    }

}
