package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale locale = new Locale("pt", "BR");
        Locale localeItaly = new Locale("it", "IT");
        Locale localeFrance = new Locale("fr", "FR");
        Locale localeIndia = new Locale("in", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeChina = new Locale("zh", "CN");

        Calendar calender = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, locale);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeFrance);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeChina);

        System.out.println("Brasil "+df1.format(calender.getTime()));
        System.out.println("Italia "+df2.format(calender.getTime()));
        System.out.println("França "+df3.format(calender.getTime()));
        System.out.println("India "+df4.format(calender.getTime()));
        System.out.println("Japão "+df5.format(calender.getTime()));
        System.out.println("China "+df6.format(calender.getTime()));

        System.out.println("--------------------");

        System.out.println(locale.getDisplayCountry());
        System.out.println(localeJapao.getDisplayCountry(localeJapao));
        System.out.println(localeJapao.getDisplayLanguage(localeJapao));
        System.out.println(localeChina.getDisplayCountry(localeChina));
    }
}
