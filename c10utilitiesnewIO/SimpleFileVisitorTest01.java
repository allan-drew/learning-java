package br.com.cursojava.c10utilitiesnewIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


class ListJavaFiles extends SimpleFileVisitor<Path> {
//    @Override
//    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
//        System.out.println(file.getFileName());
//        return FileVisitResult.CONTINUE;
//    }

    // Se quisermos pegar apenas os arquivos .java:
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if(file.getFileName().toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }

        return FileVisitResult.CONTINUE;
    }

}

public class SimpleFileVisitorTest01 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("."); // referenciando o diretório atual com " . "

        Files.walkFileTree(path, new ListJavaFiles());

    }

}
