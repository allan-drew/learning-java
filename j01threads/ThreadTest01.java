package br.com.cursojava.j01threads;

// Threads
// Em Java, threads são unidades independentes de execução que permitem que um programa execute tarefas concorrentes.
// Uma thread é basicamente um fluxo de execução dentro de um programa Java,
// e você pode pensar nelas como pequenos programas dentro de um programa maior, todos executando simultaneamente.

// A linguagem Java fornece suporte embutido para programação concorrente por meio da API de threads.
// Você pode criar threads em Java de várias maneiras, mas a maneira mais comum de criar threads é estender a classe Thread ou implementar a interface Runnable.
//---------------------------------------------
class MyFirstThread extends Thread {
    private final char c;

    public MyFirstThread(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        // super.run();
        for (int i = 0; i < 150; i++) {
            System.out.print(c + " ");
            if (i % 15 == 0) {
                System.out.println(" -- ");
            }
        }
    }

}
//------
class MyRunnableThread implements Runnable {

    private final char c;

    public MyRunnableThread(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        // super.run();
        for (int i = 0; i < 500; i++) {

            System.out.print(c + " ");

            if (i % 100 == 0) {
                System.out.println(" -- ");
            }
        }

    }
}



// --------------
public class ThreadTest01 {

    public static void main(String[] args) {

//        MyFirstThread t1 = new MyFirstThread('A');
//        MyFirstThread t2 = new MyFirstThread('B');
//        MyFirstThread t3 = new MyFirstThread('C');
//        MyFirstThread t4 = new MyFirstThread('D');
//        MyFirstThread t5 = new MyFirstThread('E');
//        t1.run();
//        t2.run();
//        t3.run();
//        t4.run();
//        t5.run();
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();

        System.out.println("====================================================================================================================");

        Thread t01 = new Thread(new MyRunnableThread('a'), "T01-a");
        Thread t02 = new Thread(new MyRunnableThread('b'), "T02-b");
        Thread t03 = new Thread(new MyRunnableThread('c'), "T03-c");
        Thread t04 = new Thread(new MyRunnableThread('d'), "T04-d");
        Thread t05 = new Thread(new MyRunnableThread('e'), "T05-e");
        t01.start();
        t02.start();
        t03.start();
        t04.start();
        t05.start();


    }

}
