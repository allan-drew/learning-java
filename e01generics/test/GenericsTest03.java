package br.com.cursojava.e01generics.test;

import br.com.cursojava.e01generics.dominio.Notebook;
import br.com.cursojava.e01generics.dominio.Smartphone;
import br.com.cursojava.e01generics.service.ServicoDeVendaDeNotebook;
import br.com.cursojava.e01generics.service.ServicoDeVendaDeSmartphone;

public class GenericsTest03 {

    public static void main(String[] args) {

        ServicoDeVendaDeSmartphone servicoDeVendaDeSmartphone = new ServicoDeVendaDeSmartphone();
        Smartphone smartphone = servicoDeVendaDeSmartphone.retornaSmartphoneDisponivel();

        System.out.println("=========");
        System.out.println("Cliente usa o smartphone vendido....");
        System.out.println("=========");

        servicoDeVendaDeSmartphone.devolucaoSmartphoneVendido(smartphone);

        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        ServicoDeVendaDeNotebook servicoDeVendaDeNotebook = new ServicoDeVendaDeNotebook();
        Notebook notebook = servicoDeVendaDeNotebook.retornaNotebookDisponivel();

        System.out.println("=========");
        System.out.println("Cliente usa o NOTEBOOK vendido....");
        System.out.println("=========");

        servicoDeVendaDeNotebook.devolucaoNotebookVendido(notebook);

        //

    }

}
