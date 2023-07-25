package br.com.cursojava.b10static;

public class CarrosAlemaes {

    // Variáveis e métodos marcados como static pertencem à classe, ao invés de a alguma instância particular.
    // O modificador static indica que o atributo pertence à classe em si, e não ao objeto em particular.
    // Ou seja, a variável criada será a mesma em todas instâncias (objetos)
    // e quando seu conteúdo é modificado em uma das instâncias então ele será modificado em todas instâncias;

    private String nomeMarca;
    private double velocidadeMaxima;
    private static double velocidadeLimitada = 210; // atributo que pertence a todos os carros alemaes

    public CarrosAlemaes(String nomeMarca, double velocidadeMaxima) {
        this.nomeMarca = nomeMarca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprimeinfo () {
        System.out.println(this.nomeMarca);
        System.out.println("veloc máxima => "+ this.velocidadeMaxima);
        System.out.println("veloc limitada => "+ this.velocidadeLimitada);
        System.out.println("-----");
    }


    // setter criado para mostrar que ao alterar a velocidade limite, ela será alterada em todos os objetos
    public void setVelocidadeLimitada(double velocidadeLimitada) {
        this.velocidadeLimitada = velocidadeLimitada;
    }


    public String getNomeMarca() {
        return nomeMarca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public double getVelocidadeLimitada() {
        return velocidadeLimitada;
    }


}
