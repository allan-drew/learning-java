package br.com.cursojava.i01streams.test;

import br.com.cursojava.i01streams.dominio.MusicArtists;

import java.util.ArrayList;
import java.util.List;

public class StreamTest04 {


    private static List<MusicArtists> artistslist = new ArrayList<>(List.of (
            new MusicArtists("Ben Bohmer", 3_597_857),
            new MusicArtists("Ben Bohmer", 3_597_857), // ========> DUPLICADO
            new MusicArtists("Tinlicker", 6_092_364),
            new MusicArtists("Marsh", 1_140_552),
            new MusicArtists("Lane 8", 2_345_264),
            new MusicArtists("Avoure", 456_261),
            new MusicArtists("Black Coffee", 2_179_021),
            new MusicArtists("Lutrell", 346_550)
    ));


    public static void main(String[] args) {

        // existe algum artista com menos de 400k ouvintes mensais ?
        boolean b01 = artistslist.stream().anyMatch(artist -> artist.getMonthlyListeners() < 400_000);
        System.out.println(b01);

        // existe algum artista com menos de 100k ouvintes mensais ?
        boolean b02 = artistslist.stream().anyMatch(artist -> artist.getMonthlyListeners() < 100_000);
        System.out.println(b02);

        // todos os artistas possuem mais de 0 ouvintes mensais ?
        boolean b03 = artistslist.stream().allMatch(artist -> artist.getMonthlyListeners() > 0); // true! todos possuem mais de 0 ouvintes
        System.out.println(b03);

        // todos os artistas possuem 346_550 ouvientes mensais ?
        boolean b04 = artistslist.stream().allMatch(artist -> artist.getMonthlyListeners() == 346_550); // false, apenas um possui 346_550 ouvintes
        System.out.println(b04);




    }

}
