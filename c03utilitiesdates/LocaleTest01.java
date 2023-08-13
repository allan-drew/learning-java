package br.com.cursojava.c03utilitiesdates;

// Internacionalização Datas com Locale

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {

    public static void main(String[] args) {

        Locale localeBrazil = new Locale("pt", "BR");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        System.out.println("Brasil => " + df1.format(calendar.getTime()));

        DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, localeBrazil);
        System.out.println("Brasil => " + df2.format(calendar.getTime()));


        System.out.println("---------------");


        Locale localeItaly = new Locale("it", "IT");
        DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, localeItaly);

        System.out.println("Itália => " + df3.format(calendar.getTime()));


        System.out.println("---------------");


        Locale localeAlemanha = new Locale("de", "DE");
        DateFormat df4 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, localeAlemanha);

        System.out.println("Alemanha => " + df4.format(calendar.getTime()));


        System.out.println("---------------");


        Locale localeJapao = new Locale("ja", "JP");
        DateFormat df5 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, localeJapao);

        System.out.println("Japão => " + df5.format(calendar.getTime()));


        System.out.println("---------------");


        System.out.println(localeBrazil.getDisplayCountry());
        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeAlemanha.getDisplayCountry());
        System.out.println(localeJapao.getDisplayCountry());

        System.out.println("---------------");


        System.out.println(localeBrazil.getDisplayCountry(localeBrazil));
        System.out.println(localeItaly.getDisplayCountry(localeBrazil));
        System.out.println(localeAlemanha.getDisplayCountry(localeBrazil));
        System.out.println(localeJapao.getDisplayCountry(localeBrazil));

    }

}
