package br.com.cursojava.b21polimorfismo00;

public class Java extends Language {

    @Override
    public void displayInfo() {
        System.out.println("Java Programming Language");
    }

    // método que existe na classe Java, mas não existe na classe Language:
    public void infoAboutJava () {
        System.out.println("Java is a high-level, class-based, object-oriented programming language");
    }

}
