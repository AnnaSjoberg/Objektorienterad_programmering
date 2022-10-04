package InUppg.Uppg1;

public class Cactus extends Plant { //ärver implementering av WateringInfo (interface)
    private final boolean poisonous;
    private final static double WATERING_BASELEVEL = 2;

    public Cactus(String name, String owner, boolean poisonous) { //Konstruktor
        super(name, owner);
        this.poisonous = poisonous;
    }

    public boolean isPoisonous() {
        return poisonous;
    }
    public double getWateringBaseLevel() {
        return WATERING_BASELEVEL;
    }

    @Override
    public String name() {
        return getName();
    }
    @Override
    public WaterType waterType() {
        return WaterType.MINERAL_WATER;
    }
    @Override
    public double amountToGive() {
        return getWateringBaseLevel();
    }
    @Override
    public String printOut() {
        String message = "Ge " + getWateringBaseLevel() + " cl " + waterType().type;
        if (isPoisonous()) {
            message += "\n Växten är giftig, var försiktig!";
        }
        return message;
    }
}
