package topicosjava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class FormatandoDate {

    public static void main(String[] args) {

        // convertendo data para texto

        LocalDate d04 = LocalDate.parse("2023-02-24");
        LocalDateTime d05 = LocalDateTime.parse("2023-02-24T20:17:15");
        Instant d06 = Instant.parse("2023-02-24T20:17:15Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("D04: " + d04.format(fmt1));
        System.out.println("D04: " + fmt1.format(d04));

        System.out.println("D05: " + fmt2.format(d05));

        System.out.println("D06: " + fmt3.format(d06));
    }
}
