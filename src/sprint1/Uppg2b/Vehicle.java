package sprint1.Uppg2b;

public abstract class Vehicle {
    private int speed;
    private double weight;

    public Vehicle(int speed, double weight) {
        if (speed >= 0) {
            this.speed = speed;
        }
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public double getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setNewSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            this.speed = 0;
        }
    }

    public abstract String printMe ();
}
