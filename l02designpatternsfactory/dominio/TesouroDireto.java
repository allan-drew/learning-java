package br.com.cursojava.l02designpatternsfactory.dominio;

/*
Para implementar o padrão Factory em Java, você precisa definir:
    - uma interface ou uma classe abstrata que representa o produto
    - uma classe concreta que implementa ou estende o produto
    - uma classe fábrica que cria e retorna instâncias do produto.
 */


public interface TesouroDireto {

    void aplicar();
    void resgatar();

    String getTaxa();

}


class Selic2026 implements TesouroDireto {

    @Override
    public void aplicar() {
        System.out.println("Aplicando no tesouro Selic 2026...");
    }

    @Override
    public void resgatar() {
        System.out.println("Resgatando investimentos do tesouro Selic 2026...");
    }

    @Override
    public String getTaxa() {
        return "SELIC+0,044% (a.a.)";
    }
}


class Prefixado2029 implements TesouroDireto {

    @Override
    public void aplicar() {
        System.out.println("Aplicando no tesouro Prefixado 2029...");
    }

    @Override
    public void resgatar() {
        System.out.println("Resgatando investimentos do tesouro Prefixado 2029...");
    }

    @Override
    public String getTaxa() {
        return "11,04% (a.a.)";
    }

}


class IpcaMais2035 implements TesouroDireto {

    @Override
    public void aplicar() {
        System.out.println("Aplicando no tesouro IPCA+ 2035...");
    }

    @Override
    public void resgatar() {
        System.out.println("Resgatando investimentos do tesouro IPCA+ 2035...");
    }

    @Override
    public String getTaxa() {
        return "IPCA+5,43% (a.a.)";
    }

}


