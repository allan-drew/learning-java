package br.com.cursojava.b14heranca02.dominio;

public class Animal {

    // In Java, if a class includes protected fields and methods,
    // then these fields and methods are accessible from the subclass of the class.
    protected String name;

    private int idade;

    protected void imprime() {
        System.out.println("Eu sou animal.");
    }


    // O modificador de acesso protected :
        // protected dá acesso direto à variável (atributos ou métodos) a :
            // - todas as subclasses independentemente de onde estejam (TERÃO ACESSO)
            // - todas as classes que estão no mesmo pacote (TAMBÉM TERÃO ACESSO)



}
