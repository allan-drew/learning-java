package br.com.cursojava.l03designpatternssingleton01.dominio;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

/*
O padrão de projeto Singleton em Java é um padrão que garante que uma classe tenha apenas uma instância em todoo o programa
e fornece um ponto de acesso global a essa instância.
Isso pode ser útil para classes que representam recursos compartilhados, como conexões de banco de dados, arquivos de configuração, etc.
 */

public class AtendimentoSingleton {

    // Definir um atributo estático e privado do tipo da própria classe.
    // Esse atributo vai armazenar a única instância da classe.
//    private static final AtendimentoSingletonEager INSTANCE = new AtendimentoSingletonEager("Médico");
    private static AtendimentoSingleton INSTANCE;

    private final String tipoAtendimento;

    // Definir um construtor privado. Isso impede que outras classes possam instanciar a classe diretamente.
    // construtor privado para não ser possível dar um new AtendimentoSingletonEager no test!
    // Com isso, quando chamarmos getINSTANCE, estamos pegando sempre o mesmo objeto, que é o new AtendimentoSingletonEager("Médico")
    private AtendimentoSingleton(String tipoAtendimento) {
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
        if(horariosDisponiveis.remove(localTime)) { // if true
            System.out.println("MARCADO!");
        } else { // if false
            System.out.println("ERRO!!!!! HORÁRIO JÁ OCUPADO! ");
        }
    }


    // Definir um método público e estático para obter a instância da classe.
    // Usando synchronized para não ter problemas em ambientes multithreads
    public synchronized static AtendimentoSingleton getINSTANCE() {

        // verifica se o atributo estático já foi inicializado
        if (INSTANCE == null) {
            INSTANCE = new AtendimentoSingleton("Médico"); // cria uma nova instância e atribui ao atributo estático.
        }

        return INSTANCE;
    }

}
