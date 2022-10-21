package sprint2.Uppg12;

import java.io.Serializable;

public abstract class Vehicle implements Serializable {
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
}

