package br.com.cursojava.e01generics.service;

import br.com.cursojava.e01generics.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class ServicoDeVendaDeSmartphone {

    // simulando banco de dados:
    private List<Smartphone> smartphonesDisponiveis = new ArrayList<>(
            List.of(
                    new Smartphone("Apple", "iphone 12"),
                    new Smartphone("Samsung", "S23"))
    );


    // método que retorna qual smartphone está sendo vendido:
    public Smartphone retornaSmartphoneDisponivel() {
        System.out.println("Buscando smartphone disponível...");
        Smartphone smartphone = smartphonesDisponiveis.remove(0); // simulando a remoção da primeira opção da lista dos smartphones para ser vendido
        System.out.println("Vendendo smartphone... " + smartphone); // simulando a venda do smartphone
        System.out.println("---------");
        System.out.println("Smartphones disponíveis para venda: " );
        System.out.println(smartphonesDisponiveis);
        return smartphone;
    }

    public void devolucaoSmartphoneVendido(Smartphone smartphone) {
        System.out.println("Devolvendo smartphone vendido anteriormente (cliente devolve no prazo)..." + smartphone);
        smartphonesDisponiveis.add(smartphone);
        System.out.println("Smartphones disponíveis para venda: " );
        System.out.println(smartphonesDisponiveis);
    }

}
