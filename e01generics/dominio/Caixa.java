package br.com.cursojava.e01generics.dominio;


// Em Java, classes genéricas (ou classes parametrizadas) permitem que você crie classes, interfaces e métodos que possam ser reutilizados
// com tipos específicos sem perder a segurança de tipos. I

// Você pode escrever código mais flexível e genérico que funciona com diferentes tipos de dados, mantendo a verificação de tipos em tempo de compilação.
// As classes genéricas são definidas usando parâmetros de tipo.
public class Caixa<T> {
        // classe usada em GenericsTest02

    private T conteudo;

    public void adicionar(T item) {
        this.conteudo = item;
    }

    public T obter() {
        return conteudo;
    }

}
