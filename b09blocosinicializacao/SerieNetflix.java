package br.com.cursojava.b09blocosinicializacao;

public class SerieNetflix {

    private String nomeSerie;
    private int numTemporadas;
    private String qualidadeDeTela;

    // bloco de inicializacao de instancia (NAO ESTATICO):
    // Executado toda vez que o objeto é criado
    // Executado antes do construtor; sempre é chamado!
    {
        // independente de qual construtor for chamado,
        // o bloco de inicializacao irá inicializar o atributo qualidade de tela
        System.out.println("dentro do primeiro bloco de inicialização");
        this.qualidadeDeTela = "Full HD";
    }

    // Construtor
    public SerieNetflix(String nomeSerie, int numTemporadas) {
        System.out.println("dentro do construtor com parametro");
        this.nomeSerie = nomeSerie;
        this.numTemporadas = numTemporadas;
    }

    public SerieNetflix() {
        System.out.println("dentro do construtor ~SEM~ parametro");
    }

    // Executado antes do construtor; sempre é chamado!
    {
        System.out.println("dentro do segundo bloco de inicializacao");
    }


    public String getNomeSerie() {
        return nomeSerie;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public String getQualidadeDeTela() {
        return qualidadeDeTela;
    }

}
