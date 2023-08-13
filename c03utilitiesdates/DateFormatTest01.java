package br.com.cursojava.c03utilitiesdates;

// DateFormat é uma classe abstrata
// The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes).
// Uma classe abstrata foi feita para ser uma superclasse... pois só podemos criar objetos das subclasses dela...

// DateFormat oferece métodos para formatar datas

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];

        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormat: df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }

    }

}
