package br.com.cursojava.d01colecoes.test;

import br.com.cursojava.d01colecoes.dominio.CarroVolks;

public class CarroVolksTest01 {

    public static void main(String[] args) {

        CarroVolks carro1 = new CarroVolks("Polo", "GTS", "9BW ZZZ377 VT 004251");
        CarroVolks carro2 = new CarroVolks("Polo", "GTS", "9BW ZZZ377 VT 004251");

        // --------------------------------------------
        // *************** sem a sobrescrita de equals implementada *************** (comentar equals em CarroVolks.java para ver a diferença)

        // System.out.println(carro1.equals(carro2)); // false, pois carro1 faz referencia para um objeto e carro2 faz referencia para outro

        // é true quando as variáveis de referencia fazem referencia para o mesmo objeto
        // CarroVolks carro3 = carro1;
        // System.out.println(carro1.equals(carro3));
        // --------------------------------------------


        // --------------------------------------------
        // Para compararmos dois objetos do tipo CarroVolks precisamos levar em consideração o chassi (ver a sobrescrita do método equals em CarroVolks.java)
        // *************** com a sobrescrita de equals implementada ***************

        System.out.println(carro1.equals(carro2)); // true, pois os chassis são iguais, mesmo que sejam objetos diferentes na memória.

        // ATENÇÃO!!!!!!!!!!!!! Cuidado, pois esse código só leva em conta o número do chassi.
        // se tivermos um Golf GTI com o mesmo número de chassi do Polo, o resultado será true
        CarroVolks carro3 = new CarroVolks("Golf", "GTI", "9BW ZZZ377 VT 004251");
        System.out.println(carro2.equals(carro3));
        // --------------------------------------------



    }

}
