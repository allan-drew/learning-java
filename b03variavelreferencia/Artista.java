package br.com.cursojava.b03variavelreferencia;

public class Artista {

    public String nomeArtistico;
    public String nomeReal;
    public int numeroDeOuvintes;

    public void getInfoImprime(Artista art) {
                // art ===> variável de referencia para o método
                // essa variável está esperando um objeto do tipo Artista
        System.out.println("O nome artistico é : " + art.nomeArtistico);
        System.out.println("O nome real é : " + art.nomeReal);
        System.out.println("O numero de ouvintes é : " + art.numeroDeOuvintes);
    }

    // porém...a variável de referência pode ser trocada pelo 'this', pois quem executa é o objeto

}
