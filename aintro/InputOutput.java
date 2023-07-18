package br.com.cursojava.aintro;

import java.util.Scanner; // In order to use the object of Scanner, we need to import java.util.Scanner package.


public class InputOutput {

    public static void main (String[] args) {

        // ---------------------------------------------------------------------------------------------------
        // Java Output
            // System --> is a class
            // out --> is a public static field: it accepts output data.
        System.out.println("Java programming is interesting.");
        System.out.print("Java programming is interesting.");
        System.out.printf("Java programming is interesting.");
        System.out.println();

        // ---------------------------------------------------------------------------------------------------


        // Java Input
            // using the object of Scanner class.
            // we need to create an object of the Scanner class.

        // criando um objeto para pegar uma string como entrada de dados do teclado
        Scanner entradaString = new Scanner(System.in); // criando o objeto

        System.out.println("Digite uma string : ");
        String str = entradaString.next(); // usando o objeto para pegar uma string

        System.out.println(str); // imprimindo a string digitada

        // closing the scanner object
        entradaString.close(); // It is recommended to close the scanner object once the input is taken.


    }

}
