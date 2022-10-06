package sprint1.Harry.MedI;

public abstract class VehicleAd implements Revenuable, Publishable {
    private String makeModel;
    private String description;
    private int price;
    private int modelYear;
    private int mileage;

    public VehicleAd(int price, String makeModel, String description, int modelYear, int mileage) {
        this.price = price;
        this.makeModel = makeModel;
        this.description = description;
        this.modelYear = modelYear;
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public String getDescription() {
        return description;
    }

    public int getModelYear() {
        return modelYear;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "VehicleAd{" +
                "makeModel='" + makeModel + '\'' +
                ", description='" + description + '\'' +
                ", modelYear=" + modelYear +
                ", mileage=" + mileage +
                '}';
    }

    @Override
    public String printCompleteAd() {
        return getMakeModel() + "\n" +
                "Årsmodell: " + getModelYear() + "\n" +
                "Mätarställning: " + getMileage() + "\n";

    }
}
