package br.com.cursojava.b22exceptions07;

// Capturando múltiplas exceções
// Exceções mais genéricas vão no final dos catchs

public class RuntimeExceptionTest05 {

    public static void main(String[] args) {

        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("excecao ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("excecao IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("excecao IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("excecao ArithmeticException");
        } catch (RuntimeException e) { // Exceções mais genéricas vão no final dos catchs
            System.out.println("excecao RuntimeException");
        }

    }

}
