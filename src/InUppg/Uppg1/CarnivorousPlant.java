package InUppg.Uppg1;

import javax.swing.*;

public class CarnivorousPlant extends Plant implements WateringCalculator {
    private double height;
    private String color;
    private WaterType type = WaterType.PROTEIN_SOLUTION;
    private final static double WATERING_MULTIPLIER = 0.2;
    private final static double WATERING_BASELEVEL = 0.1;

    public CarnivorousPlant(String name, String owner, double height, String color) {
        super(name, owner);
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height cannot be negative");
        }
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public WaterType getWaterType() {
        return type;
    }

    public double getWateringMultiplier() {
        return WATERING_MULTIPLIER;
    }

    public double getWateringBaselevel() {
        return WATERING_BASELEVEL;
    }

    @Override
    public String printOut() {
        String message = "Ge " + calculateAmount() + " liter " + getWaterType().type;
        return message;
    }

    @Override
    public String name() {
        return getName();
    }

    @Override
    public double amountToGive() {
        //mängd = 0,1 + 0,2*höjd (liter)
        return getWateringBaselevel() + getWateringMultiplier() * getHeight();
    }

    @Override
    public double calculateAmount() {
        return getWateringBaselevel() + getWateringMultiplier() * getHeight();
    }
}
