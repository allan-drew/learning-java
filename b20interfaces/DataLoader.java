package br.com.cursojava.b20interfaces;

// An interface is a fully abstract class.

public interface DataLoader {

    // Por padrão, os atributos em interfaces são constantes (final)
    // public static final int MAX_DATA_SIZE = 10; // redundante
    int MAX_DATA_SIZE = 10;

    // O método na interface no Java por padrao é public e abstract,
    // public abstract void load(); // redundante
    void load();


    // DEFAULT METHODS:
    // Methods with implementation inside an interface. Java 8+
    // por padrão são public
    /*
         Com a possibilidade de o método ser implementado na própria interface (default methods),
         não temos a obrigação de implementar o método checkPermission() nas classes (DataBaseLoader e FileLoader)

         Entretando, ainda assim podemos fazer o override do método....

         Os métodos default foram criados no Java para que fosse adicionar um novo método na interface
         sem dar problema nas classes que implementam a interface,
         pois ao criar um novo método na interface sem implementação, seríamos obrigados a implementar
         em todas as classes que implementam essa interface. Isso poderia gerar muitos erros.
     */
    default void checkPermission() {
        System.out.println("Checando permissões...(no nível da interface)");
    }

    // STATIC METHODS:
    // Pertencem à interface, e portanto não serão sobrescritos...
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do método retrieveMaxDataSize() na interface...");
    }


}
