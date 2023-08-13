package br.com.cursojava.b22exceptions05;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {

    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    // A assinatura do método precisa do 'throws IOException', por causa da exceção do tipo checked.
    private static void criarNovoArquivo() throws IOException {

        File file = new File("pastaTesteException/teste.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado? " + isCreated);
        } catch (IOException e){
            System.out.println("catching exception and printing stack trace...");
            e.printStackTrace(); // exceção tratada (exibida no console)

            // podemos relançar a exceção.
            throw e;
            // Com o relançamento da exceção, o método main pode fazer o uso disso, e fazer algo com a exceção.
        }

    }


}
