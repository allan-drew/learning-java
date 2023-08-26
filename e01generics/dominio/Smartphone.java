package br.com.cursojava.e01generics.dominio;

public class Smartphone {

    private String marca;
    private String modelo;

    public Smartphone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

}
