package topicosjava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // instanciação
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2023-02-24");
        LocalDateTime d05 = LocalDateTime.parse("2023-02-24T20:17:15");
        Instant d06 = Instant.parse("2023-02-24T20:17:15Z");
        Instant d07 = Instant.parse("2023-02-24T20:17:15-03:00");

        // texto formato customizado
        LocalDate d08 = LocalDate.parse("24/02/2023", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("24/02/2023 01:30", fmt2);

        // datas com dados isolados
        LocalDate d10 = LocalDate.of(2023, 2, 24);
        LocalDateTime d11 = LocalDateTime.of(2023, 2, 24, 1, 30);

        System.out.println("D1: " + d01);
        System.out.println("D2: " + d02);
        System.out.println("D2: " + d03);
        System.out.println("D4: " + d04);
        System.out.println("D5: " + d05);
        System.out.println("D6: " + d06);
        System.out.println("D7: " + d07);
        System.out.println("D8: " + d08);
        System.out.println("D9: " + d09);
        System.out.println("D10: " + d10);
        System.out.println("D11: " + d11);
    }
}
