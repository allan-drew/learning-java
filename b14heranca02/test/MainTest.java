package br.com.cursojava.b14heranca02.test;

import br.com.cursojava.b14heranca02.dominio.Dog;

public class MainTest {

    public static void main(String[] args) {

        Dog labrador = new Dog();
//        labrador.name = "Tobby"; // o acesso a variável name está protected.
                // Como MainTest não está no mesmo pacote e também não faz herança,
                // então não tem como ter o acesso.

//        labrador.imprime(); // o acesso ao método imprime() está protected.
//                // Como MainTest não está no mesmo pacote e também não faz herança,
//                // então não tem como ter o acesso.



        // =================================================
        labrador.relatorioDoBicho(); // método público

    }

}
