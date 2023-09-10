package br.com.cursojava.l03designpatternssingleton01.dominio;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

// Sem usar SINGLETON

public final class Atendimento {

    private final String tipoAtendimento;

    public Atendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    private final Set<LocalTime> horariosDisponiveis = new HashSet<>();

    // ------
    {
        horariosDisponiveis.add(LocalTime.of(9, 30, 0));
        horariosDisponiveis.add(LocalTime.of(11, 0, 0));
        horariosDisponiveis.add(LocalTime.of(12, 30, 0));
    }
    // ------


//    public boolean reservarHorario (LocalTime localTime) {
//        return horariosDisponiveis.remove(localTime);
//    }

    public void reservarHorario (LocalTime localTime) {
        if(horariosDisponiveis.remove(localTime)) {
            System.out.println("MARCADO!");
        } else {
            System.out.println("ERRO!!!!! HORÁRIO JÁ OCUPADO! ");
        }
    }


}
