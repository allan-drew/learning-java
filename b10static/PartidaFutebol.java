package br.com.cursojava.b10static;

// exemplo de acesso a membros (métodos e atributos) static que estão na mesma classe...
// Nesse sentido, não é necessário especificar o nome da Classe para acessar estes membros

public class PartidaFutebol {

    // if we want to access the static member from inside the class, it can be accessed directly.
    static int duracao;

    static void display() {
        System.out.println("chamando o método static");
    }

    //----------------------------------------------------------------------
    public static void main(String[] args) {

        // acessando static variable
        duracao = 90;
        System.out.println("A duracao da partida é : " + duracao + " minutos");

        // acessando static method
        display();

        // We are able to access the static variable and method directly without using the class name.
        // It is because static variables and methods are by default public.
        // And, since we are accessing from the same class, we don't have to specify the class name.
    }
    //----------------------------------------------------------------------


}
