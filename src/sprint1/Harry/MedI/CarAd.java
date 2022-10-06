package sprint1.Harry.MedI;

public class CarAd extends VehicleAd {
    private String color;
    private boolean summerTyres;
    private boolean winterTyres;
    private boolean electric;

    public CarAd(int price, String headline, String description, int modelYear, int mileage,
                 String color, boolean summerTyres, boolean winterTyres, boolean electric) {
        super(price, headline, description, modelYear, mileage);
        this.color = color;
        this.summerTyres = summerTyres;
        this.winterTyres = winterTyres;
        this.electric = electric;
    }

    public String getColor() {
        return color;
    }

    public boolean hasSummerTyres() {
        return summerTyres;
    }

    public boolean hasWinterTyres() {
        return winterTyres;
    }

    public boolean isElectric() {
        return electric;
    }


    @Override
    public String printHeader() {
        String head = "bil ";
        if (isElectric()) {
            head = "el" + head;
        }
        if (getModelYear() >= 2019) {
            head = "Nästan ny " + head;
        } else if (getModelYear() <= 1992) {
            head = "Veteran" + head;
        } else if (getMileage() < 5000) {
            head = "Sparsamt körd " + head;
        } else {
            head = "Fin " + head;
        }
        head += getPrice() + " kr.";
        return head;
    }

    @Override
    public String printCompleteAd() {
        String text = super.printCompleteAd();
        text = printHeader() + "\n" + text;
        text += "Färg: " + getColor() + "\n" +
                "Sommardäck: ";
        if (hasSummerTyres()) {
            text += "Ja\n";
        } else {
            text += "Nej\n";
        }
        text += "Vinterdäck: ";
        if (hasWinterTyres()) {
            text += "Ja\n";
        } else {
            text += "Nej\n";
        }
        text += getDescription();
        return text;
    }

    @Override
    public double calculateRevenue() {
        return getPrice() * 0.75;
    }
}

