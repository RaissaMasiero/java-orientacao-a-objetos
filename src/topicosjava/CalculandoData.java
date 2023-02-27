package topicosjava;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculandoData {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-02-24");
        LocalDateTime d05 = LocalDateTime.parse("2023-02-24T20:17:15");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7); // 7 dias antes de d04
        LocalDate nextWeekLocalDate = d04.plusDays(7); // 7 dias a frente de d04

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); // 7 dias antes de d05
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7); // 7 dias a frente de d05

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // 7 dias antes de d06
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("Past week D4: " + pastWeekLocalDate);
        System.out.println("Week forward D4: " + nextWeekLocalDate);

        System.out.println("Past week D5: " + pastWeekLocalDateTime);
        System.out.println("Week forward D5: " + nextWeekLocalDateTime);

        System.out.println("Past week D6: " + pastWeekInstant);
        System.out.println("Week forward D6: " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDateTime, d05); // duração entre datas
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t3 = Duration.between(pastWeekInstant, d06);

        System.out.println("T1 dias: " + t1.toDays());
        System.out.println("T2 dias: " + t2.toDays());
        System.out.println("T3 dias: " + t3.toDays());
    }
}
