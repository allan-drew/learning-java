package br.com.cursojava.c08utilitiesIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {

    public static void main(String[] args) {

        File file = new File("file02.txt");

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)){

            String linha;

            while ((linha = br.readLine()) != null) { // readLine -> return null if the end of the stream has been reached without reading any characters
                System.out.println(linha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
