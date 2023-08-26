package br.com.cursojava.d08queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {

    public static void main(String[] args) {

        // queue por padrão: FIFO
        Queue<String> fila = new PriorityQueue<>();

        fila.add("Romário");
        fila.add("Bebeto");
        fila.add("Taffarel");
        fila.add("Dunga");
        fila.add("Zinho");

        // Apenas imprimindo! Não reflete a forma definida no Comparable ou Comparator
        for (String s: fila) {
            System.out.println(s);
        }

        System.out.println("-------------");

        // Para aproveitar da melhor maneira o funcionamento da PriorityQueue, usar os métodos disponíveis:
        System.out.println(fila.peek()); // peek --> Retrieves, but DOES NOT remove, the head of this queue, or returns null if this queue is empty.

        // como a FIFO é first in first out, temos a remoção do primeiro elemento que foi definido de acordo com as regras do Comparable ou Comparator...
        // Como está sendo usado a String, logo, será removido o primeiro elemento na ordem alfabética
        System.out.println(fila.poll()); // poll --> Retrieves and removes the head of this queue, or returns null if this queue is empty.

        System.out.println("-------------");

        // Apenas imprimindo! Não reflete a forma definida no Comparable ou Comparator
        for (String s: fila) {
            System.out.println(s);
        }



    }

}
