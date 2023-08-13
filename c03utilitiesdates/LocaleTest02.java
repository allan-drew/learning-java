package br.com.cursojava.c04UtilitiesNumbersLocale;

import java.util.Locale;

public class LocaleTest02 {

    public static void main(String[] args) {

        //
        System.out.println(Locale.getDefault());

        //
        String[] isoCountries = Locale.getISOCountries();
        for (String isoCountry : isoCountries) {
            System.out.println(isoCountry + " / ");
        }

        System.out.println("============================================");
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) {
            System.out.println(isoLanguage + " / ");
        }


    }

}
