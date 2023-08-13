package br.com.cursojava.c03utilitiesdates;

import java.util.Calendar;

public class CalendarTest01 {

    public static void main(String[] args) {

        // Calendar é mais encontrado em sistemas legados.

        Calendar c = Calendar.getInstance();

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana!");
        }

        System.out.println("hoje é o dia " + c.get(Calendar.DAY_OF_MONTH) + " do mês");
        System.out.println("hoje é o dia " + c.get(Calendar.DAY_OF_YEAR) + " do ano");

        System.out.println(c.getTime());



    }

}
