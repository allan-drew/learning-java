package br.com.cursojava.b02metodos;

public class CarroTest {

    public static void main(String[] args) {

        Carro primeiroCarro = new Carro();

         primeiroCarro.marca = "VW";
         primeiroCarro.modelo = "Nivus";
         primeiroCarro.velocidadeMaxima = 200;

        System.out.println(primeiroCarro.marca);
        System.out.println(primeiroCarro.modelo);
        System.out.println(primeiroCarro.velocidadeMaxima);

        System.out.println("=========");

        Carro segundoCarro = new Carro();
        segundoCarro.marca = "Honda";
        segundoCarro.modelo = "Civic";
        segundoCarro.velocidadeMaxima = 225;

        System.out.println("A marca do segundo carro é " + segundoCarro.marca);
        System.out.println("O modelo do segundo carro é " + segundoCarro.modelo);
        System.out.println("A velocidade máxima do segundo carro é " + segundoCarro.velocidadeMaxima);

        System.out.println("=========");

        Carro terceiroCarro = new Carro();

        System.out.println(terceiroCarro.marca);
        System.out.println(terceiroCarro.modelo);
        System.out.println(terceiroCarro.velocidadeMaxima);

        System.out.println("=========");


        primeiroCarro.frear();
        segundoCarro.frear();
        terceiroCarro.frear();


    }

}
