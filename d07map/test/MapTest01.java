package br.com.cursojava.d07map.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {

    public static void main(String[] args) {

        // map ---> chave e valor
        Map<String, Double> map = new LinkedHashMap<>(); // ** se quisermos NÃO manter a ordem de inserção, poderíamos usar HashMap, em vez do LinkedHashMap

        // Adicionando no map
        map.put("Preço do Carro", 86_000.00);
        map.put("Seguro", 3_600.00);
        map.put("IPVA", 3_450.00);

        // se colocarmos a mesma chave, então sobrescreverá o valor
        map.put("IPVA", 3_339.90);

        // com o putIFAbsent, só adiciona caso não exista
        map.putIfAbsent("Seguro", 4_000.00); // como já existe, não adicionará!!

        map.putIfAbsent("Revisões até 60 mil km", 5_133.00); // como não existe, adicionará!


        System.out.println(map);

        // iterando:

        // pelas chaves
        for (String key: map.keySet()) {
            System.out.println(key + " -> " + map.get(key)); // map.get() returns the value to which the specified key is mapped...
        }

        System.out.println("------------");

        // pelos valores
        for (Double value: map.values()) {
            System.out.println(" values: " + value);
        }

        System.out.println("------------");

        // pelo Map. Entry
        // A map entry (key-value pair).
        for (Map.Entry<String, Double> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }

}
