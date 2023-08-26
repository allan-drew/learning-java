package br.com.cursojava.e01generics.dominio;

public class Notebook {

    private String marca;
    private String modelo;

    public Notebook(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

}
