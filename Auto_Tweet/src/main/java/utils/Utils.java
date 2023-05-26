package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utils {
    public static Date convertToTimestamp(String tweetTimestamp) throws ParseException {
        Date date = new SimpleDateFormat("hh").parse(tweetTimestamp);
        return date;
    }

    public static boolean compareDates(Date fromDate, Date toDate) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(fromDate);
        cal2.setTime(toDate);
        boolean diff = false;
        if (cal1.after(cal2)) {
            diff = true;
            System.out.println("Date1 is after Date2");
        }

        if (cal1.before(cal2)) {
            diff = false;
            System.out.println("Date1 is before Date2");
        }

        if (cal1.equals(cal2)) {
            diff = true;
            System.out.println("Date1 is equal Date2");
        }
        return diff;
    }
}
