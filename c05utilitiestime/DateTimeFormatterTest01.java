package br.com.cursojava.c05utilitiestime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {

    public static void main(String[] args) {

        // format = transforma objeto para string
        LocalDate date = LocalDate.now();
        String string1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String string2 = date.format(DateTimeFormatter.ISO_DATE);
        String string3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);

        System.out.println("===========");

        // parse = transforma string para objeto
        LocalDate parse1 = LocalDate.parse("20230810", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2023-08-10", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2023-08-10", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        System.out.println("===========");

        // padroes:
        DateTimeFormatter formatterBrazil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBrazil = LocalDate.now().format(formatterBrazil);
        System.out.println(formatBrazil);


        DateTimeFormatter formatterBrazilReduzido = DateTimeFormatter.ofPattern("dd/MM/yy");
        String formatBrazil02 = LocalDate.now().format(formatterBrazilReduzido);
        System.out.println(formatBrazil02);


        LocalDate parseBrazil01 = LocalDate.parse("13/05/1994", formatterBrazil);
        LocalDate parseBrazil02 = LocalDate.parse("10/01/90", formatterBrazilReduzido);

        System.out.println(parseBrazil01);
        System.out.println(parseBrazil02);

        System.out.println("===========");

        // usando Locale
        DateTimeFormatter formatterUK = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.UK);
        String formatUK = LocalDate.now().format(formatterUK);
        System.out.println(formatUK);

        DateTimeFormatter formatterKorean = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.KOREAN);
        String formatKR = LocalDate.now().format(formatterKorean);
        System.out.println(formatKR);






    }

}
