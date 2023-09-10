package br.com.cursojava.i01streams.test;

import br.com.cursojava.i01streams.dominio.MusicArtists;

import java.util.ArrayList;
import java.util.List;

public class StreamTest06 {

    private static List<MusicArtists> artistslist = new ArrayList<>(List.of (
            new MusicArtists("Ben Bohmer", 3_597_857),
            new MusicArtists("Tinlicker", 6_092_364),
            new MusicArtists("Marsh", 1_140_552),
            new MusicArtists("Lane 8", 2_345_264),
            new MusicArtists("Avoure", 456_261),
            new MusicArtists("Black Coffee", 2_179_021),
            new MusicArtists("Lutrell", 346_550)
    ));


    public static void main(String[] args) {

        // somando todos ouvintes mensais acima de 3_000_000 e retornando a soma deles
        artistslist.stream()
                .map(MusicArtists::getMonthlyListeners)
                .filter(monthlyListeners -> monthlyListeners > 3_000_000)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

    }


}
