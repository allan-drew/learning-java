package br.com.cursojava.c05utilitiestime;

import java.time.LocalDate;
import java.time.Period;


// Period: This class models a quantity or amount of time in terms of years, months and days.

public class PeriodTest01 {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate nowAfter = LocalDate.now().plusYears(3).plusWeeks(2).plusDays(2);

        Period p1 = Period.between(now, nowAfter);
        System.out.println(p1); // P3Y16D --> P 3 anos, 16 dias

        //
        Period p2 = Period.ofDays(10); // The resulting period will have the specified days.
        System.out.println(p2);

        Period p3 = Period.ofWeeks(52); // 52 semanas --> 364 dias... The resulting period will be day-based
        System.out.println(p3);

        Period p4 = Period.ofYears(3); // 3 years --> The resulting period will have the specified years.
        System.out.println(p4);



    }

}
