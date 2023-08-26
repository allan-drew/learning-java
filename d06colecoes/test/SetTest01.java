package br.com.cursojava.d06colecoes.test;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {

    public static void main(String[] args) {

        // Assim como o List, o Set também é uma interface que extends de Collection!

        // O Set é uma coleção de objetos que não possui ordem e não permite elementos duplicados.
        // O HashSet é uma coleção de objetos que não possui ordem, não permite elementos duplicados e é implementado usando uma tabela hash.
            // O HashSet só pode ser usado com objetos que possuem um método hashCode() e um método equals().
        Set<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(1);
        numeros.add(0);
        numeros.add(6); // Duplicate Set element
        numeros.add(6); // Duplicate Set element
        numeros.add(6); // Duplicate Set element
        numeros.add(6); // Duplicate Set element

        for (Integer numero: numeros) {
            System.out.println(numero);
        }

    }

}
