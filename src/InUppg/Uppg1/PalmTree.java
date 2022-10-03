package InUppg.Uppg1;

import javax.swing.*;

public class PalmTree extends Plant implements WateringInfo{
    private double height;
    private boolean fruitBearing;
    private final String waterType = "Kranvatten";
    private final double wateringMultiplier = 0.5;

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
        return waterType;
    }

    public double getWateringMultiplier() {
        return wateringMultiplier;
    }

    @Override
    public void printOut() {
        //Här skriver jag ut informationen om hur vattning
        JOptionPane.showMessageDialog(null, "Ge " + amountToGive() + " l " + getWaterType());
    }

    @Override
    public double amountToGive() {
        //mängd = höjd * 0,5 (liter)
        return getWateringMultiplier() * getHeight();
    }

}
