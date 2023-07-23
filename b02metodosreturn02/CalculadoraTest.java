package br.com.cursojava.b02metodosreturn02;

public class CalculadoraTest {

    public static void main(String[] args) {

        // 1) User-defined Methods
        Calculadora calc1 = new Calculadora();

        System.out.println("multiplicacao: ");
        calc1.multiplicaInteiros(5,5); // 5 e 5 são os argumentos

        System.out.println("adicao: ");
        System.out.println(calc1.adicao(2,9)); // imprimindo método que possui return

        // usando variável:
        System.out.println("adicao: ");
        int retornoAdicao = calc1.adicao(4, 5);
        System.out.println(retornoAdicao);


        // ====================
        // 2) Standard Library Methods
        // examples...
        System.out.println("square root => " + Math.sqrt(4));
        System.out.println("max two ints => " + Math.max(10, 6));



    }

}
