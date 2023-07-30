package br.com.cursojava.b18enum;

public class Carro {

    private String nomeDoCarro;

    // TipoCarro é uma enumeração definida no arquivo TipoCarro.java
    private TipoCarro tipoCarro; // criando uma relação do tipo "o Carro TEM um TipoCarro"


    public Carro(String nomeDoCarro, TipoCarro tipoCarro){
        this.nomeDoCarro = nomeDoCarro;
        this.tipoCarro = tipoCarro;
    }


    // Fazendo o override do método toString
    /* A classe Object é a principal e mais básica classe do Java.
     Todas as outras a tem como origem, e, portanto, herdam seus métodos...
     toString(), equals() e hashCode() são alguns dos métodos que podemos fazer o override da classe Object */
    @Override
    public String toString() {
        return "Carro{" +
                "nomeDoCarro='" + nomeDoCarro + '\'' +
                ", tipoCarro=" + tipoCarro +
                '}';
    }

        // O método toString() retorna um texto conciso e
        // informativo que representa os objetos da sua classe.

}
