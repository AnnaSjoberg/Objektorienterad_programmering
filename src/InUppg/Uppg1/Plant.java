package InUppg.Uppg1;
public abstract class Plant implements WateringInfo {
    private final String name;
    private final String owner;

    public Plant(String name, String owner) { //Konstruktor
        this.name = name;
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
    public String getName() {return name;}

    @Override
    public abstract double amountToGive();
    @Override
    public String printOut() {
        return "Alla växter behöver vatten ibland";
    }
}
