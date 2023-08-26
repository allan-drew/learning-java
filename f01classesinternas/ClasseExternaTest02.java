package br.com.cursojava.f01classesinternas;

public class ClasseExternaTest02 {

    public void metodoExterno() {

        // Local Inner Class (Classe Interna Local):
        // Uma classe definida dentro de um método.
        class ClasseInternaLocal {
            public void mostrarMensagem() {
                System.out.println("Classe interna local");
            }

        }
        // A classe só é acessível dentro do método onde foi definida.
        ClasseInternaLocal classeInterna = new ClasseInternaLocal(); // necessário instanciar no método
        classeInterna.mostrarMensagem();
    }

    // ---------------------------------------------------------
    public static void main(String[] args) {
        ClasseExternaTest02 outer = new ClasseExternaTest02();
        outer.metodoExterno();
    }



}
