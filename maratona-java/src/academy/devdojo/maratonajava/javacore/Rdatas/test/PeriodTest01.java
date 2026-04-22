package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate ldtNow = LocalDate.now();
        LocalDate ldtAfterTwoYears = LocalDate.now().plusYears(2).plusDays(45);
        Period p1 = Period.between(ldtNow, ldtAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(20);
        Period p4 = Period.ofMonths(20);
        Period p5 = Period.ofYears(20);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}
