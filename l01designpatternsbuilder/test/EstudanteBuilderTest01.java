package br.com.cursojava.l01designpatternsbuilder.test;

import br.com.cursojava.l01designpatternsbuilder.dominio.Estudante;

public class EstudanteBuilderTest01 {

    public static void main(String[] args) {

        Estudante estudante01 = new Estudante.EstudanteBuilder()
                .criarPrimeiroNome("Bruno")
                .criarCurso("Engenharia Mecanica")
                .criarIdade(31)
                .criarSobrenome("Henrique")
                .criarEmail("brunohenrique@gmail.com")
                .build();

        System.out.println(estudante01);

        System.out.println("------------------------------");

        Estudante estudante02 = new Estudante.EstudanteBuilder()
                .criarPrimeiroNome("Gabi")
                .criarIdade(27)
                .criarSobrenome("Gol")
                .build();

        System.out.println(estudante02);

    }

}
