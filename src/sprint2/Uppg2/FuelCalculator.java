package sprint2.Uppg2;
//får inte till testning av utskriften. avvaktar detta tillsvidare
import java.util.Locale;

public class FuelCalculator {
    private double odometerLastYear;
    private double odometerToday;
    private double fuelTotal;

    public FuelCalculator(double odometerLastYear, double odometerToday, double fuelTotal) {
        if (odometerLastYear >= 0) {
            this.odometerLastYear = odometerLastYear;
        }else {
            throw new IllegalArgumentException("odometerLastYear cannot be less than 0");
        }
        if (odometerToday >= odometerLastYear) {
            this.odometerToday = odometerToday;
        }else {
            throw new IllegalArgumentException("odometerToday cannot be less than odometerLastYear");
        }
        if (fuelTotal >=0) {
            this.fuelTotal = fuelTotal;
        }else {
            throw new IllegalArgumentException("fuelTotal cannot be less than 0");
        }
    }

    public double getOdometerToday() {
        return odometerToday;
    }

    public double getOdometerLastYear() {
        return odometerLastYear;
    }

    public double getFuelTotal() {
        return fuelTotal;
    }

    public double getYearlyDistance() {
        return getOdometerToday() - getOdometerLastYear();
    }

    public double getAverageConsumption() {
        return getFuelTotal() / getYearlyDistance();
    }

    public String printMe(){
        String message ="Antal körda mil: " + getYearlyDistance();
        message+="\nAntal liter bensin: " + getFuelTotal();
        message+= (String.format(Locale.US, "\nFörbrukning per mil: %4.2f", getAverageConsumption()));
        return message;

        /*
        Antal körda mil: 1487.0
        Antal liter bensin: 1235.4
        Förbrukning per mil: 0.83
         */
    }

}
