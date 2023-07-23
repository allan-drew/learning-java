package br.com.cursojava.b02metodosreturn03;

public class PatrimonioTest {

    public static void main(String[] args) {

        Patrimonio patrimonio01 = new Patrimonio();
        patrimonio01.imprimePorcentagemRendaFixa(0, 0);

        Patrimonio patrimonio02 = new Patrimonio();
        patrimonio02.imprimePorcentagemRendaFixa(10000, 10000);

        Patrimonio patrimonio03 = new Patrimonio();
        patrimonio03.imprimePorcentagemRendaFixa(2000, 10000);

    }

}
