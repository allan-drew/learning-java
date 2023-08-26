package br.com.cursojava.c10utilitiesnewIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {

    public static void main(String[] args) {

        // createDirectory
        Path pastaPath = Paths.get("pasta_teste_path");
        try {
            // Path pastaDiretorio = Files.createDirectory(pastaPath);

            // Para não termos excecao caso a pasta já tenha sido criada:
            if (Files.notExists(pastaPath)) {
                Path pastaDiretorio = Files.createDirectory(pastaPath);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //--------------------------------------------------------------------------------------------------------

        // createDirectories
        Path subPastasPath = Paths.get("pasta_teste_path_02/subpasta/subsubpasta");
        try {
            Path subPastaDiretorio = Files.createDirectories(subPastasPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //--------------------------------------------------------------------------------------------------------

        Path filePath = Paths.get(subPastasPath.toString(), "arquivo_dentro_da_sub.txt");
        try {
            if (Files.notExists(filePath)) {
                Path filePathCreated = Files.createFile(filePath);
                System.out.println(filePathCreated);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //--------------------------------------------------------------------------------------------------------

        // copiando arquivo
        Path origem = filePath;
        Path destino = Paths.get(filePath.getParent().toString(), "copy_arquivo_dentro_da_sub.txt");
        try {
            Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
