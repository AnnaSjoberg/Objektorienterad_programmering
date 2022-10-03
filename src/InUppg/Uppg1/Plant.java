package InUppg.Uppg1;

public abstract class Plant {
    private String name;
    private String owner;

    public Plant(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }
    public String getOwner() {
        return owner;
    }
    public void printOut (){}
}
