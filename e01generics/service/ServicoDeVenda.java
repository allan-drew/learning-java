package br.com.cursojava.e01generics.service;

import br.com.cursojava.e01generics.dominio.Smartphone;

import java.util.List;

// para usarmos o Generics na classe, colocamos <T> na classe...T de Type! Mas poderia ser outra letra!
public class ServicoDeVenda<T> {

    // -----------------------------------
    // Lista simulando banco de dados, arquivo ou API
    private List<T> objetosDisponiveis;

    public ServicoDeVenda(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }
    // -----------------------------------

    // retorna T, pois como é generic, ainda não sabemos
    public T retornaObjetoDisponivel() {
        System.out.println("Buscando objeto disponível...");
        T t = objetosDisponiveis.remove(0); // simulando a remoção da primeira opção da lista dos objetoss para ser vendido
        System.out.println("Vendendo objetos... " + t); // simulando a venda do objetos
        System.out.println("---------");
        System.out.println("Objetos disponíveis para venda: " );
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void devolucaoObjetoVendido(T t) {
        System.out.println("Devolvendo objetos vendido anteriormente (cliente devolve no prazo)..." + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis para venda: " );
        System.out.println(objetosDisponiveis);
    }


}
