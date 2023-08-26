package br.com.cursojava.d01colecoes.dominio;

public class CarroVolks {

    private String modelo;
    private String versao;
    private String chassi;

    public CarroVolks(String modelo, String versao, String chassi) {
        this.modelo = modelo;
        this.versao = versao;
        this.chassi = chassi;
    }

    // Sobrescrita do método equals da classe Object
        // reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
        // simetrico: para x e y diferentes de null, se x.equals(y) == true, logo, y.equals(x) == true
        // transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true, logo, y.equals(z) == true
        // consistente: x.equals(x) sempre retorna true se x for diferente de null
        // x.equals(null) retorna false para x diferente de null.
    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false; // x.equals(null) retorna false para x diferente de null.

        if (this == obj) return true; // se os dois objetos forem iguais, retorna true

        if(this.getClass() != obj.getClass()) return false; // verificando se o objeto é um CarroVolks

        CarroVolks carroVolks = (CarroVolks) obj;

        // comparação se os objetos são iguais (o número de chassi será usado para essa comparação)
        // aqui, estamos usando o equals da String
        return chassi != null && chassi.equals(carroVolks.chassi);

    }


    // hashCode é um número gerado para os objetos, de preferência único.
        // se x.equals(y) == true, então y.hashCode() == x.hashCode()
        // se y.hashCode() == x.hashCode(), então não necessariamente o equals de y.hashCode() tem que ser true (se os hashcodes forem iguais não necessariamente o equals será true)
        // se x.equals(y) == false, os hashcodes serão diferentes
        // se y.hashcode() != x.hashCode(), então x.equals(y) deverá ser false
    @Override
    public int hashCode() {
        // usando o chassi para gerar o hashCode
        return chassi == null ? 0 : this.chassi.hashCode();
    }

    @Override
    public String toString() {
        return "CarroVolks{" +
                "modelo='" + modelo + '\'' +
                ", versao='" + versao + '\'' +
                ", chassi='" + chassi + '\'' +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
