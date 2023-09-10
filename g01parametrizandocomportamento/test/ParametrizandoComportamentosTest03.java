package br.com.cursojava.g01parametrizandocomportamento.test;

import br.com.cursojava.g01parametrizandocomportamento.dominio.Discente;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ParametrizandoComportamentosTest03 {

    // simulando banco de dados:
    private static List<Discente> discentes = List.of(
            new Discente("Amanda", 20, "Medicina"),
            new Discente("Luiza", 19, "Engenharia Mecânica"),
            new Discente("Kaike", 23, "Medicina Veterinária"),
            new Discente("Bruno", 27, "Direito"),
            new Discente("Maria", 18, "Medicina"),
            new Discente("Raphael", 22, "Engenharia Mecânica")
    );


    // Predicate
    // Na verdade, o Java já possui um Predicate. O Predicate do Java utiliza generics....<T>
    // Com isso, o test será em cima do tipo que definirmos, e não precisamos ficar presos Discente discente em DiscentePredicate

    //    A interface Predicate possui apenas um método abstrato chamado test, que recebe um argumento do tipo genérico T e retorna um valor booleano.
    //    O método test contém a lógica para verificar se a condição é verdadeira ou não para o valor fornecido.

    private static <T> List<T> filtragem (List<T> list, Predicate<T> predicate) {
        List<T> itensFiltrados = new ArrayList<>();

        for (T elemento : list) {
            if (predicate.test(elemento)) {
                itensFiltrados.add(elemento);
            }
        }

        return itensFiltrados;

    }




    // ==================================================================================================
    public static void main(String[] args) {

        // Logo, conseguimos utilizar o método filtragem
        List<Discente> estudantesDireito = filtragem(discentes, discente -> discente.getCurso().equals("Direito"));
        System.out.println(estudantesDireito);

        System.out.println("-------------------------------------------");

        List<Discente> estudantesEngenhariaMecanica = filtragem(discentes, discente -> discente.getCurso().equals("Engenharia Mecânica"));
        System.out.println(estudantesEngenhariaMecanica);

        System.out.println("-------------------------------------------");

        List<Discente> estudantesMenoresQue22Anos = filtragem(discentes, discente -> discente.getIdade() < 22);
        System.out.println(estudantesMenoresQue22Anos);

        System.out.println("-------------------------------------------");


        // Agora, como o método está genérico, podemos filtrar mais coisas, como por exemplo:
        List<Integer> numeros = List.of(1,22, 12, 20, 23, 14, 6, 8, 90, 6, 100);

        // filtrando os pares:
        List<Integer> numerosPares = filtragem(numeros, num -> num % 2 == 0);
        System.out.println(numerosPares);

        System.out.println("-------------------------------------------");

        //------------------------------------------------------------------------------------------------------------------------

        List<String> nomesTimes = List.of("Flamengo-RJ", "Vasco-RJ", "Cruzeiro-MG", "São Paulo-SP");

        // filtrando os times cariocas:
        List<String> timesCariocas = filtragem(nomesTimes, time -> time.endsWith("-RJ"));
        System.out.println(timesCariocas);

        System.out.println("-------------------------------------------");

        //------------------------------------------------------------------------------------------------------------------------

        List<Double> entradasDinheiro = List.of(34.50, 23.00, 12.20, 55.00, 60.00, 1_000.99, 45.01);

        // filtrando apenas os valores maiores do que R$ 5O,00:
        List<Double> valoresMaioresQue50 = filtragem(entradasDinheiro, entrada -> entrada > 50.00);
        System.out.println(valoresMaioresQue50);



    }



}
