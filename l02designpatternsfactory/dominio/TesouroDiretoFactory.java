package br.com.cursojava.l02designpatternsfactory.dominio;

/*
 O padrão de projeto Factory é um padrão de criação que permite encapsular a lógica de criação de objetos em uma classe separada,
 conhecida como "fábrica".

 A ideia por trás deste padrão é fornecer uma maneira mais flexível e extensível de criar objetos,
 sem a necessidade de expor diretamente a lógica de criação ao código cliente.
 */

public class TesouroDiretoFactory {

    private TesouroDiretoFactory() { } // construtor privado para não ser possível dar um new na classe Factory lá no Test,
    // pois a Factory será apenas utilitária para novos investimentos (não teremos instancias de Factory)


    // método novoInvestimento() que cria e retorna um investimento do tesouro de acordo com o tipo fornecido
    public static TesouroDireto novoInvestimento (TipoInvestimento tipoInvestimento) {

        TesouroDireto tesouroDireto = null;

        if (tipoInvestimento == TipoInvestimento.SELIC) {
            tesouroDireto = new Selic2026();
        } else if (tipoInvestimento == TipoInvestimento.PREFIXADO) {
            tesouroDireto = new Prefixado2029();
        } else if (tipoInvestimento == TipoInvestimento.IPCAMAIS) {
            tesouroDireto = new IpcaMais2035();
        } else {
            throw new IllegalArgumentException("investimento not found!");
        }

        return tesouroDireto;

    }

}
