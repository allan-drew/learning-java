package br.com.cursojava.b16heranca04;

public class Musica {

    protected String nomeDaMusica;
    protected int duracaoDaMusica;

    static {
        System.out.println("Bloco estático de Musica");
    }

    {
        System.out.println("Bloco não estático de Musica - 1");
    }

    {
        System.out.println("Bloco não estático de Musica - 2");
    }


    public Musica(String nomeDaMusica) {
        System.out.println("Construtor Musica() chamado");
        this.nomeDaMusica = nomeDaMusica;
    }

    public void imprime() {
        System.out.println(this.nomeDaMusica);
        System.out.println(this.duracaoDaMusica);
    }




}
