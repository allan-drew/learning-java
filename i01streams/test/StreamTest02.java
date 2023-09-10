package br.com.cursojava.i01streams.test;

import br.com.cursojava.i01streams.dominio.MusicArtists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// A classe Stream é uma das principais adições introduzidas no Java 8
// para lidar com sequências de elementos de dados de maneira mais eficiente e expressiva.

// Ela faz parte do pacote java.util.stream e permite que você execute operações em coleções
// (como listas, conjuntos, mapas etc.) de uma maneira funcional e declarativa.


public class StreamTest02 {

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

        // *************************** USANDO STREAMS *************************************************************

        // 1) ordenar os artistas pelo nome
        Stream<MusicArtists> stream01 = artistslist.stream().sorted(Comparator.comparing(MusicArtists -> MusicArtists.getArtistName()));
        stream01.forEach(System.out::println);


        System.out.println("------------------------------------------------------------------------------------------");

        // 2) retornar os 3 primeiros artistas com menos de 3.000.000 de ouvintes mensais
        List<String> artistsNamesList = artistslist.stream()
                .sorted(Comparator.comparing(MusicArtists -> MusicArtists.getArtistName()))
                .filter(MusicArtists -> MusicArtists.getMonthlyListeners() < 3_000_000)
                .limit(3)
                .map(MusicArtists -> MusicArtists.getArtistName())
                .collect(Collectors.toList());

        System.out.println(artistsNamesList);

    }

}
