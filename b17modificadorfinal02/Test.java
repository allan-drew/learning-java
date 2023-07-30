package br.com.cursojava.b17modificadorfinal02;

public class Test {

    public static void main(String[] args) {

        Jato jato1 = new Jato();

        jato1.imprime(); // Estamos imprimindo usando o método da superclasse Aviao
        // já que não foi possível fazer o override do método na classe Jato.

    }

}
