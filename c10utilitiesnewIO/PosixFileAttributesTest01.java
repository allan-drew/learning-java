package br.com.cursojava.c10utilitiesnewIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest01 {

    public static void main(String[] args) throws IOException {

        // ********* UNIX *********
        // // PosixFileAttributes --> File attributes associated with files on file systems used by operating systems
        // that implement the Portable Operating System Interface (POSIX) family of standards. (mais voltada para unix)

        Path path = Paths.get("pasta_teste_path_02/subpasta/subsubpasta/new_basic_attr.txt");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);

        // verificando as permissoes do arquivo
        System.out.println(posixFileAttributes.permissions());

        // alterando as permissoes do arquivo
        PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("r--r--r--");
        fileAttributeView.setPermissions(posixFilePermissions);
        System.out.println(fileAttributeView.readAttributes().permissions());

        // agora o arquivo está apenas para read, com isso, não conseguimos alterar o conteúdo!

    }

}
