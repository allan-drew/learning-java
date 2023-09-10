package br.com.cursojava.i01streams.test;

/*
REDUCE:
A operação reduce é uma operação terminal que combina os elementos de um Stream em um único valor, usando uma operação de redução.
A operação de redução pode ser qualquer operação associativa, como soma, multiplicação, concatenação, entre outras.
A ideia é reduzir toda a coleção de elementos a um único valor, aplicando a operação repetidamente.
 */


import java.util.List;
import java.util.Optional;

public class StreamTest05 {

    public static void main(String[] args) {

        List<Integer> inteiros = List.of(2, 3, 5, 1);

        // soma de todos os inteiros da lista
        Optional<Integer> somaInt = inteiros.stream().reduce((a, b) -> a + b);
        somaInt.ifPresent(System.out::println);

        // outra maneira é colocando um valor inicial:
        // valor inicial de 0:
        Integer somaInt02 = inteiros.stream().reduce(0, (a, b) -> a + b);// retorna valor final, e não mais um Optional
        System.out.println("soma (valor inicial 0): " + somaInt02);

        // valor inicial de 20:
        Integer somaInt03 = inteiros.stream().reduce(20, (a, b) -> a + b);// retorna valor final, e não mais um Optional
        System.out.println("soma (valor inicial 20): " + somaInt03);

        // podemos também usar métodos do Integer
        Integer somaInt04 = inteiros.stream().reduce(0, Integer::sum);
        System.out.print("soma: ");
        System.out.println(somaInt04);

        // pegando o máximo valor
        Optional<Integer> somaInt05 = inteiros.stream().reduce(Integer::max);
        System.out.print("valor máximo: ");
        somaInt05.ifPresent(System.out::println);

        // pegando o mínimo valor
        Optional<Integer> somaInt06 = inteiros.stream().reduce(Integer::min);
        System.out.print("valor mínimo: ");
        somaInt06.ifPresent(System.out::println);


        System.out.println("---");
        // ---------
        // multiplicação de todos os inteiros da lista
        Optional<Integer> multInt = inteiros.stream().reduce((a, b) -> a * b);
        System.out.print("multiplicação reduce: ");
        multInt.ifPresent(System.out::println);



    }

}
