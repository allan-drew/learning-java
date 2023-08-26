package br.com.cursojava.d06colecoes.test;

import br.com.cursojava.d06colecoes.dominio.CarrosHonda;

import java.util.HashSet;
import java.util.Set;

public class SetTestCarrosHondaTest01 {

    public static void main(String[] args) {

        // O HashSet não mantém a ordem de inserção.
        Set<CarrosHonda> carrosHonda = new HashSet<>();

        carrosHonda.add(new CarrosHonda(4L, "Fit", 45_000.00));
        carrosHonda.add(new CarrosHonda(2L, "City", 117_000.00));
        carrosHonda.add(new CarrosHonda(1L, "Civic Hibrido", 244_900.00));
        carrosHonda.add(new CarrosHonda(9L, "Civic Type R", 429_900.00));
        carrosHonda.add(new CarrosHonda(13L, "HRV", 148_900.00));
        carrosHonda.add(new CarrosHonda(13L, "HRV", 148_900.00)); // Duplicate Set element
        carrosHonda.add(new CarrosHonda(13L, "HRV", 148_900.00)); // Duplicate Set element
        carrosHonda.add(new CarrosHonda(13L, "HRV", 148_900.00)); // Duplicate Set element

        // Ao imprimir, não se observa os elementos duplicados!
        for (CarrosHonda carro: carrosHonda) {
            System.out.println(carro);
        }
        // Atenção, cuidado: se retirarmos as implementações de equals() e hashCode() na classe CarrosHonda, então os elementos duplicados irão aparecer!



    }

}
