package br.com.cursojava.i01streams.test;

import br.com.cursojava.i01streams.dominio.MusicArtists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {

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

        artistslist.forEach(System.out::println); // nice!! ((método dentro da interface Iterable))
        System.out.println("_________________________________________________");
        // artistslist.stream().forEach(System.out::println); // bad!! Não é necessário criar o stream() para essa tarefa, devido ao desperdício de processamento. ((método dentro do Stream))


        // quantidade de artistas com MAIS de 3 milhões de ouvientes mensais
        Stream<MusicArtists> stream01 = artistslist.stream();
        long count = stream01
                .filter(ma -> ma.getMonthlyListeners() > 3_000_000)
                .count();

        System.out.println(count);

        // quantidade de artistas DISTINTOS com MAIS de 3 milhões de ouvientes mensais
        Stream<MusicArtists> stream02 = artistslist.stream(); // necessário abrir stream novamente
        long countDistinct = stream02
                .distinct()
                .filter(musicArtists -> musicArtists.getMonthlyListeners() > 3_000_000)
                .count();

        System.out.println(countDistinct); // necessário ter equals e hashCode implementados na classe


    }

}
