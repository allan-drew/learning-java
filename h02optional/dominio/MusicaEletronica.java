package br.com.cursojava.h02optional.dominio;

public class MusicaEletronica {

    private Integer id;
    private String nomeDaMusica;
    private double duracaoDaMusica;

    public MusicaEletronica(Integer id, String nomeDaMusica, double duracaoDaMusica) {
        this.id = id;
        this.nomeDaMusica = nomeDaMusica;
        this.duracaoDaMusica = duracaoDaMusica;
    }

    @Override
    public String toString() {
        return "\n" +
                "MusicaEletronica {" + "\n" +
                "   id =  " + id + "\n" +
                "   nomeDaMusica =  " + nomeDaMusica + "\n" +
                "   duracaoDaMusica =   " + duracaoDaMusica + " segundos" + "\n" +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getNomeDaMusica() {
        return nomeDaMusica;
    }

    public double getDuracaoDaMusica() {
        return duracaoDaMusica;
    }

    public void setNomeDaMusica(String nomeDaMusica) {
        this.nomeDaMusica = nomeDaMusica;
    }

    public void setDuracaoDaMusica(double duracaoDaMusica) {
        this.duracaoDaMusica = duracaoDaMusica;
    }

    // sem setter para id!

}
