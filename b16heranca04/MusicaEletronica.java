package br.com.cursojava.b16heranca04;

public class MusicaEletronica extends Musica {

    protected String sintetizadorUsado;

    static {
        System.out.println("Bloco estático de MusicaEletronica");
    }

    {
        System.out.println("Bloco não estático de MusicaEletronica - 1");
    }

    {
        System.out.println("Bloco não estático de MusicaEletronica - 2");
    }


    public MusicaEletronica(String nomeDaMusica ){
        super(nomeDaMusica);
        System.out.println("Construtor MusicaEletronica() chamado");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.sintetizadorUsado);

    }



}
