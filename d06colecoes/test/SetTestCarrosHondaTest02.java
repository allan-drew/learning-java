package br.com.cursojava.d06colecoes.test;

import br.com.cursojava.d06colecoes.dominio.CarrosHonda;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTestCarrosHondaTest02 {

    public static void main(String[] args) {

        // Para manter a ordem de inserção --> LinkedHashSet
        Set<CarrosHonda> carrosHonda = new LinkedHashSet<>();

        carrosHonda.add(new CarrosHonda(4L, "Fit", 45_000.00));
        carrosHonda.add(new CarrosHonda(2L, "City", 117_000.00));
        carrosHonda.add(new CarrosHonda(1L, "Civic Hibrido", 244_900.00));
        carrosHonda.add(new CarrosHonda(9L, "Civic Type R", 429_900.00));
        carrosHonda.add(new CarrosHonda(13L, "HRV", 148_900.00));

        carrosHonda.add(new CarrosHonda(13L, "HRV", 148_900.00)); // Duplicate Set element
        carrosHonda.add(new CarrosHonda(13L, "HRV", 148_900.00)); // Duplicate Set element
        carrosHonda.add(new CarrosHonda(13L, "HRV", 148_900.00)); // Duplicate Set element

        carrosHonda.add(new CarrosHonda(19L, "HRV", 148_900.00)); // não é duplicado! IDs diferentes
        carrosHonda.add(new CarrosHonda(290L, "HRV", 148_900.00)); // não é duplicado! IDs diferentes

        // Ao imprimir, não se observa os elementos duplicados!
        for (CarrosHonda carro: carrosHonda) {
            System.out.println(carro);
        }


    }

}
