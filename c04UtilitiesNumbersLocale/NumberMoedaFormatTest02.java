package br.com.cursojava.c04UtilitiesNumbersLocale;

import java.text.NumberFormat;
import java.util.Locale;

// Em vez invés de getInstance, iremos usar getCurrencyInstance

public class NumberMoedaFormatTest02 {

    public static void main(String[] args) {

        Locale localeBrasil = new Locale("pt", "BR");
        Locale localeJapao = Locale.JAPAN; // para alguns países podemos pegar pela constante
        Locale localeAlemanha = Locale.GERMANY; // para alguns países podemos pegar pela constante
        Locale localeEUA = Locale.US; // para alguns países podemos pegar pela constante

        NumberFormat[] numberFormat = new NumberFormat[4];

        numberFormat[0] = NumberFormat.getCurrencyInstance(localeBrasil);
        numberFormat[1] = NumberFormat.getCurrencyInstance(localeJapao);
        numberFormat[2] = NumberFormat.getCurrencyInstance(localeAlemanha);
        numberFormat[3] = NumberFormat.getCurrencyInstance(localeEUA);

        double valorParaTeste = 163_503_119.21;

//        for (NumberFormat nf : numberFormat){
//            System.out.println(nf);
//            System.out.println(nf.format(valorParaTeste));
//        }

        System.out.println("---------- formatação para MOEDAS utilizando Locale ----------");

        for (int i = 0; i < numberFormat.length; i++) {

            switch (i) {
                case 0:
                    System.out.println("Brasil:");
                    break;
                case 1:
                    System.out.println("Japão:");
                    break;
                case 2:
                    System.out.println("Alemanha:");
                    break;
                case 3:
                    System.out.println("USA:");
                    break;
                default:
                    System.out.println("default!");
                    break;
            }

            System.out.println("    " + numberFormat[i].format(valorParaTeste));
        }


    }

}
