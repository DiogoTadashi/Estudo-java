package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.APRIL, 3);
        LocalTime time = LocalTime.of(22, 12, 03);
        System.out.println(localDateTime);
        System.out.println(localDateTime.toLocalDate());
        LocalDateTime ldt = date.atTime(time);
        LocalDateTime ldtNow = time.atDate(LocalDate.now());
        System.out.println(ldt);
        System.out.println(ldtNow);

    }
}
