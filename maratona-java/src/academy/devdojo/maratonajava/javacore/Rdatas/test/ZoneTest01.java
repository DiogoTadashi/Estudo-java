package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId SPZone = ZoneId.of("America/Sao_Paulo");
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(SPZone);
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(SPZone);
        System.out.println(zonedDateTime);
        ZonedDateTime tokyoNow = ZonedDateTime.now(tokyoZone);
        System.out.println(tokyoNow);

        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime1 = instant.atZone(tokyoZone);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);


        ZoneId manausZone = ZoneId.of("America/Manaus");
        ZonedDateTime manausNow = ZonedDateTime.now(manausZone);
        System.out.println(manausNow);

        ZoneOffset offSetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime manausTime = instant.atOffset(offSetManaus);
        System.out.println(manausTime);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}
