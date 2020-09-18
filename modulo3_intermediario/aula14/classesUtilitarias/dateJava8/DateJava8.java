package modulo3_intermediario.aula14.classesUtilitarias.dateJava8;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class DateJava8 {
    public static void main(String[] args) {

        // data dd MM yyyy
        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        System.out.println(LocalDate.of(2019, 2, 1));
        System.out.println(LocalDate.parse("2019-02-01"));

        System.out.println(agora.plusDays(30)); //pra adicionar 30 dias na data atual

        System.out.println(agora.minus(1, ChronoUnit.MONTHS)); //pra subtrair 1 mês da data atual

        System.out.println(agora.getDayOfWeek()); //Dia da semana
        System.out.println(agora.getDayOfMonth()); //Dia do mês
        System.out.println(agora.getDayOfYear()); //Dia do ano

        System.out.println("é ano bissexto: " + agora.isLeapYear()); //Se o ano é bissexto

        LocalTime hAgora = LocalTime.now();
        System.out.println(hAgora);

        System.out.println(hAgora.plusMinutes(60)); //adiciona 60min no horário atual

        System.out.println(hAgora.minus(40, ChronoUnit.MINUTES)); //subtrai 40 min do horário atual

        System.out.println(LocalTime.of(12, 33));
        System.out.println(LocalTime.parse("12:33"));

        System.out.println(hAgora.getHour()); //Mostra só a hora

        //Data completa = data + hora
        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto);

        System.out.println(LocalDateTime.of(2019, 2, 16, 20, 25, 10));
        //ou
        System.out.println(LocalDateTime.parse("2019-02-16T20:25:10"));

        System.out.println(agoraCompleto.plusYears(20)); //Adiciona 20 anos na data atual

        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);

        Set<String> fusos = ZoneId.getAvailableZoneIds();
        for (String f : fusos) {
            System.out.println(f);
        }

        ZoneId sp = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2019-02-16T20:25:10"), sp);
        System.out.println(zdt);
        System.out.println(ZonedDateTime.parse("2019-02-16T20:25:10-02:00[America/Sao_Paulo]"));

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(agoraCompleto, offset);
        System.out.println(offsetDateTime);

        Date date = new Date();
        Calendar c = Calendar.getInstance();
        LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
        System.out.println(ldtDate);
        System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
    }
}