package br.com.cursojava.b22exceptions03;

public class RuntimeExceptionTest02 {

    public static void main(String[] args) {
        System.out.println("Resultado: ");
        System.out.println(dividir(3, 0));
    }


    private static int dividir(int a, int b) {

        try {
            return a/b;
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return 0; // retorna 0 se o catch executar

    }

}
