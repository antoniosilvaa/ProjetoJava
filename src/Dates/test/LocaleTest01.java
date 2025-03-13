package Dates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSuicia = new Locale("it", "CH");
        Calendar calendar = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeSuicia);

        System.out.println(df.format(calendar.getTime()));
        System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println(localeItaly.getDisplayCountry(localeSuicia));
        System.out.println(localeSuicia.getDisplayCountry(localeItaly));
    }
}
