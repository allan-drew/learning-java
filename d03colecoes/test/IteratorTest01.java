package br.com.cursojava.d03colecoes.test;

import br.com.cursojava.d03colecoes.dominio.CarrosAudi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {

    public static void main(String[] args) {

        List<CarrosAudi> carrosAudi = new ArrayList<>();

        carrosAudi.add(new CarrosAudi("RS6", "Avant", "0AC QWAS43 SA 543970", 1_160_000.00));
        carrosAudi.add(new CarrosAudi("A5", "Sportback", "3DR DSGU22 CD 439532", 356_990.00));
        carrosAudi.add(new CarrosAudi("A3", "Sedan", "1DE KGJF23 AQ 239345", 275_990.00));
        carrosAudi.add(new CarrosAudi("Q5", "Sportback TFSI e", "2DD SAWF43 EW 098418", 477_990.00));
        carrosAudi.add(new CarrosAudi("A3", "Sportback", "4SD LKJH43 OI 432085", 269_990.00));
        carrosAudi.add(new CarrosAudi("Q5", "TFSI e", "9ZD PQWO43 OO 129852", 469_990.00));


        // ------------------------------------------------------------------------
        // removendo os carros com preco acima de 1_000_000

        // Uma ConcurrentModificationException é uma exceção que ocorre em Java quando uma coleção é modificada durante a iteração.
        // Podemos ter, portanto, uma exceção ao tentarmos remover algo da coleção usando apenas foreach...
        // Nesse sentido, Iterators são uma maneira segura de iterar sobre coleções, pois não permitem que o código modifique a coleção enquanto ela está sendo iterada.

        // UTILIZANDO ITERATOR!
            // Um Iterator em Java é uma interface que permite iterar (ou seja, percorrer) os elementos de uma coleção.
        Iterator<CarrosAudi> carrosAudiIterator = carrosAudi.iterator();

        while (carrosAudiIterator.hasNext()) {
            CarrosAudi carro = carrosAudiIterator.next();

            if (carro.getPreco() > 1_000_000) {
                carrosAudiIterator.remove();
            }
        }

        // printando com for:
//        for (CarrosAudi carroAudi : carrosAudi) {
//            System.out.println(carroAudi);
//        }

        // printando com iterator:
        Iterator<CarrosAudi> carrosAudiIterator2 = carrosAudi.iterator();

        while (carrosAudiIterator2.hasNext()) {
            CarrosAudi elemento = carrosAudiIterator2.next();
            System.out.println(elemento);
        }

        // ------------------------------------------------------------------------


        System.out.println("=================================================================");


        // ------------------------------------------------------------------------
        // removendo os carros com preco abaixo de 300_000
        // Utilizando programação funcional!
        carrosAudi.removeIf(carro -> carro.getPreco() < 300_000);

        // printando com for:
        for (CarrosAudi carroAudi : carrosAudi) {
            System.out.println(carroAudi);
        }
        // ------------------------------------------------------------------------



    }

}
