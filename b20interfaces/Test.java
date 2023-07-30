package br.com.cursojava.b20interfaces;

public class Test {

    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        dataBaseLoader.load();
        dataBaseLoader.checkPermission();

        System.out.println("======");

        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
        fileLoader.checkPermission();

        System.out.println("======");

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();

    }


}
