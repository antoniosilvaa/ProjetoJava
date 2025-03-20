package Dates.test;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTime01 {
    public static void main(String[] args) {
      LocalTime localTime =  LocalTime.now();
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localTime.MIN);
        System.out.println(localTime.MAX);
        System.out.println(localTime.MIDNIGHT);
    }
}
