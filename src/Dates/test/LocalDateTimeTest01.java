package Dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();

        LocalDateTime ldt2 = ld.atTime(lt);
        LocalDateTime ldt3 = lt.atDate(ld);

        System.out.println(ldt);
        System.out.println(ldt2);
        System.out.println(ldt3);
    }
}
