package br.com.cursojava.b07sobrecargametodos;

public class SpotifyArtista {

    private String nomeArtistico;
    private int numeroDeOuvintes;
    private int idade;

    // A sobrecarga de métodos é ter os métodos com o mesmo nome,
    // porém com tipos ou quantidade de parâmetros diferentes

    //----
    public void init (String nomeArtistico, int numeroDeOuvintes) {
        this.nomeArtistico = nomeArtistico;
        this.numeroDeOuvintes = numeroDeOuvintes;
    }

    // Supondo que os requisitos do projeto mudam e agora seja necessário incluir a idade como atributo...
    // então, podemos fazer a sobrecarga do método e incluir idade
    public void init (String nomeArtistico, int numeroDeOuvintes, int idade) {
        this.init(nomeArtistico, numeroDeOuvintes);
        this.idade = idade;
    }
    //----


    //----
    public void tempoDeCarreira (int x ) {
        System.out.println("1) O tempo de carreira é " + x + " anos");
    }

    public void tempoDeCarreira (double x ) {
        System.out.println("2) O tempo de carreira é " + x + " anos");
    }

    public void tempoDeCarreira (int x, int y) {
        System.out.println("3) O tempo de carreira está entre " + x + " e " + y + " anos");
    }
    //----

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public int getNumeroDeOuvintes() {
        return numeroDeOuvintes;
    }

    public int getIdade() {
        return idade;
    }

}


