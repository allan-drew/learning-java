package br.com.cursojava.g01parametrizandocomportamento.test;

import br.com.cursojava.g01parametrizandocomportamento.dominio.Discente;

import java.util.ArrayList;
import java.util.List;

public class ParametrizandoComportamentosTest01 {

    // simulando banco de dados:
    private static List<Discente> discentes = List.of(
            new Discente("Amanda", 20, "Medicina"),
            new Discente("Luiza", 19, "Engenharia Mecânica"),
            new Discente("Kaike", 23, "Medicina Veterinária"),
            new Discente("Bruno", 27, "Direito"),
            new Discente("Maria", 18, "Medicina"),
            new Discente("Raphael", 22, "Engenharia Mecânica")
    );


    // CRIANDO COMPORTAMENTOS (DE FILTRAGEM):

    // Filtrar estudantes de medicina:
    private static List<Discente> filtrarDiscentesMedicina(List<Discente> discentes) {
        List<Discente> estudantesMedicina = new ArrayList<>();

        for (Discente discente: discentes) {
            if (discente.getCurso().equals("Medicina")) {
                estudantesMedicina.add(discente);
            }
        }

        return estudantesMedicina;

    }

    // Filtrar estudantes de Engenharia Mecanica:
    private static List<Discente> filtrarDiscentesEngMecanica(List<Discente> discentes) {
        List<Discente> estudantesEngMecanica = new ArrayList<>();

        for (Discente discente: discentes) {
            if (discente.getCurso().equals("Engenharia Mecânica")) {
                estudantesEngMecanica.add(discente);
            }
        }

        return estudantesEngMecanica;

    }

    // É possível passar o curso como parâmetro, melhorando o código
    private static List<Discente> filtrarDiscentesPorCurso (List<Discente> discentes, String curso) {
        List<Discente> estudantesCursoEspecificado = new ArrayList<>();

        for (Discente discente: discentes) {
            if (discente.getCurso().equals(curso)) {
                estudantesCursoEspecificado.add(discente);
            }
        }

        return estudantesCursoEspecificado;

    }

    // Entretanto, mesmo melhorando o código, não conseguiremos passar, por exemplo, a idade como parâmetro.
    // Para isso, é necessário criar novamente:
    private static List<Discente> filtrarDiscentesMenoresQueIdade (List<Discente> discentes, int idade) {
        List<Discente> estudantesIdadeEspecificada = new ArrayList<>();

        for (Discente discente: discentes) {
            if (discente.getIdade() < idade) {
                estudantesIdadeEspecificada.add(discente);
            }
        }

        return estudantesIdadeEspecificada;

    }


    /**
     * ------------------------------------------------------------------------------------------------------
     * Ao verificarmos os comportamentos de filtragem acima,
     * percebemos que somente uma pequena parte do código é alterada, que é a parte do 'íf'.....
     * Nesse sentido, podemos parametrizar comportamentos.....
     * ver a classe ParametrizandoComportamentosTest02 e a interface DiscentePredicate
     * ------------------------------------------------------------------------------------------------
    */

    // ==================================================================================================
    public static void main(String[] args) {

        System.out.println(filtrarDiscentesMedicina(discentes));
        System.out.println("-------------------------------------------");
        System.out.println(filtrarDiscentesEngMecanica(discentes));
        System.out.println("-------------------------------------------");
        System.out.println(filtrarDiscentesPorCurso(discentes, "Direito"));
        System.out.println("-------------------------------------------");
        System.out.println(filtrarDiscentesMenoresQueIdade(discentes, 22));

    }



}
