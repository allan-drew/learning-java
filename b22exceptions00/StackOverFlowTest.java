package br.com.cursojava.b22exceptions00;

public class StackOverFlowTest {

    /*
     * Error é filha de Throwable. Logo, Error não é filha de Exception.
     * Com isso, Error não é Exception.
     * */

    /*
    * Error: situações que não conseguimos recuperar em tempo de execução.
    * Logo, precisamos parar o programa, resolver o código e executar novamente.
    *
    * Exemplo: stack overflow error
    * Error extende de Throwable
    * */

    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }

}
