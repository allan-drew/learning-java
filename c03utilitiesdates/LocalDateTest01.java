package br.com.cursojava.c03utilitiesdates;

import java.time.LocalDate;
import java.time.Month;



public class LocalDateTest01 {

    public static void main(String[] args) {

        // LocalDate foi introduzida posteriormente no JAVA. Dê preferência para usar o LocalDate ao invés do Date.
        // É uma classe imutavel (nao se cria instancias com o new)!
        // Trabalha apenas com a data (e não com horas)!
        LocalDate date = LocalDate.of(1994, 05, 13);
        LocalDate date02 = LocalDate.of(2016, Month.DECEMBER, 10);

        System.out.println(date.getYear()); // 1994
        System.out.println(date.getMonth()); // may
        System.out.println(date.getMonthValue()); // 5
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth()); // 31 dias no mes de maio
        System.out.println(date.getYear() + " é bissexto? " + date.isLeapYear());

        System.out.println(date02.getYear() + " é bissexto? " + date02.isLeapYear());

        System.out.println(date); // formatacao nice para DB
        System.out.println(date02); // formatacao nice para DB

        //---------
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        //---------

        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

        //---------
        System.out.println(Month.JANUARY.getValue()); // comeca do 1 e nao do 0 (nice!)

    }

}
