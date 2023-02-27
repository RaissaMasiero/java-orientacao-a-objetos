package topicosjava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConverterData {

    public static void main(String[] args) {

        // convertendo datas globais para locais e obtendo dados de uma data-hora local

        // ZoneId.getAvailableZoneIds() = mostra todos os fusos horários disponíveis pra uso

        LocalDate d04 = LocalDate.parse("2023-02-24");
        LocalDateTime d05 = LocalDateTime.parse("2023-02-24T20:17:15");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("R1: " + r1);
        System.out.println("R2: " + r2);
        System.out.println("R3: " + r3);
        System.out.println("R4: " + r4);

        System.out.println("D4 dia: " + d04.getDayOfMonth());
        System.out.println("D4 Mês: " + d04.getMonth()); // mês por escrito
        System.out.println("D4 Mês: " + d04.getMonthValue()); // mês em número
        System.out.println("D4 Mês: " + d04.getYear());
        System.out.println("D5 hora: " + d05.getHour());
        System.out.println("D5 hora: " + d05.getMinute());
    }
}
