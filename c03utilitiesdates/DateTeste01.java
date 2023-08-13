package br.com.cursojava.c03utilitiesdates;

import java.util.Date;

public class DateTeste01 {

    public static void main(String[] args) {

        // Date é mais encontrado em sistemas legados.
        // Atualmente possui muitos métodos deprecated

        Date data = new Date(); // long em milisegundos (início 01/01/1970)
        System.out.println(data);
        System.out.println(data.toString());
        System.out.println(data.getTime() + " em ms");

        Date data02 = new Date(0);// no fuso BRT comeca em Wed Dec 31 21:00:00 BRT 1969
        System.out.println(data02);

        Date data03 = new Date(3_600_000*3); // 3 horas
        System.out.println(data03);

    }

}
