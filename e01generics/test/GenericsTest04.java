package br.com.cursojava.e01generics.test;

import br.com.cursojava.e01generics.dominio.Notebook;
import br.com.cursojava.e01generics.dominio.Smartphone;
import br.com.cursojava.e01generics.service.ServicoDeVenda;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest04 {

    public static void main(String[] args) {

        // -----------------------------------------------------------------------------------------------
        // criando as listas
        // simulando que os dados estão vindo de um banco de dados ou API:
        List<Notebook> notebooksDisponiveis = new ArrayList<>(
                List.of(
                        new Notebook("Apple", "Macbook air M1"),
                        new Notebook("Dell", "Inspiron 15"))
        );

        List<Smartphone> smartphonesDisponiveis = new ArrayList<>(
                List.of(
                        new Smartphone("Apple", "iphone 12"),
                        new Smartphone("Samsung", "S23"))
        );
        // -----------------------------------------------------------------------------------------------

        ServicoDeVenda<Notebook> servicoDeVenda = new ServicoDeVenda<>(notebooksDisponiveis);

        Notebook notebook = servicoDeVenda.retornaObjetoDisponivel();

        System.out.println("=========");
        System.out.println("Cliente usa o objeto vendido....");
        System.out.println("=========");

        servicoDeVenda.devolucaoObjetoVendido(notebook);

        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        ServicoDeVenda<Smartphone> servicoDeVenda02 = new ServicoDeVenda<>(smartphonesDisponiveis);

        Smartphone smartphone = servicoDeVenda02.retornaObjetoDisponivel();

        System.out.println("=========");
        System.out.println("Cliente usa o objeto vendido....");
        System.out.println("=========");

        servicoDeVenda02.devolucaoObjetoVendido(smartphone);

    }

}
