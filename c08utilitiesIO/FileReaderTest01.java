package br.com.cursojava.c08utilitiesIO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {

    public static void main(String[] args) {

        File file = new File("file.txt");

        try (FileReader fr = new FileReader(file)){

            int i;
            while ((i = fr.read()) != -1 ) { // read retorna -1 se o final do arquivo for alcançado
                System.out.print((char)i); // cast para char para pegar os characteres correspondentes da ascii
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
