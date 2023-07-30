package br.com.cursojava.b18enum;

public class CarroTest {

    public static void main(String[] args) {

        Carro carro1 = new Carro("HB20", TipoCarro.HATCH);

        // Carro carro2 = new Carro("Gol", "sedan"); // java: incompatible types
        // Carro carro2 = new Carro("Porsche 911", "esportivo"); // java: incompatible types
        // Carro carro2 = new Carro("UP", "hatch"); // java: incompatible types
        Carro carro2 = new Carro("Gol", TipoCarro.HATCH);

        Carro carro3 = new Carro("Virtus", TipoCarro.SEDAN);

        Carro carro4 = new Carro("HRV", TipoCarro.SUV);


        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println(carro4);


    }

}
