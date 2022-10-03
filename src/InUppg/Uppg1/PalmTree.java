package InUppg.Uppg1;

import javax.swing.*;

public class PalmTree extends Plant { //ärver implementering av WateringInfo (interface)
    private boolean fruitBearing;
    private double height;
    private WaterType type = WaterType.TAP_WATER;
    private final static double WATERING_MULTIPLIER = 0.5;

    public PalmTree(String name, String owner, double height, boolean fruitBearing) {//konstruktor
        super(name, owner);
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height cannot be negative.");
        }
        this.fruitBearing = fruitBearing;
    }

    public double getHeight() {
        return height;
    }
    public boolean isFruitBearing() {
        return fruitBearing;
    }
    public WaterType getWaterType() {
        return type;
    }
    public double getWateringMultiplier() {
        return WATERING_MULTIPLIER;
    }

    @Override
    public String name() {
        return getName();
    }
    @Override
    public double amountToGive() {
        return getWateringMultiplier() * getHeight();
    }
    @Override
    public String printOut() {
        String message = "Ge " + amountToGive() + " liter " + getWaterType().type;
        return message;
    }
}
