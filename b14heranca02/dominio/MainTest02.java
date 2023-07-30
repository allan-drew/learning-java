package br.com.cursojava.b14heranca02.dominio;

public class MainTest02 {

    public static void main(String[] args) {

        Dog labrador = new Dog();
        labrador.name = "Tobby"; // o acesso a essa variável está protegido, mas....
        // ...neste caso, é possível o acesso pois está no mesmo pacote.

//        labrador.idade = 10; // o acesso a essa variável está private.
            // Para ter acesso, seria necessario o metodo set/get

        labrador.imprime(); // o acesso a esse método está protegido, mas....
        // ...neste caso, é possível o acesso pois está no mesmo pacote.


        // =================================================
        labrador.relatorioDoBicho(); // método público


    }
}
