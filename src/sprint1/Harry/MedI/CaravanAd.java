package sprint1.Harry.MedI;

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
    public String printHeader() {
        String head = "husvagn ";
        if (getModelYear() >= 2019) {
            head = "Nästan ny " + head;
        } else if (hasShower()) {
            head = "Välutrustad " + head;
        } else if (getBeds() > 5) {
            head = "Rymlig " + head;
        } else if (getBeds() <= 2) {
            head = "Nätt " + head;
        } else {
            head = "Mysig ";
        }
        head += getPrice() + " kr.";
        return head;
    }

    @Override
    public String printCompleteAd() {
        String text = super.printCompleteAd();
        text = printHeader() + "\n" + text;
        text += "Antal sovplatser:\t" + getBeds() + "\n";
        if (hasShower()) {
            text += "Med inbygd dusch för högsta komfort!\n";
        }
        text+=getDescription();
        return text;
    }

    @Override
    public double calculateRevenue() {
        return getPrice() * 0.75;
    }
}