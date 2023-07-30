package br.com.cursojava.b15heranca03;

public class JogadorDeFutebol extends Atleta {

    private String posicao;


    // Ao adicionar um construtor na super classe e esse construtor tiver argumentos
    // então, é necessário alterar nas subclasses...

    // O construtor na subclasse também precisa ter argumentos :
    public JogadorDeFutebol(String nome, int idade) {
        super(nome, idade); // o super chamará nome e idade da superclasse
    }

}
