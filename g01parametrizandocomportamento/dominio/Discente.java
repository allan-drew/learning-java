package br.com.cursojava.g01parametrizandocomportamento.dominio;

public class Discente {

    private String nome;
    private int idade;
    private String curso;

    public Discente(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "\n Discente {" + "\n" +
                "   nome=   " + nome + "\n" +
                "   idade=  " + idade + "\n" +
                "   curso=  " + curso + "\n" +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }

}


