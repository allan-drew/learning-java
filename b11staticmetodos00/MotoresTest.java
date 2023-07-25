package br.com.cursojava.b11staticmetodos00;

public class MotoresTest {

    public static void main(String[] args) {

        // Podemos chamar um método estático diretamente da classe sem precisar criar uma instância da classe.
        Motores.setRpmLimite(8000);

        // criando primeira instancia
        Motores motor001 = new Motores("motor tsi", 10000);
        motor001.imprimeInfo();

        // criando segunda instancia
        Motores motor002 = new Motores("motor mpi", 9000);
        motor002.imprimeInfo();

        //-------------------------
        System.out.println(Motores.getRpmLimite());
        System.out.println("==============================");

        //-------------------------
        // The Math class in Java has almost all of its members static.
        // So, we can access its members without creating instances of the Math class.
        // It is possible because the methods and variables of the Math class are static.
        System.out.println("Value of PI = " + Math.PI);

    }

}
