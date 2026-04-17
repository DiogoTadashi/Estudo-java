package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Locale localeUS = Locale.US;
        Locale locale = new Locale("pt", "BR");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance(localeUS);
        nfa[1] = NumberFormat.getCurrencyInstance(localeJapao);
        nfa[2] = NumberFormat.getCurrencyInstance(locale);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        double valor = 1_000.2130;
        for (NumberFormat nf : nfa) {
            System.out.println(nf.getMaximumFractionDigits());
            System.out.println(nf.format(valor));
        }
        String valorString = "$1,000.21";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
