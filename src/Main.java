import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("HH:mm:ss z");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String s = df.format(date);
        System.out.println(s);
    }

}