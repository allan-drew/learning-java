package br.com.cursojava.aintro;

public class ArraysMultidimensionais {

    public static void main(String[] args) {

        // Multidimensional Arrays
        // A multidimensional array is an array of arrays.
        int[][] numeros = new int[3][4]; // 3 elementos (0 a 2) x 4 elementos (0 a 3)
        System.out.println( "posicao 0,0 antes da atribuicao --> " + numeros[0][0]); //primeiro

        // atribuindo valor
        numeros[0][0] = 98;
        numeros[0][1] = 45;
        numeros[0][2] = 32;
        numeros[0][3] = 18;

        numeros[1][0] = 10;
        numeros[1][1] = 11;
        numeros[1][2] = 34;
        numeros[1][3] = 10;

        numeros[2][0] = 9;
        numeros[2][1] = 89;
        numeros[2][2] = 14;
        numeros[2][3] = 43;

        System.out.println("posicao 0,0 depois da atribuicao --> " + numeros[0][0]);


        // ============================================================================================================
        System.out.println("percorrendo o array 2D : ");

        for (int i = 0; i < numeros.length; i++) {

             for (int j = 0; j < numeros[i].length; j++) {
//                 System.out.println(i);
                 System.out.println(i + "," + j + " ==> "+ numeros[i][j]);
             }

        }

        System.out.println();


        // ============================================================================================================
        // com foreach:

        // Para acessar cada elemento, primeiro é necessário acessar cada array (ou cada linha, no caso de 2d),
        // por isso usa-se int[]....
        // Isso fará:
                // for externo iteracao 1 => numeros[0][]
                        // for interno it 1 => numeros[0][0]
                        // for interno it 2 => numeros[0][1]
                        // for interno it 3 => numeros[0][2]
                        // for interno it 4 => numeros[0][3]
                // for externo iteracao 2 => numeros[1][]
                        // for interno it 1 => numeros[1][0]
                        // for interno it 2 => numeros[1][1]
                        // for interno it 3 => numeros[1][2]
                        // for interno it 4 => numeros[1][3]
                // for externoiteracao 3 => numeros[2][]
                        // for interno it 1 => numeros[2][0]
                        // for interno it 2 => numeros[2][1]
                        // for interno it 3 => numeros[2][2]
                        // for interno it 4 => numeros[2][3]
        for (int[] ref : numeros) {

            // acessando de fato cada elemento
            for (int number : ref) {
                System.out.println(number);
            }

        }
        // ============================================================================================================
        System.out.println();


        // DECLARANDO E INICIALIZANDO:
        int[][] someArray = {
                {9, 3, 5},
                {1, 3, 22, 4},
                {0, 3, 5, 10, 3, 2, 1},
        };

        // unlike C/C++, each row of the multidimensional array in Java can be of different lengths.
        // https://www.programiz.com/java-programming/multidimensional-array
        // Since each component of a multidimensional array is also an array
        // (a[0], a[1] and a[2] are also arrays).
        System.out.println("tamanho da primeira linha (ou array) => " + someArray[0].length);
        System.out.println("tamanho da segunda linha (ou array) => " + someArray[1].length);
        System.out.println("tamanho da terceira linha (ou array) => " + someArray[2].length);


        System.out.println();


        // ============================================================================================================
        // Como cada linha pode ter tamanhos diferentes, então só é necessário definir o tamanho do primeiro array...
        // O primeiro array define a quantidade de arrays(linhas) diferentes que teremos
        int[][] dias = new int[3][]; //tamanho 3 (0, 1 e 2)

        // definindo a quantidade de posicoes de cada array (cada linha)
        dias[0] = new int[2]; // tamanho 2 (0 e 1) --> valores 0 e 0
        dias[1] = new int[]{3, 5, 6, 1}; // tamanho 4 (0, 1, 2, 3) --> valores 3, 5, 6, 1
        dias[2] = new int[4]; // tamanho 4 (0, 1, 2, 3) --> valores 0, 0, 0, 0


        for (int[] ref : dias) {

            System.out.println("linha => " + ref);
            for (int dia : ref) {
                System.out.println("valor ===> " + dia);
            }

        }



    }

}
