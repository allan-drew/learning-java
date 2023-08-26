package br.com.cursojava.c10utilitiesnewIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {

    private static void zip(Path arquivoZip, Path arquivosParaZip) {

        try(ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZip)) // DirectoryStream: navegando para pegar cada um dos arquivos para zipá-los
        {

            for (Path file: directoryStream) {
                // System.out.println(file.getFileName());

                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString()); // preparando o arquivo
                zipOutputStream.putNextEntry(zipEntry); // criando o esqueleto no zip
                Files.copy(file, zipOutputStream); // copiando o arquivo original para o zip
                zipOutputStream.closeEntry();

            }

            System.out.println("arquivo zip criado com sucesso!");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // =========================================================================================
    public static void main(String[] args) {

        // arquivo zip
        Path arquivoZip = Paths.get("pasta_teste_path_02/arquivo.zip");

        // arquivos a serem zipados
        Path arquivosParaZip = Paths.get("pasta_teste_path_02/subpasta/subsubpasta");

        //
        zip(arquivoZip, arquivosParaZip);


    }
    // =========================================================================================


}
