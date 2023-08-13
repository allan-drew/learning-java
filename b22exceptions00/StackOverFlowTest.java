package br.com.cursojava.b22exceptions00.test;

public class StackOverFlowTest {

    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }

}
