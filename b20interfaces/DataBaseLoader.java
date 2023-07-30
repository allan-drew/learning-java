package br.com.cursojava.b20interfaces;


// a classe DataBaseLoader implementa a interface DataLoader
// aqui, não se usa mais extends, e sim implements

// To use an interface, other classes must implement it.
// We use the implements keyword to implement an interface.
public class DataBaseLoader implements DataLoader {

    // Implementando o método abstrato da interface
    @Override
    public void load() {
        System.out.println("carregando dados do banco de dados");
    }

    // métodos static pertencem à interface, e portanto não serão sobrescritos...
    // @Override // Static methods cannot be annotated with @Override
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do método retrieveMaxDataSize() na class...");
    }

}
