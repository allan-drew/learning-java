package br.com.cursojava.g01parametrizandocomportamento.test;

import br.com.cursojava.g01parametrizandocomportamento.dominio.Discente;
import br.com.cursojava.g01parametrizandocomportamento.interfaces.DiscentePredicate;

import java.util.ArrayList;
import java.util.List;

public class ParametrizandoComportamentosTest02 {

    // simulando banco de dados:
    private static List<Discente> discentes = List.of(
            new Discente("Amanda", 20, "Medicina"),
            new Discente("Luiza", 19, "Engenharia Mecânica"),
            new Discente("Kaike", 23, "Medicina Veterinária"),
            new Discente("Bruno", 27, "Direito"),
            new Discente("Maria", 18, "Medicina"),
            new Discente("Raphael", 22, "Engenharia Mecânica")
    );


    // PARAMETRIZANDO COMPORTAMENTOS (DE FILTRAGEM):

    // Agora, com a parametrização do comportamento,
    // a responsabilidade da regra de negócio da filtragem será enviada via DiscentePredicate através do polimorfismo
    // passando no parâmetro na chamada do método.
    private static List<Discente> filtrarDiscentes (List<Discente> discentes, DiscentePredicate discentePredicate) {
        List<Discente> estudantesFiltrados = new ArrayList<>();

        for (Discente discente: discentes) {
            // A definição do test() será feita através da criação de uma classe anônima posteriormente no main()
            if (discentePredicate.test(discente)) {
                estudantesFiltrados.add(discente);
            }
        }

        return estudantesFiltrados;

    }
    // Com isso, através do método filtrarDiscentes(), definimos apenas uma lógica, que muda de acordo com a chamada do método no main,
    // passando classes anônimas ou lambdas.
    // Com isso, o comportamento está vindo por parâmetro, daí a "Parametrização de Comportamentos"!!




    // ==================================================================================================
    public static void main(String[] args) {

        // definindo o test através de uma classe anônima:
        List<Discente> estudantesMedicinaVeterinária = filtrarDiscentes(discentes, new DiscentePredicate() {
            @Override
            public boolean test(Discente discente) {
                return discente.getCurso().equals("Medicina Veterinária");
            }
            // o test foi definido por uma classe anônima!
        });

        System.out.println(estudantesMedicinaVeterinária);

        System.out.println("-------------------------------------------");


        //É possível também usar a sintaxe LAMBDA:

        List<Discente> estudantesDireito = filtrarDiscentes(discentes, discente -> discente.getCurso().equals("Direito"));
        System.out.println(estudantesDireito);

        System.out.println("-------------------------------------------");

        List<Discente> estudantesEngenhariaMecanica = filtrarDiscentes(discentes, discente -> discente.getCurso().equals("Engenharia Mecânica"));
        System.out.println(estudantesEngenhariaMecanica);

        System.out.println("-------------------------------------------");

        // Alterando a lógico de filtragem por curso para filtragem por idade:
        List<Discente> estudantesMenoresQue22Anos = filtrarDiscentes(discentes, discente -> discente.getIdade() < 22);
        System.out.println(estudantesMenoresQue22Anos);


    }



}
