package br.com.cursojava.c08utilitiesIO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {

    public static void main(String[] args) {

        File file = new File("arquivo_novo.txt");

        try {
            // criando o arquivo
            boolean isCreated = file.createNewFile();
            System.out.println("arquivo criado? " + isCreated);

            // pegando o path
            System.out.println("path: " + file.getPath());

            // pegando o path absoluto
            System.out.println("path absoluto: " + file.getAbsolutePath());

            System.out.println("É um diretório? " + file.isDirectory());
            System.out.println("É um arquivo? " + file.isFile());

            System.out.println("última modificação: " + new Date(file.lastModified()));

            // deletando o arquivo
            boolean exists = file.exists();
            if (exists) {
                System.out.println("arquivo deletado? " + file.delete());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
