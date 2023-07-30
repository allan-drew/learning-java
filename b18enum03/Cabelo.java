package br.com.cursojava.b18enum03;

public class Cabelo {

    private String corDoCabelo;

    private TamanhoCabelo tamanhoCabelo;


    public Cabelo(String corDoCabelo, TamanhoCabelo tamanhoCabelo) {
        this.corDoCabelo = corDoCabelo;
        this.tamanhoCabelo = tamanhoCabelo;
    }


    @Override
    public String toString() {
        return "Cabelo {" +
                "corDoCabelo='" + corDoCabelo + '\'' +
                ", tamanhoCabelo=" + tamanhoCabelo +
                ", tamanhoCabeloInt=" + tamanhoCabelo.getValor() +
                ", tamanhoCabeloString=" + tamanhoCabelo.getNomeNoRelatorio() +
                '}';
    }

}
