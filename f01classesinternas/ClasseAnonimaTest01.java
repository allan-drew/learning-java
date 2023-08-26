package br.com.cursojava.f01classesinternas;


// Anonymous Inner Class (Classe Interna Anônima):

// Uma classe sem nome definida diretamente como parte de uma expressão.
// Geralmente usada para implementar interfaces ou classes abstratas de forma concisa.

public class ClasseAnonimaTest01 {

    public static void main(String[] args) {

        // ------------------------------------------------------------
        InterfaceExemplo obj = new InterfaceExemplo() {
            public void metodoInterface() {
                System.out.println("Implementação anônima");
            }
        };

        obj.metodoInterface();
        // ------------------------------------------------------------


        // ------------------------------------------------------------
        InterfaceExemplo obj02 = new InterfaceExemplo() {
            public void metodoInterface() {
                System.out.println("Outra Implementação anônima");
            }
        };

        obj02.metodoInterface();
        // ------------------------------------------------------------

        System.out.println("------------------------------------------------------------");


        // ------------------------------------------------------------
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Walking in the shadows!!!!!!");
            }
        };

        animal.walk(); // a implementação anonima que criamos só será usada no contexto da variável de referência 'animal'
        // ------------------------------------------------------------

        // ------------------------------------------------------------
        // neste caso, não estamos usando a classe anonima!
        Animal animal02 = new Animal();
        animal02.walk();
        // ------------------------------------------------------------


    }

}

interface InterfaceExemplo {
    void metodoInterface();
}

class Animal {
    public void walk() {
        System.out.println("Walking...");
    }
}

