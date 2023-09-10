package br.com.cursojava.l04designpatterndatatransferobject.dominio;

/*
Um DTO (Data Transfer Object) é um padrão de projeto usado para transportar dados entre diferentes componentes, processos ou sistemas de uma aplicação.
Um DTO é uma classe simples que contém apenas atributos e não possui comportamento.
Um DTO pode ser criado a partir de uma ou mais entidades (classes que representam os dados de um banco de dados) ou outros objetos...

O DTO é especialmente útil quando se trabalha com camadas diferentes em uma aplicação.
Por exemplo, ao receber dados de um formulário em uma aplicação web, os dados podem ser encapsulados em um DTO
antes de serem enviados para o serviço ou camada de negócio para processamento.

O padrão DTO é amplamente utilizado em aplicações empresariais e em situações onde é necessário transferir dados entre camadas.
Ajuda a manter uma separação clara entre os dados e a lógica de negócio.

 */

import br.com.cursojava.d01colecoes.dominio.CarroVolks;
import br.com.cursojava.i03streamcollectors.dominio.PerfilCliente;
import br.com.cursojava.l02designpatternsfactory.dominio.TipoInvestimento;



public class RelatorioDataTransferObject {

    // O principal objetivo do padrão DTO é encapsular um grupo de atributos em um objeto simples
    // para que possam ser transferidos entre diferentes partes de um software.
    private TipoInvestimento tipoInvestimento;
    private PerfilCliente perfilCliente;
    private String nomeCliente;
    private Double rendaCliente;
    private CarroVolks carroDoCliente;

    //Não Possui Lógica de Negócio: O DTO é uma classe pura de dados e não deve conter lógica de negócio.

    public static final class RelatorioDataTransferObjectBuilder {

        private TipoInvestimento tipoInvestimento;
        private PerfilCliente perfilCliente;
        private String nomeCliente;
        private Double rendaCliente;
        private CarroVolks carroDoCliente;


        private RelatorioDataTransferObjectBuilder() {}

        public static RelatorioDataTransferObjectBuilder builder() {
            return new RelatorioDataTransferObjectBuilder();
        }

        public RelatorioDataTransferObjectBuilder tipoInvestimento (TipoInvestimento tipoInvestimento) {
            this.tipoInvestimento = tipoInvestimento;
            return this;
        }

        public RelatorioDataTransferObjectBuilder perfilCliente (PerfilCliente perfilCliente) {
            this.perfilCliente = perfilCliente;
            return this;
        }

        public RelatorioDataTransferObjectBuilder nomeCliente (String nomeCliente) {
            this.nomeCliente = nomeCliente;
            return this;
        }

        public RelatorioDataTransferObjectBuilder rendaCliente (Double rendaCliente) {
            this.rendaCliente = rendaCliente;
            return this;
        }

        public RelatorioDataTransferObjectBuilder carroDoCliente (CarroVolks carroDoCliente) {
            this.carroDoCliente = carroDoCliente;
            return this;
        }

        public RelatorioDataTransferObject build() {
            RelatorioDataTransferObject relatorioDataTransferObject = new RelatorioDataTransferObject();

            relatorioDataTransferObject.tipoInvestimento = this.tipoInvestimento;
            relatorioDataTransferObject.perfilCliente = this.perfilCliente;
            relatorioDataTransferObject.nomeCliente = this.nomeCliente;
            relatorioDataTransferObject.rendaCliente = this.rendaCliente;
            relatorioDataTransferObject.carroDoCliente = this.carroDoCliente;

            return relatorioDataTransferObject;

        }

    }


    @Override
    public String toString() {
        return "RelatorioDataTransferObject {" + '\n' +
                "   tipoInvestimento=  " + tipoInvestimento + '\n' +
                "   perfilCliente=  " + perfilCliente + '\n' +
                "   nomeCliente=  " + nomeCliente + '\n' +
                "   rendaCliente=  " + rendaCliente + '\n' +
                "   carroDoCliente=  " + carroDoCliente + '\n' +
                '}';
    }

}
