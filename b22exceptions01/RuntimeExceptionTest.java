package br.com.cursojava.b22exceptions01;

public class RuntimeExceptionTest {

    public static void main(String[] args) {

        /* Unchecked exceptions: RuntimeException and its subclasses are unchecked exceptions.

        * RuntimeException são exceções ocorridas por erro no desenvolvimento.
        * RuntimeException é filha de Exception, que é filha de Throwable.

        * https://docs.oracle.com/javase/8/docs/api/java/lang/RuntimeException.html
        * */

        // exemplo (ArrayIndexOutOfBoundsException):
        int[] numeros = {1, 4, 2};
        System.out.println(numeros[3]); // runtime exception --> ArrayIndexOutOfBoundsException

    }

}
