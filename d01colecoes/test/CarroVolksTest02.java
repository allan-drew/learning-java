package br.com.cursojava.d01colecoes.test;

import br.com.cursojava.d01colecoes.dominio.CarroVolks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarroVolksTest02 {

    public static void main(String[] args) {

        CarroVolks carro1 = new CarroVolks("Polo", "GTS", "9BW ZZZ377 VT 004251");
        CarroVolks carro2 = new CarroVolks("Golf", "GTi", "1BS ZAZA27 BT 103211");
        CarroVolks carro3 = new CarroVolks("Virtus", "TSI", "2ZI ASZA03 WQ 943230");

        List<CarroVolks> carros = new ArrayList<>(6);
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);

        for (CarroVolks carroVolks: carros) {
            System.out.println("    " + carroVolks.toString());
        }

        // carros.clear();

        // copiando os valores do virtus do carro3 para carro4
        CarroVolks carro4 = new CarroVolks("Virtus", "TSI", "2ZI ASZA03 WQ 943230");
        System.out.println(carros.contains(carro4)); // testando se já contém na lista --> true

        // trocando o número do chassi
        CarroVolks carro5 = new CarroVolks("Virtus", "TSI", "3ER KDOS45 BV 322409");
        System.out.println(carros.contains(carro5)); // testando se já contém na lista --> false


        int indexCar4 = carros.indexOf(carro4);
        System.out.println(indexCar4); // index 2, pois encontrou na posição 2 da lista
        System.out.println(carros.get(indexCar4));

        int indexCar5 = carros.indexOf(carro5);
        System.out.println(indexCar5); // index -1, pois NÃO encontrou na lista
        // System.out.println(carros.get(indexCar5));


        // Collections.sort(carros); // ero de compilação, pois na classe CarroVolks não sabemos por qual atributo fazer o sort (modelo, versao ou chassi)
        // Para ver como isso é resolvido, ver d03colecoes.


    }

}
