package br.com.cursojava.aintro;

public class ControleFluxo3 {

    public static void main(String[] args) {

        // ===================================================
        // FOR LOOP:
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "    - I love Java");
        }

        System.out.println();

        int n = 5;
        for (int i = 1; i < n; i++ ) { // comecando do 1
            System.out.println(i);
        }

        // ======================
        System.out.println();
        // ======================


        // soma de numeros
        int numeros = 10;
        int soma = 0;

        for (int i = 0; i <= numeros; i++) {
            soma += i;
        }

        System.out.println("a soma é: " + soma);



        // ======================
        System.out.println();
        // ======================


        // FOR EACH:
        // The Java for loop has an alternative syntax that makes it easy
        // to iterate through arrays and collections. For example,
        int [] numbers = {0, 4, 5, 6, 1, 43};

        for (int numb : numbers) {
            System.out.println("usando for each --> " + numb);
        }


        // Fazendo o mesmo processo no For
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("usando for normal --> " + numbers[i]);
        }


        // ======================
        System.out.println();
        // ======================


        // ============================================
        // WHILE
        // O uso do 'while' é recomendado quando NÃO se sabe quantas vezes irá repetir

        int contador = 10;
        int iterator = 0;
        while (iterator < contador) {
            System.out.println("I love music! --> " + iterator);
            iterator++; // usar dentro do while
        }

        System.out.println();

        // ====================
        // programa para calcular a soma dos numeros digitados
        // será encerrado quando o usuário digitar zero
//        int sum = 0;
//
//        Scanner entrada = new Scanner(System.in);
//
//        System.out.println("Digite um numero inteiro (0 para sair): ");
//        int numb = entrada.nextInt();
//
//        while ( numb != 0 ) {
//            sum += numb;
//            numb = entrada.nextInt();
//        }
//
//        System.out.println("A soma é : " + sum);



        // ======================
        System.out.println();
        // ======================


        // ============================================
        // DO WHILE
        // O corpo do laço é executado pelo menos uma vez
        int cont2 = 0;
        int iter2 = 0;

        do {
            System.out.println(" imprime o do..." + iter2); // imprime pelo menos uma vez
            ++iter2;
        } while (iter2 < cont2);

        System.out.println("loop finalizado");


        // ======================
        System.out.println();
        // ======================

        // break com for
        // While working with loops, it is sometimes desirable to skip some statements
        // inside the loop or terminate the loop immediately without checking the test expression.
        // In such cases, break and continue statements are used.

        for (int i = 0; i < 10; i++) {
            System.out.println("imprime i : " + i);
            if (i == 5) {
                break; //faz o break no loop (ou seja, no for)
            }
        }


        // ========================================================================================
//        double number1, soma1 = 0.0;
//
//        Scanner input = new Scanner(System.in); // cria um objeto do Scanner para pegar um input
//
//        while (true) {
//
//            System.out.println("Digite um numero : ");
//
//            number1 = input.nextDouble(); // pega um input do usuário
//
//            if (number1 < 0) {
//                break;
//            }
//
//            soma1 += number1;
//
//        }
//
//        System.out.println("A soma é : " + soma1);
        // ========================================================================================


        // ======================
        System.out.println();
        // ======================


        // Labeled break Statement
        // The control of the program jumps to the statement after the labeled statement.

        // the for loop is labeled as first
        primeiroFor:
        for( int i = 0; i < 10; i++) {

            // the for loop is labeled as second
            segundoFor:
            for(int j = 1; j < 5; j ++ ) {
                System.out.println("i = " + i + "; j = " +j);

                // the break statement breaks the first for loop
                if ( i == 2)
                    break primeiroFor;
            }
        }
        // ========================================================================================


        // ======================
        System.out.println();
        // ======================


        // Java continue Statement
        // The continue statement skips the current iteration of a loop (for, while, do...while, etc).
        // After the continue statement, the program moves to the end of the loop.
        // https://www.programiz.com/java-programming/continue-statement

        for (int i = 0; i < 10; i++) {

            // se o valor de i estiver entre 4 e 8
            // então, o código retorna para o for em vez de seguir para o print
            // Skips the current iteration of the loop and takes the program control to the update expression of the loop.
            if ( i > 4 && i < 8) {
                continue;
            }

            System.out.println("i é igual a : " + i );

        }
        // ========================================================================================


        // ======================
        System.out.println();
        // ======================


        // =============== Programa que irá somar apenas os numeros positivos dentre 5 numeros:
        // USAR o continue

//        int number2;
//        int soma2 = 0;
//
//        Scanner entradaInteiro = new Scanner(System.in);
//
//        for (int i = 0; i < 5; i++ ) {
//
//            System.out.println("Digite um numero : ");
//            number2 = entradaInteiro.nextInt();
//
//            if (number2 < 0) {
//                continue; // continua para a próxima iteracao e nao irá somar o resultado
//            }
//
//            soma2 += number2;
//
//        }
//
//        System.out.println("A soma é : " + soma2);


        // ======================
        System.out.println();
        // ======================

        int maximo = 10;
        int iter = 0;

        while (iter < maximo) {

            iter++;

            if (iter == 6 || iter == 8 || iter == 9) {
                continue; // não faz o print abaixo e volta no while
            }

            System.out.println("iter é igual a : " + iter);

        }


        System.out.println();

        // ==============================

        // usando o break e não usando o continue (resultado diferente)
        int maximo2 = 10;
        int iter3 = 0;

        while (iter3 < maximo2) {

            iter3++;

            if (iter3 == 6 || iter3 == 8 || iter3 == 9) {
                break; // não faz o print abaixo e pula o while
            }

            System.out.println("iter é igual a : " + iter3);

        }



    }

}
