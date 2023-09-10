package br.com.cursojava.i02streamscollectors.dominio;

import java.util.Objects;

public class Clientes {

    private String nome;
    private Double renda;

    public Clientes(String nome, Double renda) {
        this.nome = nome;
        this.renda = renda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clientes clientes = (Clientes) o;
        return Objects.equals(nome, clientes.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "\n" +
                "Clientes {" + "\n" +
                "   nome='" + nome + "\n" +
                "   renda=" + renda + "\n" +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Double getRenda() {
        return renda;
    }

}

