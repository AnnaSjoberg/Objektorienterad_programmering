package InUppg.Uppg1;

import javax.swing.*;

public class CarnivorousPlant extends Plant implements WateringInfo {
    private double height;
    private String color;
    private final String waterType = "Proteinvätska";
    private final double wateringMultiplier = 0.2;
    private final double wateringBaseAmount = 0.1;

    public CarnivorousPlant(String name, String owner, double height, String color) {
        super(name, owner);
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height cannot be negative");
        }
        this.color = color;
    }

    public String getWaterType() {
        return waterType;
    }

    public double getWateringMultiplier() {
        return wateringMultiplier;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getWateringBaseAmount() {
        return wateringBaseAmount;
    }

    @Override
    public void printOut() {
        //Här skriver jag ut informationen om hur vattning
        JOptionPane.showMessageDialog(null, "Ge " + amountToGive() + " l " + getWaterType());
    }

    @Override
    public double amountToGive() {
        //mängd = 0,1 + 0,2*höjd (liter)
        return getWateringBaseAmount() + getWateringMultiplier() * getHeight();
    }
}
