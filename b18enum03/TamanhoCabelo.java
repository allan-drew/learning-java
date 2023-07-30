package br.com.cursojava.b18enum03;

public enum TamanhoCabelo {

    /* Quando passamos valores na enum, estamos passando valores para o construtor!
    Então, é necessário criarmos um construtor. */

    // enum constants calling the enum constructors
    PEQUENO(1, "Cabelo pequeno"),
    MEDIO(2, "Cabelo médio"),
    GRANDE(3, "Cabelo grande");

    private int valor;
    private String nomeNoRelatorio;

    // enum constructor
    TamanhoCabelo(int valor, String nomeNoRelatorio) {
        this.valor = valor;
        this.nomeNoRelatorio = nomeNoRelatorio;
    }

    // Já quando não há valores na enum, o Java cria um construtor padrão, já que a enumeracao é um tipo especial de classe.

    public int getValor() {
        return valor;
    }

    public String getNomeNoRelatorio() {
        return nomeNoRelatorio;
    }

}
