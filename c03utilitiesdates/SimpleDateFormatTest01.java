package br.com.cursojava.c03utilitiesdates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {

    public static void main(String[] args) {

        String pattern = "'Juiz de Fora/MG' dd 'de' MMMM 'de' yyyy";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

    }

}
