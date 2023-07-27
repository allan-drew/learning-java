package br.com.cursojava.b12staticblocos;

public class JogadorTest {


    public static void main(String[] args) {

//        System.out.println(Jogador.getLimiteDeTempoJogadoPorPartida());

        System.out.println("---- jogador1 ----");
        Jogador jogador1 = new Jogador("Gabigol");
        System.out.println("=======================================");

        System.out.println("---- jogador2 ----");
        Jogador jogador2 = new Jogador("Pedro");
        System.out.println("=======================================");

        System.out.println("---- jogador3 ----");
        Jogador jogador3 = new Jogador("Arrascaeta");
        System.out.println("=======================================");

        System.out.println("---- jogador4 ----");
        Jogador jogador4 = new Jogador();
        System.out.println("=======================================");


        // Podemos acessar o atributo static que foi inicializado pelo bloco static
        System.out.println(Jogador.getLimiteDeTempoJogadoPorPartida());

    }


}
