package br.com.cursojava.c03utilitiesdates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {

    public static void main(String[] args) {

        // LocalDate + LocalTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //
        LocalDate date = LocalDate.of(2023, Month.APRIL, 3);
        LocalTime time = LocalTime.of(14, 32, 21);
        System.out.println(date);
        System.out.println(time);

        // parse: Obtains an instance of LocalDate from a text string
        LocalDate date02 = LocalDate.parse("1991-03-01");
        LocalTime time02 = LocalTime.parse("17:19:30");
        System.out.println(date02);
        System.out.println(time02);

        // juntando date02 com time02
        LocalDateTime ldt = date02.atTime(time02);
        System.out.println(ldt);

        // juntando time02 com date02
        LocalDateTime ldt02 = time02.atDate(date02);
        System.out.println(ldt02);



    }

}
