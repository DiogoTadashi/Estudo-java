package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Locale localeUS = Locale.US;
        Locale locale = new Locale("pt", "BR");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance(localeUS);
        nfa[2] = NumberFormat.getInstance(localeJapao);
        nfa[1] = NumberFormat.getInstance(locale);
        nfa[3] = NumberFormat.getInstance(localeIT);
        double valor = 10_000.2130;
        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(valor));
        }
    }
}
