package br.com.cursojava.e01generics.test;

import br.com.cursojava.d06colecoes.dominio.CarrosHonda;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {

    public static void main(String[] args) {

        // ------------------------------------------------------------------------------------------------------
        // Antes:
        List lista = new ArrayList();

        // conseguiriamos adicionar qualquer tipo
        lista.add("Gabigol");
        lista.add(23);
        lista.add(new CarrosHonda(3232L, "Fit", 45_000.00));

        for (Object o : lista) {
            System.out.println(o);
        }
        // ------------------------------------------------------------------------------------------------------

        System.out.println("--------------------------------------------------");

        // ------------------------------------------------------------------------------------------------------
        // Depois do java 1.4
        // GENERICS :
        // É possível forçar o tipo em tempo de compilação, usando < >
        List<String> listaAtletas = new ArrayList<>();
                                                // o tipo no segundo < > pode ser implícito, já que é o mesmo do primeiro.
                                                // Explicit type argument String can be replaced with <>

        listaAtletas.add("Gabigol");
        listaAtletas.add("Arrascaeta");
        listaAtletas.add("Everton Ribeiro");
        listaAtletas.add("Bruno Henrique");

        for (String atleta: listaAtletas) {
            System.out.println(atleta);
        }

        // ------------------------------------------------------------------------------------------------------



    }

}
