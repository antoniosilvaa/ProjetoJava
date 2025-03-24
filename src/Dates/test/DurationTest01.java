package Dates.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime lt = LocalDateTime.now().plusYears(2);
        Duration d1 =  Duration.between(localDateTime,lt);
        System.out.println(d1);
    }
}
