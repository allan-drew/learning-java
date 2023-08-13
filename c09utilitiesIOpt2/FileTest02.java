package br.com.cursojava.c09utilitiesIOpt2;

import java.io.File;
import java.io.IOException;

public class FileTest02 {

    public static void main(String[] args) {

        // criando diretório
        File fileDiretorio = new File("pasta_File_Test");
        boolean isDiretorioCreated = fileDiretorio.mkdir(); // mkdir --> Creates the directory named by this abstract pathname
        System.out.println(isDiretorioCreated);

        // criando arquivo dentro do diretório
        File fileArquivo = new File("/Users/allan-andrew/Desktop/curso-JAVA/pasta_File_Test/arquivo_diretorio.txt");
        try {
            boolean isFileArquivoCreated = fileArquivo.createNewFile();
            System.out.println(isFileArquivoCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // renomeando arquivo
        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isFileRenamed = fileArquivo.renameTo(fileRenamed);
        System.out.println(isFileRenamed);

        // renomeando diretório
        File diretorioRenamed = new File("pasta_File_Test02");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenamed);




    }

}
