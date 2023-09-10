package br.com.cursojava.g02predicate.interfaces;


/*
Conceitos de programação funcional:

    Uma interface funcional em Java é uma interface que possui um único método abstrato, conhecido como "método funcional".
    A anotação @FunctionalInterface pode ser usada para indicar que uma interface é funcional.
    Embora essa anotação seja opcional, ela ajuda a garantir que a interface não seja acidentalmente alterada para ter mais de um método abstrato.

    Com a introdução de lambdas e expressões lambda no Java 8, as interfaces funcionais se tornaram ainda mais poderosas.
    Elas permitem que você crie implementações concisas de funções em linha, eliminando a necessidade de criar classes anônimas para tarefas simples.

    A ideia por trás das interfaces funcionais é permitir que você trate funções como cidadãos de primeira classe,
    ou seja, você pode passar funções como argumentos para métodos, retorná-las de métodos e atribuí-las a variáveis.

 */

import br.com.cursojava.g02predicate.dominio.Docente;

@FunctionalInterface
public interface DocentePredicate {

    public abstract boolean test(Docente docente); // retorna true ou false

    // public abstract boolean test02(); // erro (uma interface funcional possui apenas um método abstrato, o método funcional)!

}


// As interfaces mais conhecidas para programação funcional são: Predicate, Consumer e Function.


/*
    Para utilizarmos lambdas precisamos de uma interface funcional.
    O método da interface funcional define o contrato de como a lambda deve ser.

    * Lambdas:
        (parametro) -> <expressao>

        - Para o caso de um parâmetro no método da interface funcional:
        (Docente docente) -> docente.getDisciplinas().equals("Algoritmos I")
        ou....
        docente -> docente.getDisciplinas().equals("Algoritmos I")

        - Para o caso de nenhum parâmetro no método da interface funcional:
        ( ) -> <expressao>

        - Para o caso de mais de um par6ametro no método da interface funcional:
        (x, y, z) -> <expressao>

 */

