package sprint1.Harry.MedI;

public class MotorBikeAd extends VehicleAd {
    private int engineVolume;
    private boolean sidecar;


    public MotorBikeAd(int price, String headline, String description, int modelYear,
                       int mileage, int engineVolume, boolean sidecar) {
        super(price, headline, description, modelYear, mileage);
        this.engineVolume = engineVolume;
        this.sidecar = sidecar;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public boolean hasSidecar() {
        return sidecar;
    }


    @Override
    public String printHeader() {
        String head = "motorcykel ";
        if (getModelYear() >= 2019) {
            head = "Nästan ny " + head;
        } else if (getModelYear() <= 1982) {
            head = "Veteran" + head;
        } else if (getEngineVolume() > 120) {
            head = "Maxad " + head;
        } else {
            head = "Fantastisk " + head;
        }
        if (hasSidecar()) {
            head += "med sidovagn ";
        }
        head += getPrice() + " kr.";
        return head;
    }

    @Override
    public String printCompleteAd() {
        String text = super.printCompleteAd();
        text = printHeader() + "\n" + text;
        text += "Motorvolym: " + getEngineVolume() + " cm\u00B3. \n" +
                "Sidovagn: ";
        if (hasSidecar()) {
            text += "Ja \n";
        } else {
            text += "Nej \n";
        }
        text += getDescription();
        return text;
    }

    @Override
    public double calculateRevenue() {
        return getPrice() * 0.75 * 0.9;
    }
}
