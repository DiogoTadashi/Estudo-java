package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "dd/MM/yyyy";
        String pattern2 = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern3 = "'Brasil' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
        SimpleDateFormat sdf3 = new SimpleDateFormat(pattern3);
        System.out.println(sdf.format(new Date()));
        System.out.println(sdf2.format(new Date()));
        System.out.println(sdf3.format(new Date()));

    }
}
