package br.com.cursojava.b18enum02;

public class Camisa {

    // A enum também pode ficar dentro da classe
    public enum TipoGola {
        GOLA_V,
        GOLA_NORMAL
    }

    private CorCamisa corCamisa; //relacionamento: Camisa tem uma cor de camisa

    private TipoGola tipoGola; //relacionamento: Camisa tem um tipo de gola

    //construtor
    public Camisa(CorCamisa corCamisa, TipoGola tipoGola) {
        this.corCamisa = corCamisa;
        this.tipoGola = tipoGola;
    }

    //toString
    @Override
    public String toString() {
        return "Camisa{" +
                "corCamisa=" + corCamisa +
                ", tipoGola=" + tipoGola +
                '}';
    }


}
