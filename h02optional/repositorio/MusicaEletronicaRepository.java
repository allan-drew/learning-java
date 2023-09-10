package br.com.cursojava.h02optional.repositorio;

import br.com.cursojava.h02optional.dominio.MusicaEletronica;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MusicaEletronicaRepository {

    // simulando D.B:
    private static List<MusicaEletronica> musicas = List.of(
            new MusicaEletronica(001, "You Cant Hide", 162),
            new MusicaEletronica(002, "Father Ocean", 288),
            new MusicaEletronica(003, "Red Lights", 211),
            new MusicaEletronica(004, "So Far Away", 241)
            );

    // usando programação funcional para criar método que aceita comportamento parametrizado para não repetir a lógica de negócio
    public static Optional<MusicaEletronica> encontrarPelo (Predicate<MusicaEletronica> predicate) {
        MusicaEletronica encontrado = null;

        for (MusicaEletronica musica: musicas) {
            if (predicate.test(musica)) {
                encontrado = musica;
            }
        }
        return Optional.ofNullable(encontrado);
    }

    public static Optional<MusicaEletronica> encontrarPelonomeDaMusica (String nomeDaMusica) {
        return encontrarPelo(music -> music.getNomeDaMusica().equals(nomeDaMusica));
    }

    public static Optional<MusicaEletronica> encontrarPeloIdDaMusica (Integer id) {
        return encontrarPelo(music -> music.getId().equals(id));
    }


}


