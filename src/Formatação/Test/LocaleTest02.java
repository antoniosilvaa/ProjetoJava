package Formatação.Test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoLanguages = Locale.getISOLanguages();
        String[] isoCountries = Locale.getISOCountries();

        for (String isolgs : isoLanguages){
            System.out.print(isolgs + " ");
        }
        System.out.println();
        for (String isoCnt : isoCountries){
            System.out.print(isoCnt + " ");
        }
    }
}
