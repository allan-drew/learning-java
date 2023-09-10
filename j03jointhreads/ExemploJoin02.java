package br.com.cursojava.j03jointhreads;

public class ExemploJoin02 {


    public static void main(String[] args) {

        System.out.println("=========== Exemplo com join nas duas threads ============================");

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Aguarda a thread1 terminar
            thread2.join(); // Aguarda a thread2 terminar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("thread1 e thread2 terminaram (com certeza)");

    }



}
