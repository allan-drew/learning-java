package br.com.cursojava.g02predicate.dominio;

import java.util.List;

public class Docente {

    private String nome;
    private int idade;
    private List<String> disciplinas;

    public Docente(String nome, int idade, List<String> disciplinas) {
        this.nome = nome;
        this.idade = idade;
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", disciplinas=" + disciplinas +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }
}
