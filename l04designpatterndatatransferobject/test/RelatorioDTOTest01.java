package br.com.cursojava.l04designpatterndatatransferobject.test;

import br.com.cursojava.d01colecoes.dominio.CarroVolks;
import br.com.cursojava.i02streamscollectors.dominio.Clientes;
import br.com.cursojava.i03streamcollectors.dominio.PerfilCliente;
import br.com.cursojava.l02designpatternsfactory.dominio.TipoInvestimento;
import br.com.cursojava.l04designpatterndatatransferobject.dominio.RelatorioDataTransferObject;

public class RelatorioDTOTest01 {

    public static void main(String[] args) {

        TipoInvestimento tipoInvestimentodto01 = TipoInvestimento.SELIC;
        PerfilCliente perfilClientedto01 = PerfilCliente.ALTA_RENDA;
        Clientes clientedto01 = new Clientes("Raphael", 23_000.00);

        CarroVolks carroClientedto01 = new CarroVolks("Polo", "GTS", "9BW ZZZ377 VT 004251");

        RelatorioDataTransferObject relatorioDTO = RelatorioDataTransferObject.RelatorioDataTransferObjectBuilder.builder()
                .tipoInvestimento(tipoInvestimentodto01)
                .perfilCliente(perfilClientedto01)
                .nomeCliente(clientedto01.getNome())
                .rendaCliente(clientedto01.getRenda())
                .carroDoCliente(carroClientedto01)
                .build();

        System.out.println(relatorioDTO);

    }

}
