package br.com.cursojava.b04this;

public class Personagem {

    public String nomeDoPersonagem;
    public int idadeDoPersonagem;

    public void InfoImprime() {
        // In Java, this keyword is used to refer to the current object inside a method or a constructor.
        System.out.println("O nome do personagem é => " + this.nomeDoPersonagem);
        System.out.println("A idade do personagem é => " + this.idadeDoPersonagem);

        // Como o 'this' se refere ao objeto atual, então
        // não é mais necessário passar nenhuma variável de referência como parâmetro do método

    }

}
