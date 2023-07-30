package br.com.cursojava.b14heranca;

public class Filme {

    private String nomeFilme;
    private int duracaoFilme;
    private double arrecadacaoCinemas;


    public void imprimeInfo(){
        System.out.println("O nome do filme é : "+ this.nomeFilme);
        System.out.println("A duracao do filme em minutos é : "+ this.duracaoFilme);
        System.out.println("A arrecadacao do filme em milhões USD é : "+ this.arrecadacaoCinemas);
    }


    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public void setDuracaoFilme(int duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }

    public void setArrecadacaoCinemas(double arrecadacaoCinemas) {
        this.arrecadacaoCinemas = arrecadacaoCinemas;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public int getDuracaoFilme() {
        return duracaoFilme;
    }

    public double getArrecadacaoCinemas() {
        return arrecadacaoCinemas;
    }

}
