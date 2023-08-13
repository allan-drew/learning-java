package br.com.cursojava.c06resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {

    // ResourceBundle...

    /* Resource bundles contain locale-specific objects.

    When your program needs a locale-specific resource, a String for example,
    your program can load it from the resource bundle that is appropriate for the current user's locale.

    This allows you to write programs that can:
        > be easily localized, or translated, into different languages
        > handle multiple locales at once
        > be easily modified later to support even more locales
    */

    public static void main(String[] args) {

        System.out.println(Locale.getDefault()); // verificando o padrão do sistema operacional

        System.out.println("----------");

        // 1- criar um arquivo resource bundle na pasta src
        // 2- pegar o bundle
        ResourceBundle bundle01 = ResourceBundle.getBundle("mensagensSistema", new Locale("en", "BR"));
        System.out.println(bundle01.getString("hello"));
        System.out.println(bundle01.getString("goodmorning"));
        System.out.println(bundle01.getString("up.failed"));

        System.out.println("----------");

        ResourceBundle bundle02 = ResourceBundle.getBundle("mensagensSistema", new Locale("pt", "BR"));
        System.out.println(bundle02.getString("hello"));
        System.out.println(bundle02.getString("goodmorning"));
        System.out.println(bundle02.getString("up.failed"));




    }

}
