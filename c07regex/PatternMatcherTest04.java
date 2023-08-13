package br.com.cursojava.c07regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {

    public static void main(String[] args) {

        // META CARACTERES:

        // []
        String regex = "[abcABC]"; // procura ou a, ou b, ou c, ou A, ou B, ou C. Não procura a sequencia abc, nem ABC, nem abcABC
        String texto = "Black Coffee";

        Pattern pattern01 = Pattern.compile(regex);
        Matcher matcher = pattern01.matcher(texto);

        while (matcher.find()) {
            System.out.println("posição: " + matcher.start() + " ==> : " + matcher.group());
        }

        System.out.println("=====================================");

        // range []
        String regex02 = "[a-gA-D]"; //procura de a até g e de A até D

        Pattern pattern02 = Pattern.compile(regex02);
        Matcher matcher02 = pattern02.matcher(texto);

        while (matcher02.find()) {
            System.out.println("posição: " + matcher02.start() + " ==> : " + matcher02.group());
        }

    }

}
