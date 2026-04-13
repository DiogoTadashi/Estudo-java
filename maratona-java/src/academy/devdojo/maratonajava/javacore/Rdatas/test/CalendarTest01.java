package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Sunday is the first day of the week");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        Date date = c.getTime();
        System.out.println(date);
        c.add(Calendar.DAY_OF_MONTH, 2);
        Date date2 = c.getTime();
        System.out.println(date2);
        c.add(Calendar.HOUR, 2);
        Date date3 = c.getTime();
        System.out.println(date3);
        c.roll(Calendar.HOUR, 23);
        Date date4 = c.getTime();
        System.out.println(date4);
    }
}
