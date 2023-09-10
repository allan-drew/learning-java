package br.com.cursojava.j02sincronismothreads.test;

import br.com.cursojava.j02sincronismothreads.dominio.ContaCorrente;

public class ContaCorrenteTest01 implements Runnable {

    private ContaCorrente contaCorrente = new ContaCorrente(); // conta corrente 1

    // ----------------------------------------------------------------------
    public static void main(String[] args) {

        ContaCorrenteTest01 contaCorrenteTest01 = new ContaCorrenteTest01();
        Thread t1 = new Thread(contaCorrenteTest01, "Primeira Thread");
        Thread t2 = new Thread(contaCorrenteTest01, "Segunda Thread");

        // as duas threads estarão fazendo operações no mesmo objeto
        t1.start();
        t2.start();


    }
    // ----------------------------------------------------------------------


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10); // sacando de 10 em 10
            if (contaCorrente.getSaldo() < 0) {
                System.out.println("ERRO!!!!!!!!!!!!");
            }
        }
    }

    // Para resolver o problema do sincronismo, o método saque precisa ser executado de forma atômica!
    // A thread que começar a executar o método precisa terminar de executá-lo, sem que outra thread tente executar também.
    // Para tanto, colocamos a palavra synchronized
    private synchronized void saque(int valorDoSaque) {
        if (contaCorrente.getSaldo() >= valorDoSaque) {
            System.out.println(Thread.currentThread().getName() + " está indo sacar da conta corrente!");

            try {
                Thread.sleep(2000); // mesmo quando colocamos a thread que entrou no bloco de código para dormir por 2 segundos,
                                        // a outra thread não entrará no bloco enquanto a que entrou terminar de executar
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            contaCorrente.saque(valorDoSaque);
            System.out.println(Thread.currentThread().getName() + " completou o saque!");
            System.out.println("Valor atual da conta corrente = " + contaCorrente.getSaldo());
        } else {
            System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " sacar!!!! Valor atual da conta corrente = " + contaCorrente.getSaldo());
        }
    }
    // A ordem de execução pelas threads não é garantida! Entretanto, é garantido que a thread que começar a executar o método irá terminar!

    // A sincronização é uma técnica usada para controlar o acesso concorrente a recursos compartilhados, como variáveis ou objetos, em programas multithreaded.
    // Isso garante que apenas um thread por vez possa executar o bloco de código ou o método sincronizado,
    // evitando problemas de concorrência, como condições de corrida e resultados imprevisíveis.

    // Bloco Sincronizado:
//    public synchronized void metodoSincronizado() {
//        // Código que precisa ser executado de forma sincronizada
//    }

    // Método Sincronizado:
//    public synchronized void metodoSincronizado() {
//        // Código que precisa ser executado de forma sincronizada
//    }

}
