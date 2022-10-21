package sprint2.Uppg12;

public class Train extends Vehicle implements Printable {
    private int numberOfCarriages;

    public Train(int speed, double weight, int numberOfCarriages) {
        super(speed, weight);
        if (numberOfCarriages > 0) {
            this.numberOfCarriages = numberOfCarriages;
        }
    }

    public int getNumberOfCarriages() {
        return numberOfCarriages;
    }

    public void changeNumberOfCarriages(int numberOfCarriages) {
        if (numberOfCarriages > getNumberOfCarriages()) {
            System.out.println(numberOfCarriages - getNumberOfCarriages() + " extra carriages connected to the train");
        } else if (numberOfCarriages < getNumberOfCarriages()) {
            System.out.println(getNumberOfCarriages() - numberOfCarriages + " carriages disconnected from the train");
        }

        this.numberOfCarriages = numberOfCarriages;

    }

    @Override
    public String printMe() {
        String printOut = "Available data on train: \n" +
                "Weight: " + getWeight() + " kg. \n" +
                "Speed: " + getSpeed() + " kph. \n" +
                "Number of carriages: " + getNumberOfCarriages();
        return printOut;
    }
}
