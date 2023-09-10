package br.com.cursojava.h01optional;

// A classe Optional é usada para lidar com valores possivelmente nulos de uma maneira mais segura e expressiva,
// evitando erros de NullPointerException e promovendo um estilo de programação mais claro e legível.

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {

    private static String encontrarClubeFutebol (String nomeClube) {
        List<String> listaDeClubes = List.of("Flamengo", "Corinthians", "Bahia", "América/MG");

        int i = listaDeClubes.indexOf(nomeClube);

        if (i != -1) {
            return listaDeClubes.get(i);
        }
        return null;

    }


    public static void main(String[] args) {

        String nomeDoClube = encontrarClubeFutebol("américa do rio de janeiro"); // forçando erro

        // o problema da abordagem sem usar o Optional é que ao tentarmos usar este nomeDoClube, teremos um NullPointerException
        // System.out.println(nomeDoClube.toUpperCase()); // -------> NullPointerException


        // ----------------------
        // A ideia por trás do Optional é fornecer uma abordagem mais elegante para representar valores que podem estar ausentes (nulos)
        // sem a necessidade de verificações explícitas de nulos
        //  O Optional encapsula um valor que pode ou não estar presente e fornece métodos para manipular esse valor de forma segura.
        Optional<String> optional01 = Optional.of("olá a todos!");
                                    // of(value): Cria um Optional com o valor fornecido, que não pode ser nulo.
        System.out.println(optional01);

        System.out.println("---");

        Optional<String> optional02 = Optional.ofNullable(null); // ao usarmos ofNullable, conseguimos retornar um Optional empty para não ocorrer NullPointerException
                                    // ofNullable(value): Cria um Optional com o valor fornecido, que pode ser nulo.
        System.out.println(optional02);

        System.out.println("-----------------------------------");

        // Com isso, podemos retornar Optional.empty ao invés de NullPointerException
        Optional<String> optional03 = Optional.ofNullable(encontrarClubeFutebol("américa de minas")); // forçando erro
        System.out.println(optional03); // retorna Optional.empty

        System.out.println("---");

        // Podemos também retornar outra coisa caso não encontre:
        Optional<String> optional04 = Optional.ofNullable(encontrarClubeFutebol("clube de regatas do flamengo")); // forçando erro
        String time = optional04.orElse("O nome do time não está na lista!!");
        optional04.ifPresent( s -> System.out.println(s.toUpperCase()) );
        System.out.println(time);

        System.out.println("---");

        // se estiver na lista, retorna normalmente, e conseguimos fazer o toUpperCase sem NullPointerException
        Optional<String> optional05 = Optional.ofNullable(encontrarClubeFutebol("Flamengo"));
        String clube = optional05.orElse("O nome do time não está na lista!!");
        optional05.ifPresent( s -> System.out.println(s.toUpperCase()) );
        System.out.println(clube);

        System.out.println("---");

        Optional<String> optional06 = Optional.ofNullable(encontrarClubeFutebol("Bahia"));
        String clube02 = optional06.orElse("O nome do time não está na lista!!");
        optional06.ifPresent( s -> System.out.println(s.length()) );
        System.out.println(clube02);

    }

}


