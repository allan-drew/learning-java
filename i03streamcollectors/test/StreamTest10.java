package br.com.cursojava.i03streamcollectors.test;

import br.com.cursojava.i03streamcollectors.dominio.ClientesBanco;
import br.com.cursojava.i03streamcollectors.dominio.PerfilCliente;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest10 {

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

        Map<PerfilCliente, DoubleSummaryStatistics> collect = listaClientesBanco
                .stream().
                collect(Collectors.groupingBy(ClientesBanco::getPerfilCliente, Collectors.summarizingDouble(ClientesBanco::getRendaMensal)));

        System.out.println(collect);


    }
}
