package br.com.cursojava.b24strings;


/*
 * String: é imutável e não thread-safe.
 * StringBuilder: é mutável e não thread-safe.
 */

public class StringsTest03 {

    public static void main(String[] args) {

        String nomeTime = "Inter de "; // imutavel
        nomeTime.concat("Milão");
        System.out.println(nomeTime);

        // Para utilizar o novo valor é necessário associar o novo valor para a variável de referência.
        nomeTime = nomeTime.concat(" Milão");
        System.out.println(nomeTime);


        StringBuilder nomeTime02 = new StringBuilder("Atlético de "); // mutavel
        nomeTime02.append("Madrid");
        System.out.println(nomeTime02);

    }

}
