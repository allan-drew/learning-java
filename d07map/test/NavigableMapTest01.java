package br.com.cursojava.d07map.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {

    public static void main(String[] args) {

        // Funciona semelhante ao NavigableSet
        // mas no caso do NavigableMap, estamos trabalhando com chave, valor...

        // -----------------------------
        // No caso do NavigableSet, a classe precisa ter um Comparable ou passarmos um Comparator...
        // Já para o caso do NavigableMap é necessário que a chave tenha Comparable ou Comparator
        // -----------------------------
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("CR7", "Real Madrid");
        map.put("Neymar", "Al Hilal");
        map.put("Ronaldo", "Real Madrid");
        map.put("Mbappe", "PSG");
        map.put("Haaland", "Man City");
        map.put("Vini Jr", "Real Madrid");

        // resultado ordenado pela chave.
        // como é String, foi ordenado pela ordem alfabética!
        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }

        System.out.println(" --------------- ");

        // outros métodos:
        System.out.println(map.headMap("Neymar")); // Returns a view of the portion of this map whose keys are strictly less than toKey.

        System.out.println(map.ceilingKey("Neymar")); // Returns the least key greater than or equal to the given key, or null if there is no such key.
        System.out.println(map.floorKey("Neymar")); // Returns the greatest key less than or equal to the given key, or null if there is no such key.

        System.out.println(map.lowerKey("Neymar")); // Returns the greatest key strictly less than the given key, or null if there is no such key.
        System.out.println(map.higherKey("Neymar")); // Returns the least key strictly greater than the given key, or null if there is no such key.



    }

}

