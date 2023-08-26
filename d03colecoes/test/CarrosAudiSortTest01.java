package br.com.cursojava.d03colecoes.test;

import br.com.cursojava.d03colecoes.dominio.CarrosAudi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// -----------------------------
// Comparator usado para ordenarmos não mais pelo preco (comportamento padrão definido na classe CarrosAudi), e sim pelo chassi!

// Para o uso do Comparator, precisamos de um objeto que passa no teste -> é um Comparator
class CarrosAudiByChassiComparator implements Comparator<CarrosAudi> {

    @Override
    public int compare(CarrosAudi o1, CarrosAudi o2) {
        // se quisermos ordenar pelo chassi:
        return o1.getChassi().compareTo(o2.getChassi());
    }
}
// -----------------------------



public class CarrosAudiSortTest01 {

    public static void main(String[] args) {

        List<CarrosAudi> carrosAudi = new ArrayList<>();

        carrosAudi.add(new CarrosAudi("RS6", "Avant", "0AC QWAS43 SA 543970", 1_160_000.00));
        carrosAudi.add(new CarrosAudi("A5", "Sportback", "3DR DSGU22 CD 439532", 356_990.00));
        carrosAudi.add(new CarrosAudi("A3", "Sedan", "1DE KGJF23 AQ 239345", 275_990.00));
        carrosAudi.add(new CarrosAudi("Q5", "Sportback TFSI e", "2DD SAWF43 EW 098418", 477_990.00));
        carrosAudi.add(new CarrosAudi("A3", "Sportback", "4SD LKJH43 OI 432085", 269_990.00));
        carrosAudi.add(new CarrosAudi("Q5", "TFSI e", "9ZD PQWO43 OO 129852", 469_990.00));

        for (CarrosAudi carroAudi : carrosAudi) {
            System.out.println(carroAudi);
        }


        System.out.println("-----------------");

        Collections.sort(carrosAudi); // ordenando pelo preco! Pois foi a implementação do compareTo() realizada!

        for (CarrosAudi carroAudi : carrosAudi) {
            System.out.println(carroAudi);
        }

        System.out.println("-----------------");

        // Caso o compareTo() esteja executando no sistema ordenando pelo preço,
        // e precisamos ordenar pelo chassi, e não mais pelo preço em alguma outra parte do sistema,
        // então podemos usar a interface Comparator...

        // Para o uso do Comparator, precisamos de um objeto que passa no teste -> é um Comparator
        Collections.sort(carrosAudi, new CarrosAudiByChassiComparator());

        for (CarrosAudi carroAudi : carrosAudi) {
            System.out.println(carroAudi);
        }

    }

}
