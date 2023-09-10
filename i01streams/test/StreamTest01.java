package br.com.cursojava.i01streams.test;


// TAREFAS:
// 1) ordenar os artistas pelo nome
// 2) retornar os 3 primeiros nomes dos artistas com menos de 3.000.000 de ouvintes mensais

import br.com.cursojava.i01streams.dominio.MusicArtists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {

    private static List<MusicArtists> artistslist = new ArrayList<>(List.of (
            new MusicArtists("Ben Bohmer", 3_597_857),
            new MusicArtists("Tinlicker", 6_092_364),
            new MusicArtists("Marsh", 1_140_552),
            new MusicArtists("Lane 8", 2_345_264),
            new MusicArtists("Avoure", 456_261),
            new MusicArtists("Black Coffee", 2_179_021),
            new MusicArtists("Lutrell", 346_550)
    ));

    // -----
    public static void main(String[] args) {

        // *************************** SEM USAR STREAMS *************************************************************

        // 1) ordenar os artistas pelo nome
        artistslist.sort(Comparator.comparing(MusicArtists -> MusicArtists.getArtistName()));
        System.out.println(artistslist);

        System.out.println("------------------------------------------------------------------------------------------");

        // 2) retornar os 3 primeiros artistas com menos de 3.000.000 de ouvintes mensais
        List<String> artistsNamesList = new ArrayList<>();

        for (MusicArtists artist: artistslist) {
            if (artist.getMonthlyListeners() < 3_000_000) {
                artistsNamesList.add(artist.getArtistName());
            }
            if(artistsNamesList.size() >= 3) {
                break;
            }
        }
        System.out.println(artistsNamesList);

        // ************************************************************************************************************

    }

}
