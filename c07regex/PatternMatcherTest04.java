package br.com.cursojava.c07regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {

    public static void main(String[] args) {

        // ? -> zero ou uma ocorrência
        // * -> zero ou mais ocorrências
        // + -> uma ou mais ocorrências
        // {n,m} -> de n até m
        // ()
        // | -> ou
        // $ -> fim

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; // Encontrando hexadecimais no texto
        String texto = "25 0X 0x 0xFFABC 0x121ZZ 0x1F" ;

        Pattern pattern01 = Pattern.compile(regex);
        Matcher matcher = pattern01.matcher(texto);

        while (matcher.find()) {
            System.out.println("posição: " + matcher.start() + " ==> : " + matcher.group());
        }

        System.out.println("=====================================");


    }

}
