package br.com.cursojava.i03streamcollectors.test;

import br.com.cursojava.i03streamcollectors.dominio.ClientesBanco;
import br.com.cursojava.i03streamcollectors.dominio.PerfilCliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest09 {

    private static List<ClientesBanco> listaClientesBanco = new ArrayList<>( List.of (
            new ClientesBanco("Pedro", 5_500.00, PerfilCliente.VAREJO),
            new ClientesBanco("Bruna", 2_200.00, PerfilCliente.VAREJO),
            new ClientesBanco("Thaynara", 13_799.00, PerfilCliente.ALTA_RENDA),
            new ClientesBanco("Luiz", 27_150.00, PerfilCliente.PRIVATE),
            new ClientesBanco("Thais", 1_230.00, PerfilCliente.VAREJO),
            new ClientesBanco("Lucas", 9_130.00, PerfilCliente.ALTA_RENDA),
            new ClientesBanco("Thiago", 22_220.00, PerfilCliente.PRIVATE)
    ));


    public static void main(String[] args) {

        Map<PerfilCliente, List<ClientesBanco>> categoriasClientesMap = new HashMap<>();

        // ------------------------------------------------------------------------------------
        // Agrupando por categoria (SEM STREAMS)
        List<ClientesBanco> perfilvarejo = new ArrayList<>();
        List<ClientesBanco> perfilAltaRenda = new ArrayList<>();
        List<ClientesBanco> perfilPrivate = new ArrayList<>();

        for (ClientesBanco cliente : listaClientesBanco) {
            switch (cliente.getPerfilCliente()) {
                case VAREJO: perfilvarejo.add(cliente); break;
                case ALTA_RENDA: perfilAltaRenda.add(cliente); break;
                case PRIVATE: perfilPrivate.add(cliente); break;
            }
        }

        categoriasClientesMap.put(PerfilCliente.VAREJO, perfilvarejo);
        categoriasClientesMap.put(PerfilCliente.ALTA_RENDA, perfilAltaRenda);
        categoriasClientesMap.put(PerfilCliente.PRIVATE, perfilPrivate);

        System.out.println(categoriasClientesMap);


        System.out.println("--------------------------------------------------------------------------------");


        // Agrupando por categoria (COM STREAMS)
        Map<PerfilCliente, List<ClientesBanco>> categoriasClientesMap02 = listaClientesBanco
                .stream()
                .collect(Collectors.groupingBy(ClientesBanco::getPerfilCliente));

        System.out.println(categoriasClientesMap02);


        System.out.println("--------------------------------------------------------------------------------");


        // contando a quantidade por perfil
        Map<PerfilCliente, Long> quantidadePorPerfil = listaClientesBanco.stream().collect(Collectors.groupingBy(ClientesBanco::getPerfilCliente, Collectors.counting()));
        System.out.println(quantidadePorPerfil);

    }
}
