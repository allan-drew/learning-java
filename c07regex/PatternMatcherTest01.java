package br.com.cursojava.c07regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {

    public static void main(String[] args) {

        // regex (regular expressions)
        // pode ser usado para encontrar padrões (ex.: encontra todos os emails dentro de um texto)
        // pode ser usado para validações

        String regex = "ab";
        String texto = "abaaaabaaaaabababab";

        // A regular expression, specified as a string, must first be compiled into an instance of this class (Pattern).
        // compile ---> Compiles the given regular expression into a pattern.
        Pattern pattern01 = Pattern.compile(regex);

        // Matcher --> An engine that performs match operations on a character sequence by interpreting a Pattern.
        // A matcher is created from a pattern by invoking the pattern's matcher method.
        Matcher matcher = pattern01.matcher(texto);

        // pegando o início dos índices encontrados e os valores agrupados
        while (matcher.find()) {
            System.out.println("posição no texto: " + matcher.start() + " ==> " + matcher.group());
        }


    }

}
