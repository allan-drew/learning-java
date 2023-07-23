package br.com.cursojava.b03variavelreferencia;

public class ArtistaTest {

    public static void main(String[] args) {

        Artista artista1 = new Artista();
        artista1.nomeArtistico = "Vintage Culture";
        artista1.nomeReal = "Lukas Ruiz";
        artista1.numeroDeOuvintes = 5000000;
        artista1.getInfoImprime(artista1);

        System.out.println("=================");

        Artista artista2 = new Artista();
        artista2.nomeArtistico = "Ben Bohmer";
        artista2.nomeReal = "Ben";
        artista2.numeroDeOuvintes = 3100000;
        artista2.getInfoImprime(artista2);

    }

}
