package sprint1.Harry.UtanI;

public class CarAd extends VehicleAd {
    private String color;
    private boolean hasSummerTyres;
    private boolean hasWinterTyres;
    //  private TextGenerator textGenerator = new TextGenerator();

    public CarAd(int price, String headline, String description, int modelYear, int mileage,
                 String color, boolean summerTyres, boolean winterTyres) {
        super(price, headline, description, modelYear, mileage);
        this.color = color;
        this.hasSummerTyres = summerTyres;
        this.hasWinterTyres = winterTyres;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasSummerTyres() {
        return hasSummerTyres;
    }

    public boolean isHasWinterTyres() {
        return hasWinterTyres;
    }

    @Override
    public String getAdText() {
        String text = super.getAdText();
        text += "Färg: " + getColor() + "\n";
        /*if(isHasWinterTyres()||isHasSummerTyres()) {
            text+= "Medföljande däck:\n";
            if (isHasSummerTyres()) {
                text+="Sommardäck\n";
            }
            if(isHasWinterTyres()){
                text+="Vinterdäck\n";
            }
        }*/
        text += "Sommardäck:\t";
        if (isHasSummerTyres()) {
            text += "Ja\n";
        } else {
            text += "Nej\n";
        }
        text += "Vinterdäck:\t";
        if (isHasWinterTyres()) {
            text += "Ja\n";
        } else {
            text += "Nej\n";
        }
        return text;
    }
}

