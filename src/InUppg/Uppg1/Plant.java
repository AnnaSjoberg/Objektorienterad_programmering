package InUppg.Uppg1;
public abstract class Plant implements WateringInfo {
    private String name;
    private String owner;

    public Plant(String name, String owner) { //Konstruktor
        this.name = name;
        this.owner = owner;
    }
    public String getName() {return name;}
    public String getOwner() {
        return owner;
    }
    @Override
    public abstract double amountToGive();
    @Override
    public String printOut() {
        return "Alla växter behöver vatten ibland";
    }
}
