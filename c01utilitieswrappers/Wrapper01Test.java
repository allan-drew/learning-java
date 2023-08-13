package br.com.cursojava.c01utilitieswrappers;

public class Wrapper01Test {

    public static void main(String[] args) {

        // Primitivos:
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = true;        

        // Wrappers:
        // Wrapper é uma classe que encapsula um valor primitivo.
        // Os wrappers são usados para representar tipos primitivos como objetos.
        // Criados no Java para se permitir passar valores por referência, e não mais por valor.
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = true;

        // Permite que os tipos primitivos sejam usados em contextos onde objetos são necessários,
        // como em coleções e métodos.

        // Os wrappers estendem a classe Number, o que significa que eles compartilham muitos métodos com outros números,
        // como métodos para adicionar, subtrair, multiplicar e dividir.

        /*
        * Os wrappers podem ser usados de várias maneiras.
        * Eles podem ser usados para representar valores primitivos em coleções, como arrays e listas.
        * Eles também podem ser usados para passar valores primitivos para métodos que esperam objetos.
        * Além disso, os wrappers podem ser usados para criar objetos que representam valores primitivos.
         */

        // wrapper
        byteW.toString();

        // primitivo:
        // ERRO
//        byteP.toString();


        String number = "2";
        System.out.println(number instanceof String);

        Integer intW2 = Integer.parseInt(number);
        System.out.println(intW2);
        System.out.println(intW2 instanceof Integer);

        System.out.println("-----");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('1'));
        System.out.println("-----");
        System.out.println(Character.isLetter('C'));
        System.out.println(Character.isLetter('0'));
        System.out.println("-----");
        System.out.println(Character.isLowerCase('a')); // true
        System.out.println(Character.isUpperCase('A')); // true
        System.out.println("-----");
        System.out.println(Character.toUpperCase('b')); // b --> B
        System.out.println(Character.toLowerCase('B')); // B --> b



    }

}
