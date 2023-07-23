package br.com.cursojava.b02metodosreturn03;

public class Patrimonio {

    public void imprimePorcentagemRendaFixa(double dinheiroRendaFixa, double dinheiroRendaVariavel) {

        if (dinheiroRendaFixa == 0 && dinheiroRendaVariavel == 0) {
            System.out.println("não possui nenhum patrimônio");
            return; // o return aqui é como se fosse um else para o print abaixo
                // só é utilizado em métodos void
        }
        System.out.println( ((dinheiroRendaFixa) / (dinheiroRendaFixa+dinheiroRendaVariavel)) * 100 + "  %" );
    }

}
