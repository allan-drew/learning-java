package br.com.cursojava.b15heranca03;

public class Atleta {

    protected String nome;
    protected int idade;

    // Ao adicionar um construtor na super classe e se esse construtor tiver argumentos,
    // então, é necessário alterar também nas subclasses
    public Atleta(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


}
