package br.com.cursojava.b17modificadorfinal02;

public class Aviao {

    private String nomeDoAviao;

    // In Java, the 'final' method CANNOT be overridden by the child class. For example,
    // CREATE A FINAL METHOD:
    public final void imprime () {
        System.out.println("Este é um método marcado como 'final'");
    }

}
