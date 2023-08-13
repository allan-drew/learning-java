package br.com.cursojava.c08utilitiesIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {

    public static void main(String[] args) {

        File file = new File("file02.txt");

        try (FileWriter fw = new FileWriter(file, true); // FileWriter recebe um File
                    BufferedWriter br = new BufferedWriter(fw)) { // BufferedWriter recebe um FileWriter
            br.write("Olá mundo! Eu estou aprendendo JAVA!");
            br.newLine(); // Pula a linha baseado no S.O, em vez de usar \n já que nem todos
            br.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
