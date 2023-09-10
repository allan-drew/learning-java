package br.com.cursojava.g04function;

// Predicate ===> recebe um tipo T e retorna boolean
// Consumer ===> recebe um tipo T e retorna void
// Function ===> recebe um tipo T e retorna R (qualquer coisa)


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionTest01 {

    // Criando método genérico com Function para retornar R (qualquer coisa)...

    // Neste método, vamos receber um tipo T e ter um retorno R.... <T, R>
    // Vamos retornar uma lista de R....List<R>
    // O nome do método é mapeando
    private static <T, R> List<R> mapeando(List<T> list, Function<T, R> function) {
        List<R> resultado = new ArrayList<>();

        for (T element : list) {
            R r = function.apply(element);// o comportamento do apply() será definido na lambda.
            resultado.add(r);
        }
        return resultado;
    }


    public static void main(String[] args) {

        List<String> times = List.of("Flamengo", "Fluminense", "Vasco");

        System.out.println(mapeando(times, (String s) -> s.length())); // neste caso, o lambda irá retornar inteiros (o tamanho de cada string da lista...)

        System.out.println(mapeando(times, (String s) -> s.toUpperCase())); // neste caso, o lambda irá retornar outra lista de strings
        // (ou seja, neste exemplo específico, tanto recebe uma lista de strings, como também retorna uma lista de strings.


        System.out.println(mapeando(times, (String s) -> s.isEmpty())); // neste caso, retorna uma lista de booleans


    }

}
