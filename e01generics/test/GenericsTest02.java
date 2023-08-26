package br.com.cursojava.e01generics.test;

import br.com.cursojava.e01generics.dominio.Caixa;

public class GenericsTest02 {

    public static void main(String[] args) {

        Caixa<Integer> caixaDeInteiros = new Caixa<>();
        caixaDeInteiros.adicionar(42);

        Integer valor = caixaDeInteiros.obter();
        System.out.println(valor);


        Caixa<String> caixaDeStrings = new Caixa<>();
        caixaDeStrings.adicionar("Olá, mundo!");
        String texto = caixaDeStrings.obter();
        System.out.println(texto);

    }

}
