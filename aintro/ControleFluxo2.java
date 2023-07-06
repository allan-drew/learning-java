package br.com.cursojava.aintro;

public class ControleFluxo2 {

    public static void main(String[] args) {

        //========================================
        // Java switch Statement

        byte diaDaSemana = 3; // byte type can have values from -128 to 127

        // aceita apenas char, int, byte, short e String (a partir do java 7)
        switch (diaDaSemana) {
            case 1:
                System.out.println("domingo");
                break;
                // O break é necessário para interromper o processo dentro do block e pular para fora do switch
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terca");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default: // If there is no match, the code of the default case is executed.
                System.out.println("desconhecido");
                break;

        }

        // ======================
        System.out.println();
        // ======================

        // ATENCAO!!!!!!!!!!!!!!!!
        // se nao usar o break, imprimirá todos que estão abaixo:

        int maquina = 2;

        switch (maquina) {
            case 1:
                System.out.println("maquina 1");
            case 2:
                System.out.println("maquina 2");
            case 3:
                System.out.println("maquina 3");
            default:
                System.out.println("desconhecida");
        }

        // ======================
        System.out.println();
        // ======================


        // switch com char VS strings

        // com char --> aspas simples

        char sexoPessoa1 = 'F';

        switch (sexoPessoa1) {
            case 'F':
                System.out.println("feminino");
                break;
            case 'M':
                System.out.println("masculino");
                break;
            default:
                System.out.println("outro");
                break;
        }


        // com string --> aspas duplas

        String sexoPessoa2 = "M";

        switch (sexoPessoa2) {
            case "F":
                System.out.println("feminino");
                break;
            case "M":
                System.out.println("masculino");
                break;
            default:
                System.out.println("outro");
                break;
        }


        // ======================
        System.out.println();
        // ======================

        int tamanhoCalcado = 42;

        switch (tamanhoCalcado) {

            case 37:
            case 38:
            case 39:
                System.out.println("pé pequeno");
                break;

            case 40:
            case 41:
                System.out.println("pé médio");
                break;

            case 42:
            case 43:
                System.out.println("pé grande");
                break;

            default:
                System.out.println("invalido");
                break;
        }






    }


}
