package br.com.cursojava.d00colecoes;

// Hierarchy of Collection:
    // https://www.javatpoint.com/collections-in-java

import java.util.ArrayList;
import java.util.List;


public class ListTest01 {

    public static void main(String[] args) {

        // Até JAVA 1.4
        List timesBrasileirao = new ArrayList(20); // List => An ordered collection (also known as a sequence)
        timesBrasileirao.add("Flamengo");
        timesBrasileirao.add("Fluminense");
        timesBrasileirao.add(439545); // bad!

        for (Object time: timesBrasileirao) {
            System.out.println(time);
        }

        System.out.println("=======================================");

        // Após java 1.4 conseguimos com o < > forçar em tempo de compilação a lista a ser do tipo String
        List<String> timesBundesLiga = new ArrayList<>();
            // a convenção é usar o tipo mais genérico na esquerda (a interface List)
            // e no lado direito o tipo mais específico (a classe/objeto ArrayList)

        timesBundesLiga.add("Bayern de Munique");
        timesBundesLiga.add("Borussia Dortmund");
        // timesBundesLiga.add(024323); // Required type: String

        // usando foreach
        for (String time : timesBundesLiga) {
            System.out.println(time);
        }

        System.out.println("---------------------");

        timesBundesLiga.add("Leipzig");

        // usando for
        for (int i = 0; i < timesBundesLiga.size(); i++) {
            System.out.println(timesBundesLiga.get(i));
        }

        System.out.println("---------------------");

        //
        System.out.println(timesBundesLiga);

        //
        timesBundesLiga.remove("Bayern de Munique"); // removendo pelo objeto
        System.out.println(timesBundesLiga);

        timesBundesLiga.remove(0); // removendo pelo index
        System.out.println(timesBundesLiga);


        System.out.println("=======================================");

        // Para criar coleções precisamos usar os wrappers, e não os tipos primitivos:

        // List<int> idades = new ArrayList<>(); // Type argument cannot be of primitive type
        List<Integer> idades = new ArrayList<>();
        idades.add(30);
        idades.add(18);
        idades.add(10);
        idades.add(56);
        idades.add(22);

        System.out.println(idades);

        idades.remove(0);
        System.out.println(idades);

        idades.remove(2);
        System.out.println(idades);

        System.out.println("=======================================");

        // podemos adicionar todos os elementos de uma List em outra List
        List<String> laLigaEspanha = new ArrayList<>();
        List<String> segundaDivisaoEspanhola = new ArrayList<>();

        laLigaEspanha.add("Real Madrid");
        laLigaEspanha.add("Barcelona");

        segundaDivisaoEspanhola.add("Zaragoza");
        segundaDivisaoEspanhola.add("Levante");
        segundaDivisaoEspanhola.add("Espanyol");

        System.out.println("La Liga antes:  " + laLigaEspanha);
        System.out.println("Segunda divisao:  " + segundaDivisaoEspanhola);

        laLigaEspanha.addAll(segundaDivisaoEspanhola);
        System.out.println("Liga Liga depois:  " + laLigaEspanha);


    }


}
