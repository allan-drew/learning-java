package br.com.cursojava.b09blocosinicializacao;

public class SerieNetflixTest {

    public static void main(String[] args) {

        // chamando o construtor (Com argumento)
        SerieNetflix serie001 = new SerieNetflix("Friends", 10);
        System.out.println(serie001.getNomeSerie());
        System.out.println(serie001.getQualidadeDeTela());
        System.out.println(serie001.getNumTemporadas() + " temporadas");

        System.out.println("-------------------------------------");

        // chamando construtor padrao (Sem argumentos)
        SerieNetflix serie002 = new SerieNetflix();
        // mesmo tendo chamado o construtor padrao, teremos para a serie004 o valor da qualidade de tela setado
        System.out.println(serie002.getQualidadeDeTela());

    }

}
