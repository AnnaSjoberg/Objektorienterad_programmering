package sprint1.Harry.UtanI;

public class CaravanAd extends VehicleAd {
    private boolean shower;
    private int beds;

    public CaravanAd(int price, String headline, String description, int modelYear,
                     int mileage, boolean shower, int beds) {
        super(price, headline, description, modelYear, mileage);
        this.shower = shower;
        this.beds = beds;
    }

    public boolean hasShower() {
        return shower;
    }

    public int getBeds() {
        return beds;
    }

    @Override
    public String getAdText() {
        String text = super.getAdText();
        text+="Antal sovplatser:\t" + getBeds() + "\n";
        if (hasShower()){
            text+="Med inbygd dusch för högsta komfort!\n";
        }
        return text;
    }
}