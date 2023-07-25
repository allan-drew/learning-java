package br.com.cursojava.b08construtores;

public class CanalYoutube {

    private String nomeDoCanal;
    private int anoDeCriacao;

    private int numInscritos;

    // CONSTRUTOR
    // O Java compila um construtor padrão caso não exista construtor na classe.
    // O construtor não tem retorno, por isso não tem por exemplo void, int, etc...
    public CanalYoutube(String nomeDoCanal, int anoDeCriacao) {
        this.nomeDoCanal = nomeDoCanal;
        this.anoDeCriacao = anoDeCriacao;
            // Ao colocar o nome do canal e ano de criacao no construtor, teremos que
            // obrigatoriamente passar um nome e o ano para o canal ao criá-lo no main
    }


    // Se quisermos ter diferentes formas de inicializar um objeto usando diferentes parâmetros,
    // então devemos fazer sobrecarga de construtores.
    public CanalYoutube (String nomeDoCanal, int anoDeCriacao, int numInscritos) {
        this(nomeDoCanal, anoDeCriacao); // podemos chamar outros construtores usando o this
        this.numInscritos = numInscritos;
    }


    // Caso queira manter a habilidade de criar objetos sem passar parametros para o construtor
    // basta colocar um outro construtor, porém sem parametros
    public CanalYoutube() { }


    // ATENCAO:
    // Geralmente quando adiciona via construtor e não quer deixar os atributos serem alterados,
    // você só cria o get e um construtor aceitando os parâmetros (sem os setters)
    // Porém, neste exemplo, estamos deixando os atributos serem alterados com os setters
    public void setNomeDoCanal(String nomeDoCanal) {
        this.nomeDoCanal = nomeDoCanal;
    }
    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }
    public void setNumInscritos(int numInscritos) {
        this.numInscritos = numInscritos;
    }

    public String getNomeDoCanal() {
        return nomeDoCanal;
    }
    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }
    public int getNumInscritos() {
        return numInscritos;
    }

}

