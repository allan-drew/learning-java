package br.com.cursojava.b01introclasses;

public class EstudanteTest {

    public static void main(String[] args) {

        // criando um objeto da classe Estudante (object is called an instance of a class)
        Estudante estudante1 = new Estudante();
                    // We have used the 'new' keyword along with the constructor of the class to create an object.
                    // Constructors are similar to methods and have the same name as the class.
                    // Estudante() is the constructor of the Estudante class.

        // estudante1 é a variável de referência para acessar os atributos da classe
        estudante1.nome = "Gabriel";
        estudante1.matricula = "202312345ABC";
        estudante1.idade = 28;

        System.out.println("O nome é " + estudante1.nome);
        System.out.println("A matrícula é " + estudante1.matricula);
        System.out.println("A idade é " + estudante1.idade);

        System.out.println("-----------------------------------------------");

        Estudante estudante2 = new Estudante();

        // estudante2 é a variável de referência para acessar os atributos da classe
        estudante2.nome = "Amanda";
        estudante2.matricula = "199412345ABC";
        estudante2.idade = 32;

        System.out.println("O nome da estudante2 é " + estudante2.nome);
        System.out.println("A matrícula da estudante2 é " + estudante2.matricula);
        System.out.println("A idade da estudante2 é " + estudante2.idade);


        // O problema desse código é que ao criar vários objetos, o código começará a ficar gigante
        // Podemos então passar o código que imprime as informacoes para um método dentro da classe


    }

}
