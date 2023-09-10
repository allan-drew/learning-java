package br.com.cursojava.h02optional.test;

import br.com.cursojava.h02optional.dominio.MusicaEletronica;
import br.com.cursojava.h02optional.repositorio.MusicaEletronicaRepository;

import java.util.Optional;

public class OptionalTest02 {

    public static void main(String[] args) {

        // 3 requisitos do sistema:

        // 1) encontrar pelo nome da música e se existir, alterar:
        Optional<MusicaEletronica> musicaPeloNome = MusicaEletronicaRepository.encontrarPelonomeDaMusica("You Cant Hide");
        musicaPeloNome.ifPresent(musica -> musica.setNomeDaMusica("Vintage Culture - You Can't Hide"));
        System.out.println(musicaPeloNome);

        // 2) encontrar pelo id, e se não existir, lançar uma exeção:
        MusicaEletronica musicaPeloId = MusicaEletronicaRepository.encontrarPeloIdDaMusica(001).orElseThrow(IllegalArgumentException::new); // não lança exceção
        //MusicaEletronica musicaPeloId2 = MusicaEletronicaRepository.encontrarPeloIdDaMusica(007).orElseThrow(IllegalArgumentException::new); // lança exceção


        // 3) se não existir pelo nome da musica, criar a musica:
        MusicaEletronica novaMusica = MusicaEletronicaRepository.encontrarPelonomeDaMusica("Because You Move Me")
                .orElseGet(() -> new MusicaEletronica(005, "Tinlicker - Because You Move Me", 166));

        System.out.println(novaMusica);


    }

}
