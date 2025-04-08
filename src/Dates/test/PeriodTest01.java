package Dates.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate nascimento = LocalDate.of(2004,4,17);
        Period Hoje = Period.between(nascimento,LocalDate.now());
        LocalDate now = LocalDate.now();

        System.out.println(Hoje);
        System.out.println(now.until(now.plusDays(Hoje.getDays()), ChronoUnit.DAYS));
    }
}
