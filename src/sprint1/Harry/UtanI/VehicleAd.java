package sprint1.Harry.UtanI;

public abstract class VehicleAd {
    private String headline;
    private String description;
    private int price;
    private int modelYear;
    private int mileage;

    public VehicleAd(int price, String headline, String description, int modelYear, int mileage) {
        this.price = price;
        this.headline = headline;
        this.description = description;
        this.modelYear = modelYear;
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public String getHeadline() {
        return headline;
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

    public String getAdText() {
        return headline + "\n" +
                description + "\n" +
                "Pris:\t" + price + " kr\n" +
                "Årsmodell:\t" + modelYear + "\n" +
                "Mätarställning:\t" + mileage + " mil\n";
    }
}
