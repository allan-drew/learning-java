package br.com.cursojava.b16heranca04;

public class TestInicializacao {

    public static void main(String[] args) {

        MusicaEletronica musicaEletro1 = new MusicaEletronica("You Can't Hide");

        // SEQUENCIA DE INICIALIZAÇÃO:
        // - Bloco de inicialização estático da superclasse é executado quando a JVM carregar
        // - Bloco de inicialização estático da subclasse é executado quando a JVM carregar
        // - Bloco de inicialização não estático da super classe executado (na ordem)
        // - Construtor da superclasse é executado
        // - Bloco de inicialização não estático da sub classe executado (na ordem)
        // - Construtor da subclasse é executado

    }

}
