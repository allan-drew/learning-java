package br.com.cursojava.aintro;

public class ImprimindoVariaveis {

    // Para criar um programa, é necessário ter uma classe (public class .... )
    // e também ter um método main estático (public static .... )

    /*
        Comentario
        multilinha
    */

    /***
     * JAVA DOC:
     * comentário oficial de classes e métodos
     *
     * @param args ==> é o parametro do método main
     */
    public static void main (String[] args) {

        // Java is a statically-typed language.
        // necessário colocar o tipo da variável

        // Em JAVA, temos variáveis primitivas (ex.: int) e variáveis de referência/objetos (ex.: String)

        // Tipos primitivos (int, long, double, float, byte, short, boolean, char):

        //
        int idade = 10;
        System.out.println("A idade é " + idade); // sinal de + com string é um concatenador

        // The float data type is a single-precision 32-bit floating-point
        // To tell the compiler to treat 45.4 as float rather than double, you need to use f or F.
        // float velocidadeCarro = 50.05; // erro
        float velocidadeOnibus = 45.4f;

        //The double data type is a double-precision 64-bit floating-point.
        double altura = 1.81;

        //The byte data type can have values from -128 to 127 (8-bit signed two's complement integer).
        byte idadeByte = 127;

        // The short data type in Java can have values from -32768 to 32767 (16-bit signed two's complement integer).
        short idadeShort = 32767;

        //
        long numeroGrande = 2000L;

        // The boolean data type has two possible values, either true or false.
        boolean verdade = true;
        boolean mentira = false;

        //
        char primeiroCaracter = 'A'; // 2 BYTES
        char segundoCaracter = 70;

        // unicode:
        // The minimum value of the char data type is '\u0000' (0) and the maximum value of the is '\uffff'.
        char terceiroCaracter = '\u0045'; //numero hexadecimal na tabela unicode. Representa a letra E
        char unicodeSimbol = '\u0160';

        System.out.println(primeiroCaracter); //imprime A
        System.out.println(segundoCaracter); //imprime F
        System.out.println(terceiroCaracter); //imprime F
        System.out.println(unicodeSimbol);


        // String:
        // Java provides support for character strings via java.lang.String class.
        // So, Strings in Java are not primitive types. Instead, they are objects.
        String nome = "Gabriel";
        String sobrenome = "Barbosa";

        //---------------------
        //declarando
        String nomeDoUsuario;
        String enderecoDoUsuario;
        String telefoneDoUsuario;

        //inicializando
        nomeDoUsuario = "Gabigol";
        enderecoDoUsuario = "Rua 10";
        telefoneDoUsuario = "32 8833-0011";

        System.out.println("O " + nomeDoUsuario + " que mora no endereco " + enderecoDoUsuario +
                        " cujo telefone é " + telefoneDoUsuario +
                " não possui nenhuma pendencia");
        //---------------------



    }

}
