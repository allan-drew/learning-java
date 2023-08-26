package br.com.cursojava.c10utilitiesnewIO;

// Java New IO
// Java NIO was created to allow Java programmers to implement high-speed input-output operations without having to write custom native code.

// NIO moves the most time-consuming I/O activities (namely, filling and draining buffers) back into the operating system, thus allowing for a great increase in speed.

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {

    public static void main(String[] args) {

        Path p1 = Paths.get("/Users/allan-andrew/Desktop/curso-JAVA/file02.txt");
        System.out.println(p1.getFileName());
        System.out.println(p1.getFileSystem());

        Path p2 = Paths.get("/Users/allan-andrew/Desktop/curso-JAVA", "file.txt");
        System.out.println(p2.getFileName());
        System.out.println(p2.getFileSystem());

        Path p3 = Paths.get("Users", "allan-andrew", "Desktop", "curso-JAVA", "pasta_File_Test" , "arquivo_renomeado.txt");
        System.out.println(p3.getFileName());
        System.out.println(p3.getFileSystem());

    }

}
