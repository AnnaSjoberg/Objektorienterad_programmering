package InUppg.Uppg1;

public class Cactus extends Plant { //ärver implementering av WateringInfo (interface)
    private boolean poisonous;
    private WaterType type = WaterType.MINERAL_WATER;
    private final static double WATERING_BASELEVEL = 2;

    public Cactus(String name, String owner, boolean poisonous) { //Konstruktor
        super(name, owner);
        this.poisonous = poisonous;
    }

    public boolean isPoisonous() {
        return poisonous;
    }
    public WaterType getWaterType() {
        return type;
    }
    public double getWateringBaseLevel() {
        return WATERING_BASELEVEL;
    }

    @Override
    public String name() {
        return getName();
    }
    @Override
    public double amountToGive() {
        return getWateringBaseLevel();
    }
    @Override
    public String printOut() {
        String message = "Ge " + getWateringBaseLevel() + " cl " + getWaterType().type;
        if (isPoisonous()) {
            message += "\n Växten är giftig, var försiktig!";
        }
        return message;
    }
}
