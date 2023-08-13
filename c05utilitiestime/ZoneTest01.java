package br.com.cursojava.c05utilitiestime;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {

    public static void main(String[] args) {

        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds); // imprime as zonas que o Java oferece suporte

        System.out.println("zona do sistema: " + ZoneId.systemDefault());

        //
        ZoneId losAngelesUsZone = ZoneId.of("America/Los_Angeles");
        System.out.println(losAngelesUsZone);


        System.out.println("-------");
        //
        ZoneId parisZone = ZoneId.of("Europe/Paris");
        System.out.println(parisZone);

        //
        System.out.println("Usando LocalDateTime: ");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // LocalDateTime nao oferece zona

        // para termos uma zona, podemos usar um ZonedDateTime
        ZonedDateTime zdt = now.atZone(parisZone);
        System.out.println(zdt); // Paris está a 02:00 do zulu time


        //----
        System.out.println("Usando Instant: ");
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        ZonedDateTime zdt2 = nowInstant.atZone(parisZone);
        System.out.println(zdt2); // Paris está a 02:00 do zulu time (neste caso, já retorna o horário formatado)

        System.out.println("-------");


        ZoneOffset offsetRioBrancoAcre = ZoneOffset.of("-02:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetRioBrancoAcre);
        System.out.println(offsetDateTime1);


    }

}
