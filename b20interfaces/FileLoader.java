package br.com.cursojava.b20interfaces;

public class FileLoader implements DataLoader {

    // Implementando o método abstrato da interface
    @Override
    public void load() {
        System.out.println("carregando dados de um arquivo");
    }

}
