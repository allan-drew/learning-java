package br.com.cursojava.b22exceptions06;

// bloco finally: sempre executado, independente se executou normalmente ou se teve exceção.
    // O bloco finally é utilizado quando necessário trabalhar com recursos sendo liberados por outras aplicações,
    // que precisam ser fechados após o uso.

public class RuntimeExceptionTest04 {

    public static void main(String[] args) {

        try {
            System.out.println("Abrindo o arquivo...");
            System.out.println("Escrevendo dados no arquivo...");
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // bloco sempre executado
            System.out.println("Fechando recursos do S.O");
        }

        System.out.println("-------------------------------------------------------------------------------");

        try {
            System.out.println("Acessando dados...");
            throw new RuntimeException(); // mesmo havendo exceção, o bloco finally abaixo é executado.
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // bloco sempre executado
            System.out.println("Fechando recursos...");
        }

    }

}
