package Dates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(1978, Month.NOVEMBER,11,12,0,0);
        LocalDateTime ldt2 = LocalDateTime.now();
        ChronoUnit.DAYS.between(ldt,ldt2);

        System.out.println(ChronoUnit.DAYS.between(ldt,ldt2));
    }
}
