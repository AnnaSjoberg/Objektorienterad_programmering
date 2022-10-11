package sprint2.Uppg4;

import java.util.Locale;

public class FuelCalculator {
    private double odometerLastYear;
    private double odometerToday;
    private double fuelTotal;

    public FuelCalculator(double odometerLastYear, double odometerToday, double fuelTotal) {
        if (odometerLastYear >= 0) {
            this.odometerLastYear = odometerLastYear;
        } else {
            throw new IllegalArgumentException("odometerLastYear cannot be less than 0");
        }
        if (odometerToday >= odometerLastYear) {
            this.odometerToday = odometerToday;
        } else {
            throw new IllegalArgumentException("odometerToday cannot be less than odometerLastYear");
        }
        if (fuelTotal >= 0) {
            this.fuelTotal = fuelTotal;
        } else {
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

    public String oneLineToString(double input) {
        String message = "";
        if (input == getYearlyDistance()) {
            message = (String.format(Locale.US, "Antal körda mil: %4.1f", input));
        } else if (input == getFuelTotal()) {
            message = (String.format(Locale.US, "Antal liter bensin: %4.1f", input));
        } else if (Math.abs(input - getAverageConsumption()) < Math.pow(10, -15)) {
            message = (String.format(Locale.US, "Förbrukning per mil: %4.2f", input));
        }
        return message.trim();
    }

    public StringBuilder fullMessage() {
        StringBuilder fullMessage = new StringBuilder(oneLineToString(getYearlyDistance()));
        fullMessage.append("\n" + oneLineToString(getFuelTotal()));
        fullMessage.append("\n" + oneLineToString(getAverageConsumption()));
        return fullMessage;
    }

}
