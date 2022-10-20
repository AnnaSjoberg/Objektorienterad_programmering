package sprint2.Uppg10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class TimeCheck {
    protected final List<String> zoneIDs = List.of("Asia/Shanghai", "Europe/Stockholm", "America/Toronto");

    protected String formatName(String inputCity) {
        String formatted = inputCity.toLowerCase().trim();
        return formatted;
    }

    private String getFormattedTime(String id) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("HH:mm:ss z");
        df.setTimeZone(TimeZone.getTimeZone(id));
        return df.format(date);
    }

    public String printCityTime(String inputCity) {
        String formattedCity = formatName(inputCity);
        String id = null;
        for (String zoneID : zoneIDs) {
            if (isCityOnList(zoneID, formattedCity)) {
                id = zoneID;
            }
        }
        if (id != null) {
            return "Current time in " + formattedCity + ": " + getFormattedTime(id);
        } else {
            return "Information on time for " + formattedCity + " is not available";
        }
    }
    private boolean isCityOnList(String zoneID, String formattedCity) {
        return zoneID.toLowerCase().contains(formattedCity);
    }
}