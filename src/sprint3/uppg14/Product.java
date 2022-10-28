package sprint3.uppg14;

public class Product {
    private String name;
    private int prio;

    public Product(String name, int prio) {
        this.name = name;
        this.prio = prio;
    }

    public String getName() {
        return name;
    }

    public int getPrio() {
        return prio;
    }
}
