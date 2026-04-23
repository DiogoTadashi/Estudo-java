package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

import java.time.DayOfWeek;
import java.time.LocalDate;

class ProximoDiaUtil implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        LocalDate date = LocalDate.from(temporal);
        DayOfWeek dia = date.getDayOfWeek();
        switch (dia) {
            case THURSDAY:
                return date.plusDays(4);
            case FRIDAY:
                return date.plusDays(3);
            case SATURDAY:
                return date.plusDays(2);
            case SUNDAY:
                return date.plusDays(1);
            default:
                return date.plusDays(1);
        }
    }
}

class ProximoDiaUtilWithIf {
    public static LocalDate getProximoDiaUtil(LocalDate date) {
        if (date.getDayOfWeek().getValue() == 6) { // sábado
            return date.plusDays(2);
        } else if (date.getDayOfWeek().getValue() == 5) { // sexta
            return date.plusDays(3);
        } else if (date.getDayOfWeek().getValue() == 4) { // quinta
            return date.plusDays(4);
        } else { // demais dias
            return date.plusDays(1);
        }
    }
}

class MetodoProfessor implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek) {
            case THURSDAY:
                addDays = 4;
                break;
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
                break;
            default:
                addDays = 1;
                break;
        }

        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        //metodo com o temporalAdjuster
        LocalDate proximoDiaUtil = now.with(new ProximoDiaUtil());
        System.out.println("Hoje: " + now.getDayOfWeek());
        System.out.println("Próximo dia útil: " + proximoDiaUtil.getDayOfWeek());
        //metodo com IF
        LocalDate proximoDiaUtil2 = ProximoDiaUtilWithIf.getProximoDiaUtil(now);
        System.out.println("Próximo dia útil (If/Else): " + proximoDiaUtil2.getDayOfWeek());
        //metodo do professor
        LocalDate proximoDiaUtil3 = now.with(new MetodoProfessor());
        System.out.println("Próximo dia útil (Professor): " + proximoDiaUtil3.getDayOfWeek());
    }
}

