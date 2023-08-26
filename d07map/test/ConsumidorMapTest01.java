package br.com.cursojava.d07map.test;

import br.com.cursojava.d06colecoes.dominio.CarrosHonda;
import br.com.cursojava.d07map.dominio.Consumidor;

import java.util.HashMap;
import java.util.Map;

public class ConsumidorMapTest01 {

    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Cristiano Ronaldo");
        Consumidor consumidor2 = new Consumidor("Messi");

        // criando map para guardar o consumidor e também o carro honda que o consumidor comprou:
        CarrosHonda carro1 = new CarrosHonda(4L, "Fit", 45_000.00);
        CarrosHonda carro2 = new CarrosHonda(2L, "City", 117_000.00);
        CarrosHonda carro3 = new CarrosHonda(1L, "Civic Hibrido", 244_900.00);
        CarrosHonda carro4 = new CarrosHonda(9L, "Civic Type R", 429_900.00);
        CarrosHonda carro5 = new CarrosHonda(13L, "HRV", 148_900.00);

        // consumidor será chave e carro honda será valor:
        Map<Consumidor, CarrosHonda> consumidorCarrosHondaMap = new HashMap<>();
        consumidorCarrosHondaMap.put(consumidor1, carro1); // consumidor1 comprou carro1
        consumidorCarrosHondaMap.put(consumidor2, carro4); // consumidor2 comprou carro4

        for (Map.Entry<Consumidor, CarrosHonda> entry : consumidorCarrosHondaMap.entrySet()) {
            System.out.println(entry.getKey() + " ===================> " + entry.getValue());
        }

    }

}
