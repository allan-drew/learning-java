package br.com.cursojava.c05utilitiestime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;


// Duration: This class models a quantity or amount of time in terms of seconds and nanoseconds.

public class DurationTest01 {

    public static void main(String[] args) {

        //
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(43);

        // P is the duration (period) --> datas
        // T is the time --> tempos
        Duration d01 = Duration.between(now, nowAfterTwoYears);
        System.out.println(d01); // P T 17544H 43M 0.000032S ----> 17544H (17544 horas), 43M (43 minutos) e 0.000032S (0.000032 segundos) entre agora e 2 anos + 43 minutos


        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
        Duration d02 = Duration.between(timeNow, timeMinus7Hours);
        System.out.println(d02); //

        //
        Duration d03 = Duration.between(Instant.now(), Instant.now().plusSeconds(60));
        System.out.println(d03); // P T 1M --> 1M (1 minuto)

        //
        Duration d04 = Duration.ofDays(1);
        System.out.println(d04); // 1 dia tem 24 horas

        Duration d05 = Duration.ofDays(3);
        System.out.println(d05); // 3 dias tem 72 horas

        Duration d06 = Duration.ofMinutes(60);
        System.out.println(d06); // 60 minutos tem 1 hora

        Duration d07 = Duration.ofMinutes(125);
        System.out.println(d07); // 125 minutos tem 2 horas e 5 minutos (PT2H5M)


    }

}
