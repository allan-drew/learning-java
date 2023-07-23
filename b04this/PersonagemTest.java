package br.com.cursojava.b04this;

public class PersonagemTest {

    public static void main(String[] args) {

        Personagem personagem1 = new Personagem();
        personagem1.nomeDoPersonagem = "GOKU";
        personagem1.idadeDoPersonagem = 5;
        personagem1.InfoImprime();


        System.out.println("=============================");

        Personagem personagem2 = new Personagem();
        personagem2.nomeDoPersonagem = "Vegeta";
        personagem2.idadeDoPersonagem = 6;
        personagem2.InfoImprime();

    }

}
