package Dates.test;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[6];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance(DateFormat.FULL);
        df[2] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[3] = DateFormat.getDateInstance(DateFormat.LONG);
        df[4] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[5] = DateFormat.getInstance();
        for (DateFormat dateFormat: df){
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
