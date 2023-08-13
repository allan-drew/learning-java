package br.com.cursojava.b24strings;

// Desempenho de String vs StringBuilder vs StringBuffer

/*
* String: é imutável e não thread-safe.
* StringBuilder: é mutável e não thread-safe.
* StringBuffer: é mutável e thread-safe.
*
* Em regra, usar String.
*/

public class StringsTest02 {

    public static void main(String[] args) {

        System.out.println(" ---------------------------- Desempenho String ---------------------------- ");
        long inicioTempoString = System.currentTimeMillis();
        System.out.println("tempo inicio " + inicioTempoString);

        concatenarString(200_000);

        long fimTempoString = System.currentTimeMillis();
        System.out.println("tempo fim " + fimTempoString);

        System.out.println("tempo decorrido String " + (fimTempoString - inicioTempoString) + " ms");


        System.out.println("-------------------");

        System.out.println(" ---------------------------- Desempenho String Builder ---------------------------- ");

        long inicioTempoStringBuilder = System.currentTimeMillis();
        System.out.println("tempo inicio " + inicioTempoStringBuilder);

        concatenarStringBuilder(200_000);

        long fimTempoStringBuilder = System.currentTimeMillis();
        System.out.println("tempo fim " + fimTempoStringBuilder);

        System.out.println("tempo decorrido String Builder " + (fimTempoStringBuilder - inicioTempoStringBuilder) + " ms");

        System.out.println("-------------------");

        System.out.println(" ---------------------------- Desempenho String Buffer ---------------------------- ");

        long inicioTempoStringBuffer = System.currentTimeMillis();
        System.out.println("tempo inicio " + inicioTempoStringBuffer);

        concatenarStringBuffer(200_000);

        long fimTempoStringBuffer = System.currentTimeMillis();
        System.out.println("tempo fim " + fimTempoStringBuffer);

        System.out.println("tempo decorrido String Buffer " + (fimTempoStringBuffer - inicioTempoStringBuffer) + " ms");

    }

    private static void concatenarString(int tamanho) {
        String texto = "";

        for (int i = 0; i < tamanho; i++) {
            texto += i; // 0, 01, 012, 0123, 01234...
        }
    }


    private static void concatenarStringBuilder (int tamanho) {
        StringBuilder text = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            text.append(i); // 0, 01, 012, 0123, 01234...
        }
    }

    private static void concatenarStringBuffer (int tamanho) {
        StringBuffer text = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++) {
            text.append(i); // 0, 01, 012, 0123, 01234...
        }
    }

}


