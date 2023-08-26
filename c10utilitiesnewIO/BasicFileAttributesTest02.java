package br.com.cursojava.c10utilitiesnewIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("pasta_teste_path_02/subpasta/subsubpasta/new_basic_attr.txt");

        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        // os retornos são no horário UTC
        FileTime creationTime = basicFileAttributes.creationTime();
        System.out.println("Creation time: "+ creationTime);

        FileTime lasModified = basicFileAttributes.lastModifiedTime();
        System.out.println("Last modified time: " + lasModified);

        FileTime lastAccess = basicFileAttributes.lastAccessTime();
        System.out.println("Last access time: " + lastAccess);

        System.out.println("---------------------------------------------------");

        // quando temos View no final da interface podemos fazer alterações.
        // Portanto, podemos alterar a data/hora do último accesso usando a BasicFileAttributeView

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);

        FileTime newlastAccess = FileTime.fromMillis(System.currentTimeMillis()); // pegando o horario de agora e setando abaixo
        fileAttributeView.setTimes(lasModified, newlastAccess, creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        System.out.println("Creation time: "+ creationTime);

        lasModified = fileAttributeView.readAttributes().lastModifiedTime();
        System.out.println("Last modified time: " + lasModified);

        lastAccess = fileAttributeView.readAttributes().lastAccessTime();
        System.out.println("Last access time: " + lastAccess);


    }

}
