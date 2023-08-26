package br.com.cursojava.c10utilitiesnewIO;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {

    public static void main(String[] args) {

        // Interfaces:
        // BasicFileAttributes --> Basic attributes associated with a file in a file system. (mais geral)
        // DosFileAttributes --> File attributes associated with a file in a file system that supports legacy "DOS" attributes. (mais para Windows)
        // PosixFileAttributes --> File attributes associated with files on file systems used by operating systems that implement the Portable Operating System Interface (POSIX) family of standards. (mais voltada para unix)


        // ===================================================================================================================
        // USANDO IO
        LocalDateTime date = LocalDateTime.now().minusDays(10); // data de hoje menos 10 dias

        File file = new File("pasta_teste_path_02/subpasta/subsubpasta/ARQUIVO_NOVO.txt");

        try {
            boolean isCreated = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());



        // ===================================================================================================================
        // USANDO NIO
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));

        Path path = Paths.get("pasta_teste_path_02/subpasta/subsubpasta/ARQUIVO_NOVO_PATHS.txt");

        try {
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.setLastModifiedTime(path, fileTime);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));


    }

}
