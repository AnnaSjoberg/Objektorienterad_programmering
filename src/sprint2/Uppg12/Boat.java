package sprint2.Uppg12;

public class Boat extends Vehicle {
    private double deadWeightTonnage;

    public Boat(int speed, double weight, double deadWeightTonnage) {
        super(speed, weight);
        if (deadWeightTonnage >= super.getWeight()) {
            this.deadWeightTonnage = deadWeightTonnage;
        }
    }

    public double getDeadWeightTonnage() {
        return deadWeightTonnage;
    }

    public void turn(int direction) {
        if (direction > 0) {
            System.out.println("Turning right");
        } else if (direction < 0) {
            System.out.println("Turning left");
        } else {
            System.out.println("Full speed ahead");
        }
    }

    @Override
    public String printMe() {
        String res = super.printMe();
        res = "Available data on boat: \n" +
                "Speed: " + getSpeed() + " kph. \n" +
                "Weight: " + getWeight() + " kg. \n" +
                "Dead weight tonnage: " + getDeadWeightTonnage();
        return res;
    }
}
