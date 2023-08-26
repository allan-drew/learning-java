package br.com.cursojava.d06colecoes.dominio;

import java.util.Objects;

public class CarrosHonda {

    private Long Id;
    private String nome;
    private double preco;

    public CarrosHonda(Long id, String nome, double preco) {
        Id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarrosHonda that = (CarrosHonda) o;
        return Objects.equals(Id, that.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "CarrosHonda{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
