package br.com.cursojava.l02designpatternsfactory.test;

import br.com.cursojava.l02designpatternsfactory.dominio.TesouroDireto;
import br.com.cursojava.l02designpatternsfactory.dominio.TesouroDiretoFactory;
import br.com.cursojava.l02designpatternsfactory.dominio.TipoInvestimento;

public class TesouroDiretoTest01 {

    public static void main(String[] args) {

        // criando os investimento usando a factory
        TesouroDireto tesouroDireto01 = TesouroDiretoFactory.novoInvestimento(TipoInvestimento.SELIC);
        tesouroDireto01.aplicar();
        System.out.println("A taxa deste investimento é ------------->   " + tesouroDireto01.getTaxa());


        System.out.println("-----------------------");


        // criando os investimento usando a factory
        TesouroDireto tesouroDireto02 = TesouroDiretoFactory.novoInvestimento(TipoInvestimento.IPCAMAIS);
        tesouroDireto02.aplicar();
        System.out.println("A taxa deste investimento é ------------->   " + tesouroDireto02.getTaxa());
        tesouroDireto02.resgatar();


        System.out.println("-----------------------");

        tesouroDireto01.resgatar();


        System.out.println("-----------------------");


//        TesouroDiretoFactory tesouroDiretoFactory = new TesouroDiretoFactory(); // TesouroDiretoFactory()' has private access



    }

}
