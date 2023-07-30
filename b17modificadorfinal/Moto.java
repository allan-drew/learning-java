package br.com.cursojava.b17modificadorfinal;

// the final class cannot be inherited by another class
public final class Moto {

    private String nomeDaMoto;

    // In Java, the 'final' keyword is used to denote constants.
    // It can be used with variables, methods, and classes.
            // ==> the final variable cannot be reinitialized with another value
            // ==> the final method cannot be overridden
            // ==> the final class cannot be extended

    // É necessário inicializar quando temos o 'final' pois estamos falando de uma constante, e constante tem valor
    public static final double VELOCIDADE_LIMITADA = 300;

    // outro jeito de inicializar
    // (como o bloco de inicialização é executado, então temos a inicialização da variável através do bloco):
    public static final double POTENCIA_MINIMA;
    static {
        POTENCIA_MINIMA = 125;
    }

    // se a variável não for static, temos:
    public final double PRECO_MINIMO;
    {
        PRECO_MINIMO = 10000;
    }

    // também é possível inicializar o valor de variável que é 'final' pelo construtor
    public final int NUMERO_DE_REVISOES;
    public Moto() {
        NUMERO_DE_REVISOES = 5;
    }

    public String getNomeDaMoto() {
        return nomeDaMoto;
    }

    public void setNomeDaMoto(String nomeDaMoto) {
        this.nomeDaMoto = nomeDaMoto;
    }

}
