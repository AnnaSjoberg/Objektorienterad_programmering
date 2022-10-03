package InUppg.Uppg1;

import javax.swing.*;

public class Cactus extends Plant implements WateringInfo{
    private boolean poisonous;
    private final String waterType = "Mineralvatten";
    private final double wateringBaseAmount = 2;
    public Cactus(String name, String owner, boolean poisonous) {
        super(name, owner); //Hur lösa detta snyggast? Går det att göra mha flera konstruktorer?
        this.poisonous=poisonous;
    }

    public String getWaterType() {
        return waterType;
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public double getWateringBaseAmount() {
        return wateringBaseAmount;
    }

    @Override
    public void printOut() { //Eller borde jag istället använda en String så att jag får en returtyp? OCh sen ha själva rutan i main
        //Här skriver jag ut informationen om hur vattning
        JOptionPane.showMessageDialog(null, "Ge " + amountToGive() + " cl " + getWaterType());
    }

    @Override
    public double amountToGive() {
        return getWateringBaseAmount();
    }
}
