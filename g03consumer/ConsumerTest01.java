package br.com.cursojava.g03consumer;


// Predicate ===> recebe um tipo T e retorna boolean
// Consumer ===> recebe um tipo T e retorna void
// Function ===> recebe um tipo T e retorna R (qualquer coisa)

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest01 {

    // Criando método genérico com Consumer para imprimir listas de qualquer tipo
    private static <T> void imprimeLista (List<T> list, Consumer<T> consumer) {
        for (T element : list) {
            consumer.accept(element); // o comportamento do accept() será definido na lambda.
        }
    }


    public static void main(String[] args) {

        List<String> jogadores = List.of("Gabi", "Bruno Henrique", "Arrascaeta", "Everton Ribeiro");
        imprimeLista(jogadores, (String s) -> System.out.println(s)); // sout retorna void, assim como o método accept Consumer

        System.out.println("-----------------------------------------------------------------------------");

        List<Integer> gols = List.of(3, 2, 1, 0);
        imprimeLista(gols, (Integer integer) -> System.out.println(integer)); // sout retorna void, assim como o método accept Consumer

        System.out.println("-----------------------------------------------------------------------------");

        List<Double> precos = List.of(3.45, 20.99, 34.90, 45.50);
        imprimeLista(precos, d -> System.out.println(d)); // podemos simplificar, de (Double d) para d


    }

}
