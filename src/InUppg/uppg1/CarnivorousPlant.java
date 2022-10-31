package InUppg.uppg1;

public class CarnivorousPlant extends Plant { //ärver implementering av WateringInfo (interface)
    private String color;
    private double height;
    private final static double WATERING_MULTIPLIER = 0.2;
    private final static double WATERING_BASELEVEL = 0.1;

    public CarnivorousPlant(String name, String owner, double height, String color) { //Konstruktor
        super(name, owner);
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height cannot be negative");
        }
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public double getHeight() {
        return height;
    }
    public double getWateringMultiplier() {
        return WATERING_MULTIPLIER;
    }
    public double getWateringBaselevel() {
        return WATERING_BASELEVEL;
    }

    @Override
    public String name() {
        return getName();
    }
    @Override
    public WaterType waterType() {
        return WaterType.PROTEIN_SOLUTION;
    }
    @Override
    public double amountToGive() {
        return getWateringBaselevel() + getWateringMultiplier() * getHeight();
    }
    @Override
    public String printOut() {
        String message = "Ge " + amountToGive() + " liter " + waterType().type;
        return message;
    }
}
