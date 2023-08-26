package br.com.cursojava.d02colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {

    public static void main(String[] args) {

        List<String> carrosFiat = new ArrayList<>();
        carrosFiat.add("Pulse Abarth");
        carrosFiat.add("Argo");
        carrosFiat.add("Mobi");
        carrosFiat.add("Fastback");
        carrosFiat.add("Cronos");
        carrosFiat.add("500");
        carrosFiat.add("Strada");
        carrosFiat.add("Fiorino");
        carrosFiat.add("Toro");

        // Collections (com s) --> polymorphic algorithms that operate on collections
        // sort() --> sort na ordem alfabetica, pois são String
        Collections.sort(carrosFiat);

        for (String carro: carrosFiat) {
            System.out.println(carro);
        }

    }

}
