package br.com.cursojava.c10utilitiesnewIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


class ListAllFiles extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    //
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        // return super.preVisitDirectory(dir, attrs);
        System.out.println("preVisitDirectory -------> " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return super.postVisitDirectory(dir, exc);
        // System.out.println("postVisitDirectory -------> " + dir.getFileName());
        // return FileVisitResult.CONTINUE;
    }

}

public class SimpleFileVisitorTest02 {

    public static void main(String[] args) throws IOException {

        // desta vez, vamos usar o pasta_teste_path_02 para visualizar melhor
        Path path = Paths.get("pasta_teste_path_02"); // referenciando o diretório pasta_teste_path_02

        Files.walkFileTree(path, new ListAllFiles());

    }

}
