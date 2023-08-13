package br.com.cursojava.c07regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {

    public static void main(String[] args) {

        // META CARACTERES:

        // \d --> retorna todos os dígitos
        String regex = "\\d";
        String texto = "ufu32e2j430df210";

        Pattern pattern01 = Pattern.compile(regex);
        Matcher matcher = pattern01.matcher(texto);

        while (matcher.find()) {
            System.out.println("posição: " + matcher.start() + " ==> dígito encontrado: " + matcher.group());
        }

        System.out.println("=====================================");

        // \D --> retorna o que não for dígito
        String regex02 = "\\D";

        Pattern pattern02 = Pattern.compile(regex02);
        Matcher matcher02 = pattern02.matcher(texto);

        while (matcher02.find()) {
            System.out.println("posição: " + matcher02.start() + " ==> Não-dígito encontrado: " + matcher02.group());
        }

        System.out.println("=====================================");

        // \s --> retorna os espaços em branco (espac branco, \t, \n, \f, \r)
        // .........

        // \S --> retorna o que não for espaço em branco
        // .........

        // \w --> retorna o que for a-z A-Z dígitos _(underscore)
        // ou seja, basicamente exclui os caracteres especiais
        String regex03 = "\\w";
        String texto03 = "#@1234_abcz_&ˆABCZ_";

        Pattern pattern03 = Pattern.compile(regex03);
        Matcher matcher03 = pattern03.matcher(texto03);

        while (matcher03.find()) {
            System.out.println("posição: " + matcher03.start() + " ==> regex \\w: " + matcher03.group());
        }

        System.out.println("=====================================");

        // \W --> retorna o que NÃO for \w
        String regex04 = "\\W";

        Pattern pattern04 = Pattern.compile(regex04);
        Matcher matcher04 = pattern04.matcher(texto03);

        while (matcher04.find()) {
            System.out.println("posição: " + matcher04.start() + " ==> regex \\w: " + matcher04.group());
        }

    }

}
