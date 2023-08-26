package br.com.cursojava.d04colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {

    // BinarySearch faz uma busca na lista e retorna o índice do que estamos procurando.
    // Caso não encontre, retorna (-(ponto de inserção) -1)

    public static void main(String[] args) {

        List<Integer> gols = new ArrayList<>();
        gols.add(0);
        gols.add(2);
        gols.add(3);
        gols.add(5);

        // The list must be sorted into ascending order to call binarySearch. If it is not sorted, the results are undefined.
        Collections.sort(gols);
        System.out.println("index do valor 0 --> " + Collections.binarySearch(gols,0));
        System.out.println("index do valor 5 --> " + Collections.binarySearch(gols,5));

        //
        System.out.println("index do valor 1 --> " + Collections.binarySearch(gols,1)); // não existe. Retorna, portanto, o (-(ponto de inserção) -1)
        // O ponto de inserção natural do 1 nesta lista ordenada de Integer seria o index 1. Logo, retorna (-(1)-1) = -2




    }


}
