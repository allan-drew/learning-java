package br.com.cursojava.c10utilitiesnewIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {

    public static void main(String[] args) throws IOException {


        // ********* WINDOWS *********
        // DosFileAttributes --> File attributes associated with a file in a file system that supports legacy "DOS" attributes. (mais para Windows)
        Path path = Paths.get("pasta_teste_path_02/subpasta/subsubpasta/new_basic_attr.txt");


        // como foi rodado no MAC, temos uma exceção!!!
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden()); // UnsupportedOperationException
        System.out.println(dosFileAttributes.isReadOnly()); // UnsupportedOperationException

    }

}
