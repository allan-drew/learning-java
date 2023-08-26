package br.com.cursojava.d07map.test;

import br.com.cursojava.d06colecoes.dominio.CarrosHonda;
import br.com.cursojava.d07map.dominio.Consumidor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest02 {

    public static void main(String[] args) {

        // ---------------
        // Para o caso de quando um consumidor pode comprar vários carros
        // o Consumidor pode ter vários CarrosHonda associados.

        Consumidor consumidor1 = new Consumidor("Cristiano Ronaldo");
        Consumidor consumidor2 = new Consumidor("Messi");

        CarrosHonda carro1 = new CarrosHonda(4L, "Fit", 45_000.00);
        CarrosHonda carro2 = new CarrosHonda(2L, "City", 117_000.00);
        CarrosHonda carro3 = new CarrosHonda(1L, "Civic Hibrido", 244_900.00);
        CarrosHonda carro4 = new CarrosHonda(9L, "Civic Type R", 429_900.00);
        CarrosHonda carro5 = new CarrosHonda(13L, "HRV", 148_900.00);

        // Como Consumidor pode ter vários CarrosHonda associados, precisamos de:
        // Map < , List<> >
        List<CarrosHonda> carrosConsumidor1List = List.of(carro1, carro5);
        List<CarrosHonda> carrosConsumidor2List = List.of(carro2, carro3, carro4);

        // Map < , List<> >
        Map<Consumidor, List<CarrosHonda>> consumidorCarrosHondaMap = new HashMap<>();

        consumidorCarrosHondaMap.put(consumidor1, carrosConsumidor1List); // consumidor1 comprou carro1 e carro5
        consumidorCarrosHondaMap.put(consumidor2, carrosConsumidor2List); // consumidor1 comprou carro2, carro3 e carro4

        for (Map.Entry<Consumidor, List<CarrosHonda>> entry : consumidorCarrosHondaMap.entrySet()) {
            System.out.println(entry.getKey());

            for (CarrosHonda carrosHonda : entry.getValue()) {
                System.out.println("     " + carrosHonda);
            }

        }




    }


}
