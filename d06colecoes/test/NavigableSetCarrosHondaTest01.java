package br.com.cursojava.d06colecoes.test;

import br.com.cursojava.d06colecoes.dominio.CarrosHonda;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


// NavigableSet é uma interface em Java que representa um conjunto ordenado que pode ser navegado.
    // NavigableSet herda da interface SortedSet e adiciona métodos para navegar pelo conjunto.

// TreeSet é uma implementação da interface Set em Java
    // O TreeSet é usado quando a classe implementa Comparable ou quando criamos um Comparator
    // Quando inserirmos um novo elemento, o TreeSet reorganiza baseado no compareTo() para o caso do Comparable ou baseado no compare() baseado no Comparator.


//-----------------------------------------------------------------------------
// Como a classe CarrosHonda não está implementando Comparable, vamos, portanto implementar Comparator e passá-lo diretamente na criação do TreeSet
class CarrosHondaByPrecoComparator implements Comparator<CarrosHonda> {

    @Override
    public int compare(CarrosHonda o1, CarrosHonda o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }

}
//-----------------------------------------------------------------------------


public class NavigableSetCarrosHondaTest01 {

    public static void main(String[] args) {

        NavigableSet<CarrosHonda> setHonda = new TreeSet<>(new CarrosHondaByPrecoComparator());

        setHonda.add(new CarrosHonda(4L, "Fit", 45_000.00));
        setHonda.add(new CarrosHonda(2L, "City", 117_000.00));
        setHonda.add(new CarrosHonda(1L, "Civic Hibrido", 244_900.00));
        setHonda.add(new CarrosHonda(9L, "Civic Type R", 429_900.00));
        setHonda.add(new CarrosHonda(13L, "HRV", 148_900.00));

        // imprimindo ordenado pelo preço!
        for (CarrosHonda carro: setHonda) {
            System.out.println(carro);
        }

        System.out.println("---------------------------------");

        // mesmo sendo adicionado por último, este Fit será mostrado como primeiro ao imprimirmos novamente, devido à ordenação pelo preço!
        setHonda.add(new CarrosHonda(25L, "Fit", 39_000.00));

        for (CarrosHonda carro: setHonda) {
            System.out.println(carro);
        }


        System.out.println("---------------------------------");


        // ATENÇÃO!
        // O TreeSet falha em obedecer ao contrato geral da interface Set.

        // O TreeSet NÃO se baseia no equals() para verificar se dois elementos são iguais!
        // Baseia-se no método compareTo() para o caso do Comparable ou no compare() baseado no Comparator.
        // Isso implica que, neste exemplo, o TreeSet verificará o preço para saber se dois elementos são iguais...

        // Logo, mesmo se colocarmos ids iguais, se o preço for diferente, então vamos conseguir incluir no TreeSet
        setHonda.add(new CarrosHonda(12345L, "Civic Type R", 430_000.00));
        setHonda.add(new CarrosHonda(12345L, "Civic Type R", 431_900.00));

        // Se o preço for igual, mesmo com id diferente, então não será incluído.
        setHonda.add(new CarrosHonda(327842L, "Civic Type R", 431_900.00)); // Duplicate Set element


        for (CarrosHonda carro: setHonda) {
            System.out.println(carro);
        }

        System.out.println("---------------------------------");

        // -------------------------- Outros métodos da NavigableSet:

        // ordem inversa:
        for (CarrosHonda carro: setHonda.descendingSet()) {
            System.out.println(carro);
        }

        System.out.println("---------------------------------");

        // criando um novo Civic Hibrido com outro preco e id
        CarrosHonda carroHonda01 = new CarrosHonda(112232L, "Civic Hibrido", 250_000.00);

        // lower:
        // Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
        // No caso, é aé o Civic Hibrido de 244_900.00
        System.out.println(setHonda.lower(carroHonda01));

        // floor
        // Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
        System.out.println(setHonda.floor(carroHonda01));

        // higher
        // Returns the least element in this set strictly greater than the given element, or null if there is no such element.
        System.out.println(setHonda.higher(carroHonda01));

        // ceiling
        // Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
        System.out.println(setHonda.ceiling(carroHonda01));


        System.out.println("---------------------------------");

        // size()
        System.out.println("size of setHonda is => " + setHonda.size());

        System.out.println("---------------------------------");

        // pollFirst()
        System.out.println(setHonda.pollFirst()); // Retrieves and removes the first (lowest) element, or returns null if this set is empty.
        System.out.println("Now, the size of setHonda is => " + setHonda.size());

        // Imprimindo novamente na ordem inversa para verificar que foi removido:
        for (CarrosHonda carro: setHonda.descendingSet()) {
            System.out.println(carro);
        }

        System.out.println("---------------------------------");

        // pollLast()
        System.out.println(setHonda.pollLast()); // Retrieves and removes the last (highest) element, or returns null if this set is empty.
        System.out.println("Now, the size of setHonda is => " + setHonda.size());

        // Imprimindo novamente na ordem inversa para verificar que foi removido:
        for (CarrosHonda carro: setHonda.descendingSet()) {
            System.out.println(carro);
        }


    }

}
