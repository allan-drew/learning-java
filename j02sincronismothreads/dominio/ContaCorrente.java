package br.com.cursojava.j02sincronismothreads.dominio;

public class ContaCorrente {

    private int saldo = 50;

    public void saque(int valorDoSaque) {
        this.saldo = this.saldo - valorDoSaque;
    }

    public int getSaldo() {
        return saldo;
    }


}
