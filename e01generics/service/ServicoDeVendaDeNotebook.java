package br.com.cursojava.e01generics.service;

import br.com.cursojava.e01generics.dominio.Notebook;

import java.util.ArrayList;
import java.util.List;

public class ServicoDeVendaDeNotebook {

    // simulando banco de dados:
    private List<Notebook> notebooksDisponiveis = new ArrayList<>(
            List.of(
                    new Notebook("Apple", "Macbook air M1"),
                    new Notebook("Dell", "Inspiron 15"))
    );


    // método que retorna qual notebook está sendo vendido:
    public Notebook retornaNotebookDisponivel() {
        System.out.println("Buscando notebook disponível...");
        Notebook notebook = notebooksDisponiveis.remove(0); // simulando a remoção da primeira opção da lista dos notebooks para ser vendido
        System.out.println("Vendendo notebook... " + notebook); // simulando a venda do notebook
        System.out.println("---------");
        System.out.println("Notebooks disponíveis para venda: " );
        System.out.println(notebooksDisponiveis);
        return notebook;
    }

    public void devolucaoNotebookVendido(Notebook notebook) {
        System.out.println("Devolvendo notebook vendido anteriormente (cliente devolve no prazo)..." + notebook);
        notebooksDisponiveis.add(notebook);
        System.out.println("Notebooks disponíveis para venda: " );
        System.out.println(notebooksDisponiveis);
    }

}
