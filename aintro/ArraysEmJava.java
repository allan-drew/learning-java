package br.com.cursojava.aintro;

public class ArraysEmJava {

    public static void main(String[] args) {

        // -------------------------------------------------------------
        // DECLARANDO ARRAYS:
        // a variável faz referência ao array no espaço de memória
        int[] idades; // mais recomendado
        String[] estudantes;
        double alturas[]; // menos recomendado

        // ALOCANDO MEMÓRIA para os arrays declarados:
        // Em Java, arrays são objetos, por isso usa-se o new
        // Aqui são alocados os espacos na memória para a variável apontar...
        // e precisamos indicar o tamanho do array para ser alocado o espaço adequado em memótia
        idades = new int[10];
        estudantes = new String[5];
        alturas = new double[8];

        // IMPRIMINDO O ENDEREÇO
        System.out.println(idades);
        System.out.println(estudantes);
        System.out.println(alturas);

        // IMPRIMINDO OS VALORES:
        System.out.println(idades[0]); //padrao 0
        System.out.println(estudantes[0]); // padrao null
        System.out.println(alturas[0]); // padrao 0.0

        System.out.println(idades[9]);
        System.out.println(estudantes[4]);
        System.out.println(alturas[7]);
        // -------------------------------------------------------------
        System.out.println();

        // =========================================================================================================

        // DECLARANDO E ALOCANDO MEMÓRIA:
        // In Java, we can declare and allocate the memory of an array in one single statement:
        int[] tempos = new int[3]; // tamanho 3 --> 0, 1 e 2
                // Ao definir o tamanho, este será o tamanho do array não podendo ser alterado

        // Ao alocar o espaço, eles são preenchidos com zero, no caso do int, caso não sejam inicializados valores
        // Para o caso de String, por exemplo, são inicializados com 'null '
        System.out.println("primeiro tempo------>" + tempos[0]);
        System.out.println("segundo tempo------>" + tempos[1]);
        System.out.println("terceiro tempo------>" + tempos[2]);

        // Preenchendo valores no array
        tempos[0] = 15;
        tempos[1] = 18;
        tempos[2] = 20;

        // acessando:
        System.out.println("primeiro tempo:" + tempos[0]);
        System.out.println("segundo tempo:" + tempos[1]);
        System.out.println("terceiro tempo:" + tempos[2]);


        System.out.println();

        // =========================================================================================================

        // DECLARANDO E INICIALIZANDO DIRETO (outro método):
        // Java irá identificar o tamanho do array de acordo com a quantidade de elementos
        int[] age = {12, 4, 5, 2, 5};
        System.out.println(age[0] + " / " + age[1] + " / " + age[2] + " / " + age[3] + " / " + age[4]);


        // =========================================================================================================
        System.out.println();
        // =========================================================================================================


        // DECLARANDO E INICIALIZANDO DIRETO (outro método)
        int[] numeros = new int[] {0, 6, 9};
        System.out.println(numeros[0] + " / " + numeros[1] + " / " + numeros[2]);

        System.out.println();
        // =========================================================================================================


        // =========================================================================================================
        // Percorrendo o array com for:
        String[] nome = new String[3];
        nome[0] = "Gabi";
        nome[1] = "Arrascaeta";
        nome[2] = "Everton Ribeiro";

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Nome ==> " + nome[i]);
        }

        System.out.println();

        // Ao definir o tamanho, este será o tamanho do array não podendo ser alterado....
        // Para utilizar um array com tamanho diferente, é necessário criar um novo espaço de memória
                // O espaco de memória ANTIGO ficará inacessível, pois não tem variável referenciando
                // O Java, portanto, através do garbage colector, apaga da memória
        nome = new String[5];

        nome[0] = "Gabi";
        nome[1] = "Arrascaeta";
        nome[2] = "Everton Ribeiro";
        nome[3] = "Bruno Henrique";
        nome[4] = "Pedro";

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Nome ==> " + nome[i]);
        }


        // =========================================================================================================
        System.out.println();



        //====================================================================
        // Using the for-each Loop
        String[] times = {"Flamengo", "Vasco", "Botafogo", "Fluminense"};

        for (String time : times) { // o tipo da variável 'time' tem que ser o tipo da variável da array, no caso, String
            System.out.println(time);
        }

        //----
        double[] precos = {10.4, 90.1, 50.4, 10.4};

        for (double aux : precos) {
            System.out.println(aux);
        }

    }

}
