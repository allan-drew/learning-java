package br.com.cursojava.b22exceptions02;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {

    public static void main(String[] args) {

        // A pasta 'pastaTesteException' em curso-JAVA teve as permissões alteradas manualmente para Read only.
        // Com isso, não conseguimos mais criar o arquivo teste.txt dentro dela,
        // assim, ao chamarmos o método criarNovoArquivo(), temos uma exceção.
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {

        File file = new File("pastaTesteException/teste.txt");

        //tente realizar a tarefa
        try {
            /* O método createNewFile() tem possibilidade de lançar uma IOException.
             * IOException é filha de Exception. É uma exceção do tipo checked. Logo, é necessário tratar. */
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado? " + isCreated);
        } catch (IOException e){ // capture a exceção, caso dê algum erro.
            // Nunca deixa o bloco catch em branco!
            // evite regras de negócio no catch!
            System.out.println("catching exception and printing stack trace...");
            e.printStackTrace();
        }

    }


}
