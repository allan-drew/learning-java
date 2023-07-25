package br.com.cursojava.b07sobrecargametodos;

public class SpotifyArtistaTest {

    public static void main(String[] args) {

        SpotifyArtista artista1 = new SpotifyArtista();

        // sobrecarga do método init (chamando o primeiro init)
        artista1.init("dubdgoz", 4_000_000);
        System.out.println(artista1.getNomeArtistico());
        System.out.println(artista1.getNumeroDeOuvintes());

        // sobrecarga dos métodos tempoDeCarreira
        artista1.tempoDeCarreira(5);
        artista1.tempoDeCarreira(5.4);
        artista1.tempoDeCarreira(4, 6);


        System.out.println("------------------------------");

        SpotifyArtista artista2 = new SpotifyArtista();

        // sobrecarga do método init (chamando o segundo init)
        artista2.init("lane 8", 3_500_000, 29);
        System.out.println(artista2.getNomeArtistico());
        System.out.println(artista2.getNumeroDeOuvintes());
        System.out.println(artista2.getIdade());

    }

}
