package sprint1.Harry.UtanI;

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
    public String getAdText() {
        String text = super.getAdText();
        text+="Motorvolym:\t" + getEngineVolume() + " cm\u00B3. \n";
        if (hasSidecar()){
            text+="I sidovagnen kan du bekvämt ta med en vän\n";
        }
        return text;
    }
}
