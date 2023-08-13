package br.com.cursojava.c03utilitiesdates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {

    public static void main(String[] args) {

        // assim como LocalDate trabalha com datas, LocalTime trabalha com tempos...
        LocalTime time = LocalTime.of(23, 31, 12);
        System.out.println(time);

        // cuidado:
        // Exception (hour deve ir de 0 até 23)
        // LocalTime time02 = LocalTime.of(24, 31, 12);

        LocalTime time02 = LocalTime.of(0, 31, 12);
        System.out.println(time02);

        // data de agora
        LocalTime time03 = LocalTime.now();
        System.out.println(time03);

        // métodos LocalTime
        System.out.println("pegando a hora: " + time03.getHour());
        System.out.println("pegando os minutos: " +time03.getMinute());
        System.out.println("pegando os segundos: " +time03.getSecond());

        //
        System.out.println(time02.get(ChronoField.HOUR_OF_DAY));
        System.out.println(time03.get(ChronoField.HOUR_OF_DAY));

        //
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

        //



    }

}
