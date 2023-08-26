package br.com.cursojava.d05colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoListaArrayTest01 {

    public static void main(String[] args) {

        // ------------------------------------------------------------
        // LISTA -> ARRAY
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] integersArray = numeros.toArray( ( new Integer[numeros.size()] ) );
        System.out.println(Arrays.toString(integersArray));
        // ------------------------------------------------------------

        System.out.println("====================================================");

        // ------------------------------------------------------------
        // ARRAY -> LISTA
        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 2;
        numerosArray[1] = 4;
        numerosArray[2] = 6;

        List<Integer> integersList = Arrays.asList(numerosArray);
        System.out.println(integersList);

        System.out.println("--------");

        // Cuidado ao usar Arrays.asList(), pois cria-se um link com o array original!
        // Ou seja, se altermos algo no intergersList, alteramos também no numerosArray.
        // exemplo:
        integersList.set(0, 8); // setando o 8 na posição 0.

        System.out.println(Arrays.toString(numerosArray)); // imprimindo o array
        System.out.println(integersList); // imprimindo a lista

        // Ainda pior, não é possível inserir elementos.
        // integersList.add(12); // Exception in thread "main" java.lang.UnsupportedOperationException

        System.out.println("--------");

        // ------------------------------------------------------------------------------------------------
        // Para "quebrar o vínculo", podemos fazer o seguinte:
        List<Integer> integersList02 = new ArrayList<>(Arrays.asList(numerosArray));
        integersList02.add(12);

        System.out.println(Arrays.toString(numerosArray)); // imprimindo o array
        System.out.println(integersList02); // imprimindo a lista

        System.out.println("--------");

        integersList02.add(14);
        integersList02.add(16);
        integersList02.add(18);

        System.out.println(Arrays.toString(numerosArray)); // imprimindo o array
        System.out.println(integersList02); // imprimindo a lista



        // ------------------------------------------------------------





    }

}
