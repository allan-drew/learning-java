package br.com.cursojava.l03designpatternssingleton01.test;

import br.com.cursojava.l03designpatternssingleton01.dominio.Atendimento;

import java.time.LocalTime;

public class AtendimentoTest01 {

    public static void main(String[] args) {

        System.out.print("usuário 1 reservou 9:30 ? ");
        marcarHorario(LocalTime.of(9, 30, 0)); // primeiro usuário escolhe o horário de 9:30

        System.out.print("usuário 2 reservou 9:30 ? ");
        marcarHorario(LocalTime.of(9, 30, 0)); // segundo usuário também escolhe o horário de 9:30

    }

    private static void marcarHorario(LocalTime localTime) {
        Atendimento atendimento = new Atendimento("Médico");
            // Ao chamar marcarHorario, estamos criando objeto do tipo new Atendimento("Médico").
            // Nesse sentido, cada vez que criamos o objeto do tipo new Atendimento("Médico"), estamos duplicando os dados.
            // Portanto, se chamarmos duas vezes, teremos dois horário de 9:30 disponíveis, o que é ruim, pois não deve haver dois horários disponíveis.
        atendimento.reservarHorario(localTime);
    }

}
