package br.com.cursojava.c10utilitiesnewIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {

    public static void main(String[] args) {

        // Listando arquivos de um diretório
        Path path = Paths.get("."); // referenciando o diretório atual com " . "

        // DirectoryStream --> An object to iterate over the entries in a directory.
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)){

            for (Path path1 :stream) {
                System.out.println(path1.getFileName());
            }

        } catch (IOException e){
            e.printStackTrace();
        }


    }

}
