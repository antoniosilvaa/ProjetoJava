package Dates.test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println(now);
    }
}
