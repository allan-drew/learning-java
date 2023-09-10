package br.com.cursojava.j01threads;

// O objetivo das threads é trabalhar de forma paralela!
// Threads são unidades independentes de execução que permitem que um programa execute tarefas concorrentes.

public class ThreadTest02 {

    public static void main(String[] args) {

        // usando as threads para executar de forma assincrona os contadores implementados no run()
        new Thread(t1).start();
        new Thread(t2).start();

    }

    // interface funcional Runnable implementando usando classe anônima
    private static Runnable t1 = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 1 => " + i);
            }
        }
    };

    private static Runnable t2 = new Runnable() {
        @Override
        public void run() {
            for (int j = 0; j < 10; j++) {
                System.out.println("Thread 2 => " + j);
            }
        }
    };





}
