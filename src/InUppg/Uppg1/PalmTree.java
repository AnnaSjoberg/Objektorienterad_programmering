package InUppg.Uppg1;

import javax.swing.*;

public class PalmTree extends Plant implements WateringCalculator {
    private double height;
    private boolean fruitBearing;
    private final static String WATER_TYPE = "Kranvatten";
    private final static double WATERING_MULTIPLIER = 0.5;

    public PalmTree(String name, String owner, double height, boolean fruitBearing) {
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

    public String getWaterType() {
        return WATER_TYPE;
    }

    public double getWateringMultiplier() {
        return WATERING_MULTIPLIER;
    }


    @Override
    public String printOut() {
        String message = "Ge " + calculateAmount() + " liter " + getWaterType();
        return message;
    }
    @Override
    public String name() {
        return getName();
    }

    @Override
    public double amountToGive() {
        //mängd = höjd * 0,5 (liter)
        return getWateringMultiplier() * getHeight();
    }

    @Override
    public double calculateAmount() {
        return getWateringMultiplier() * getHeight();
    }
}
