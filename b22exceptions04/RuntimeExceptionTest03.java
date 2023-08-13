package br.com.cursojava.b22exceptions04;

// LANÇANDO EXCEÇÃO:
    // para lançar exceção, utilizamos o throw new...

public class RuntimeExceptionTest03 {

    public static void main(String[] args) {

        System.out.println("O resultado é: ");

        // -------------- SEM TRATAMENTO try catch -------------- :
        // divida(2, 0);
        // System.out.println("----- código finalizado -----");

        // -------------- COM TRATAMENTO try catch --------------
        // O tratamento é opcional em exceções do tipo Runtime...
        // Porém, se não fizermos esse tratamento try catch, o sout com "código finalizado "não será mostrado:
        try {
            System.out.println(divida(10, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("----- código finalizado -----");

    }

    /**
     * @param a -> pode ser 0.
     * @param b -> não pode ser 0.
     * @return -> a/b.
     * @throws IllegalArgumentException -> caso b seja 0
     * */
    private static int divida(int a, int b) {

        // Sabendo que a divisão não poderá ser por zero, podemos lançar uma exceção.
        if (b == 0) {
            // throw new RuntimeException("ARGUMENTO ILEGAL! b NÃO PODE SER 0!");
            // usando exceção mais específica:
            throw new IllegalArgumentException("ARGUMENTO ILEGAL! b NÃO PODE SER 0!");
        }
        return a/b;
    }

}
