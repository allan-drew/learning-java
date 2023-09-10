package br.com.cursojava.i02streamscollectors.test;

import br.com.cursojava.i02streamscollectors.dominio.Clientes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/*
Collectors é uma classe utilitária do pacote java.util.stream em Java que fornece uma variedade de métodos estáticos
para facilitar a coleta (ou agregação) de elementos de um Stream em diferentes tipos de coleções
ou para realizar outras operações de processamento de dados.

A classe Collectors oferece métodos para coletar elementos em várias estruturas de dados, como listas, conjuntos, mapas e até mesmo em valores singulares.
*/

public class StreamTest08 {

    private static List<Clientes> listaClientes = new ArrayList<>( List.of (
            new Clientes("Pedro", 3_500.00),
            new Clientes("Bruna", 4_200.00),
            new Clientes("Thaynara", 13_799.00),
            new Clientes("Luiz", 10_150.00),
            new Clientes("Thais", 1_230.00),
            new Clientes("Lucas", 9_130.00),
            new Clientes("Thiago", 7_220.00)
    ));


    public static void main(String[] args) {

        // quantidade
        System.out.println(listaClientes.stream().count()); // sem Collectors
        System.out.println(listaClientes.stream().collect(Collectors.counting())); // com Collectors

        System.out.println("----------------------------------------------");


        // ----------------------------
        // MÁXIMO (maior renda)
        // sem Collectors:
        listaClientes.stream()
                .max(Comparator.comparing(lc -> lc.getRenda()))
                .ifPresent(System.out::println);

        // com Collectors:
        listaClientes.stream()
                .collect(Collectors.maxBy(Comparator.comparing(lc -> lc.getRenda())))
                .ifPresent(System.out::println);

        System.out.println("----------------------------------------------");

        // SOMA (das rendas)

        // sem Collectors:
        System.out.print("Soma das rendas: ");
        System.out.println(listaClientes.stream().mapToDouble(c -> c.getRenda()).sum());

        // com Collectors:
        System.out.print("Soma das rendas: ");
        System.out.println(listaClientes.stream().collect(Collectors.summingDouble(c -> c.getRenda())));

        System.out.println("----------------------------------------------");


        // Dentro do DoubleSummaryStatistics temos tudo o que estávamos fazendo anteriormente, como máximo, soma, etc...
        DoubleSummaryStatistics collect = listaClientes.stream().collect(Collectors.summarizingDouble(c -> c.getRenda()));
        System.out.println(collect);

        // pegando os nomes dos clientes
        String nomesClientes = listaClientes.stream().map(c -> c.getNome()).collect(Collectors.joining(" / "));
        System.out.println(nomesClientes);

        String rendasClientes = listaClientes.stream().map(c -> c.getRenda()).collect(Collectors.toList()).toString();
        System.out.println(rendasClientes);

    }


}
