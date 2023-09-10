package br.com.cursojava.l03designpatternssingleton01.test;

import br.com.cursojava.l03designpatternssingleton01.dominio.AtendimentoSingleton;

import java.time.LocalTime;

public class AtendimentoSingletonTest01 {

    public static void main(String[] args) {

        System.out.print("usuário 1 reservou 9:30 ? ");
        marcarHorario(LocalTime.of(9, 30, 0));

        System.out.println("-----------------------------------------------------------------");

        System.out.print("usuário 2 reservou 9:30 ? ");
        marcarHorario(LocalTime.of(9, 30, 0));

    }


    private static void marcarHorario(LocalTime localTime) {
        // AtendimentoSingletonEager atendimento = new AtendimentoSingletonEager("Médico"); // construtor private, logo, não podemos criar outro objeto aqui com o new

        System.out.println("--------- instancia na memória (sempre a mesma): " + AtendimentoSingleton.getINSTANCE());
        AtendimentoSingleton atendimento = AtendimentoSingleton.getINSTANCE(); // pegando o mesmo objeto, no mesmo espaço de memória!
        atendimento.reservarHorario(localTime);
    }


}
