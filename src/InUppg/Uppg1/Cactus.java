package InUppg.Uppg1;

import javax.swing.*;

public class Cactus extends Plant {
    private boolean poisonous;
    private WaterType type = WaterType.MINERAL_WATER;
    private final static double WATERING_BASE_AMOUNT = 2;

    public Cactus(String name, String owner, boolean poisonous) {
        super(name, owner);
        this.poisonous = poisonous;
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public WaterType getWaterType() {
        return type;
    }

    public double getWateringBaseAmount() {
        return WATERING_BASE_AMOUNT;
    }

    @Override
    public String printOut() {
        String message="Ge " + getWateringBaseAmount() + " cl " + getWaterType().type;
        if (isPoisonous()){
            message += "\n Växten är giftig, var försiktig!";
        }
        return message;
    }

    @Override
    public String name() {
        return getName();
    }

    @Override
    public double amountToGive() {
        return getWateringBaseAmount();
    }
}
