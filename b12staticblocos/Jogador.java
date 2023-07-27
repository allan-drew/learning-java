package br.com.cursojava.b12staticblocos;

public class Jogador {

    private String nomeJogador;
    private int tempoJogado;
    private static int limiteDeTempoJogadoPorPartida; // atributo que pertence a todos os jogadores


    // Bloco estático: In Java, static blocks are used to initialize the static variables.

    // O bloco de inicialização estático é carregado e executado apenas uma vez.
    // Isso ocorre quando a classe é carregada.
    // Isso ocorre antes de qualquer coisa. Antes mesmo de ser alocada memória para os objetos.
    static {
        System.out.println("Primeiro Bloco estático executado. (executado apenas uma vez)");
        limiteDeTempoJogadoPorPartida = 100;
//        this.tempoJogado; // não é possível acessar atributos de instancia (nao static) em bloco estático pois
                            // o bloco static é executado antes de tudo e o objeto ainda nem existe neste momento.
    }
            // O bloco static é executado apenas uma vez, portanto, o processamento é mais otimizado.


    // Bloco náo estático
    {
        // independente de qual construtor for chamado,
        // o bloco de inicializacao irá inicializar o atributo
        System.out.println("dentro do bloco de inicialização não estático. ");
        this.tempoJogado = 90;
    }

    // se tivermos outros blocos de inicialização static, eles serão executados na ordem em que aparecem
    static {
        System.out.println("Segundo Bloco estático executado. (executado apenas uma vez)");
        System.out.println("=======================================");
    }


    // Construtores:
    public Jogador(String nomeJogador) {
        System.out.println("dentro do construtor com parâmetro");
        this.nomeJogador = nomeJogador;
    }

    public Jogador () {
        System.out.println("dentro do construtor sem parâmetro");
    }


    //================
    // GETTERS
    public String getNomeJogador() {
        return nomeJogador;
    }

    public int getTempoJogado() {
        return tempoJogado;
    }

    public static int getLimiteDeTempoJogadoPorPartida() {
        return limiteDeTempoJogadoPorPartida;
    }
    //================



}


