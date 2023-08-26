package br.com.cursojava.d03colecoes.dominio;

// ** as interfaces básicas para ordenação são Comparable e Comparator ** //

import java.util.Objects;

// Para fazer o sort dos carros precisamos dizer para o Java de que maneira queremos ordenar...
// No caso de ListSortTest01, a String do java já está implementando a interface Comparable...
// Ao implementar o método compareTo, indicamos como será feito o sort dos objetos dentro das coleções

// Precisamos primeiro implementar o Comparable em CarrosAudi. E depois implementar o método compareTo().

// -------------------------


public class CarrosAudi implements Comparable<CarrosAudi> {

    private String modelo;
    private String versao;
    private String chassi;
    private double preco;

    public CarrosAudi(String modelo, String versao, String chassi, double preco) {
        this.modelo = modelo;
        this.versao = versao;
        this.chassi = chassi;
        this.preco = preco;
    }

    // Implementando o compareTo() para ordenar pelo preco
    @Override
    public int compareTo(CarrosAudi o) {
        // o --> outro carro audi
            // retorna negativo se this < o
            // retorna 0 se this == o
            // retorna positivo se this > o
//        if(this.preco < o.getPreco()) {
//            return -1;
//        } else if (this.preco == o.getPreco()) {
//            return 0;
//        } else {
//            return 1;
//        }

        // Podemos usar também o compareTo() de um wrapper...
        // Podemos usar o compareTo() já implementado (wrappers possuem métodos) ...
        // Para o caso de tipos primitivos, como o double preco, precisamos fazer o wrap
        return Double.valueOf(preco).compareTo(o.getPreco());
    }

    // equals usando chassi
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarrosAudi that = (CarrosAudi) o;
        return chassi.equals(that.chassi);
    }


    // hashCode usando chassi
    @Override
    public int hashCode() {
        return Objects.hash(chassi);
    }

    @Override
    public String toString() {
        return "CarrosAudi{" +
                "modelo='" + modelo + '\'' +
                ", versao='" + versao + '\'' +
                ", chassi='" + chassi + '\'' +
                ", preco=" + preco +
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
