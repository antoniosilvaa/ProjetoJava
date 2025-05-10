package Dates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;


public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nw = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println(now);
        now = now.withDayOfMonth(12);
        System.out.println(now);
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);


        LocalDate data = LocalDate.now();
        System.out.println("Hoje é dia " + data.getDayOfWeek() + "("+ data +")");

        LocalDate proximoDiautil = obterProximoDiaUtil(data);
        System.out.println("O proximo dia util é " + proximoDiautil.getDayOfWeek() + "("+ proximoDiautil +")");


    }


public static LocalDate obterProximoDiaUtil (LocalDate data){
    LocalDate proximoDia = data;

    do {
        proximoDia = proximoDia.plusDays(1);
    }while (proximoDia.getDayOfWeek() == DayOfWeek.SATURDAY || proximoDia.getDayOfWeek() == DayOfWeek.SUNDAY);
    return proximoDia;

}
}
