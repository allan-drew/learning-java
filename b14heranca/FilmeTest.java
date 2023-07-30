package br.com.cursojava.b14heranca;

public class FilmeTest {

    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.setNomeFilme("Top Gun");
        filme1.setDuracaoFilme(120);
        filme1.setArrecadacaoCinemas(100);

        filme1.imprimeInfo();

        System.out.println("---------------");

        FilmeTerror filmeDeTerror01 = new FilmeTerror();
        filmeDeTerror01.setNomeFilme("IT - A Coisa");
        filmeDeTerror01.setDuracaoFilme(135);
        filmeDeTerror01.setArrecadacaoCinemas(500);
        filmeDeTerror01.setIdadeMinima(16);

        filmeDeTerror01.imprimeInfo();

    }

}
