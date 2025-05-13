package Dates.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();

       String s1 = ldt.format(DateTimeFormatter.BASIC_ISO_DATE);
       String s2 = ldt.format(DateTimeFormatter.ISO_LOCAL_DATE);
       String s3 = ldt.format(DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
