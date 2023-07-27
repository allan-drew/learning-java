package br.com.cursojava.b13stringsjava;

public class StringsInJavaTest {

    public static void main(String[] args) {

        // We use double quotes to represent a string in Java.
        String nome = "Gabriel";
        String sobrenome = "Barbosa";

        // Get length of a String
        System.out.println("length => " + nome.length());
        System.out.println("length => " + sobrenome.length());

        // Join Two Java Strings
        String joinedString = nome.concat(sobrenome);
        System.out.println("Joined string => " + joinedString);

        // Compare two Strings
        boolean resultado = nome.equals(sobrenome); //false
        System.out.println(resultado);

        String linguagem1 = "C++";
        String linguagem2 = "C++";
        System.out.println(linguagem1.equals(linguagem2)); //true
        System.out.println(linguagem1 == linguagem2); //true


        // So far we have created strings like primitive types in Java.
        //Since strings in Java are objects, we can create strings using the new keyword as well. For example,
        String nomeTime = new String("Flamengo");
        System.out.println(nomeTime);

        System.out.println("--------");


        // ================================================================================================
        // OUTROS MÉTODOS :
        // ================================================================================================


        // contains()	checks whether the string contains a substring
        String timesFinal = "Flamengo e Vasco";
        boolean result = timesFinal.contains("Fla"); //true
        boolean result2 = timesFinal.contains("Fluminense"); //false
        System.out.println("Flamengo está na final? "+ result);
        System.out.println("Fluminense está na final? "+ result2);

        System.out.println();

        // ================================================================================================

        // substring()	returns the substring of the string
        // extract substring from index 0 to 2
        // string.substring(int startIndex, int endIndex)
        System.out.println( timesFinal.substring(0,3) );
                // The substring begins with the character at the startIndex
                // and extends to the character at index endIndex-1.

        System.out.println(timesFinal.substring(0)); // Flamengo e Vasco

        System.out.println(timesFinal.substring(3)); // mengo e Vasco

        System.out.println();
        // ================================================================================================


        // join()	join the given strings using the delimiter
        // join() is a static method. You do not need to create a string object to call this method.
        // Rather, we call the method using the class name String.
        String string1 = "Banco";
        String string2 = "do";
        String string3 = "Brasil";

        String novaString = String.join(" ", string1, string2, string3);
        System.out.println(novaString);

        String computador1 = "Mac";
        String computador2 = "Book";
        String resultadoComputador = String.join("", computador1, computador2);
        System.out.println(resultadoComputador);

        String letra1 = "A";
        String letra2 = "B";
        String letra3 = "C";
        String resultadoLetra = String.join("/", letra3, letra2, letra1);
        System.out.println(resultadoLetra);

        System.out.println();
        // ================================================================================================


        // replace()	replaces the specified old character with the specified new character
        // The replace() method replaces each matching occurrence of the old character/text in the string
        // with the new character/text.
        String ling = "Programação C++";
        System.out.println("original ==> " + ling);
        System.out.println( "replace ==> "+ ling.replace("C++", "Java"));


        // replaces substrings starting from the start to the end.
        // portanto, os z que serao substituidos serão os primeiros
        System.out.println("zzz".replace("zz", "x")); // xz;

        System.out.println("zzzzzzz".replace("zz", "x")); // xxxz;


        System.out.println();
        // ================================================================================================

        // The charAt() method returns the character at the specified index.
        String estadio = "Maracanã";
        System.out.println(estadio.charAt(0));
        System.out.println(estadio.charAt(1));
        System.out.println(estadio.charAt(2));
        System.out.println(estadio.charAt(3));

        System.out.println();
        // ================================================================================================

        // The indexOf() method returns the index of the first occurrence
        // of the specified character/substring within the string.
        System.out.println(estadio.indexOf('M'));
        System.out.println(estadio.indexOf('a'));
        System.out.println(estadio.indexOf('r'));
        System.out.println(estadio.indexOf('a')); // retorna index 1, pois retorna a primeira ocorrencia
        System.out.println("--");

        // if fromIndex is passed, the ch character is searched starting from this index
        System.out.println(estadio.indexOf('a', 2)); // retorna index 3 (e nao 1) pois está começando do 2

        // returns -1 if the specified character/string is not found.
        System.out.println(estadio.indexOf('Z'));


        System.out.println();
        // ================================================================================================

        // The split() method divides the string at the specified regex and returns an array of substrings.
        String texto = "Flamengo campeão da Libertadores";

        // split string from space
        String[] resultadoSplit = texto.split(" ");

        System.out.println(resultadoSplit);

        for (String resultStr : resultadoSplit) {
            System.out.println(resultStr);
        }

        System.out.println();
        // ================================================================================================

        // The toLowerCase() method converts all characters in the string to lowercase characters.
        String time = "FLAMENGO E VASCO";
        System.out.println(time.toLowerCase());

        // The Java String toUpperCase() method converts all characters in the string to upper case characters.
        String atacantes = "gabigol e pedro";
        System.out.println(atacantes.toUpperCase());



        System.out.println();
        // ================================================================================================

        // The valueOf() method returns the string representation of the argument passed.
        double number = 923.234d;
        System.out.println(number);

        // We call the valueof() method using the class name like this: String.valueOf(b);
        System.out.println(String.valueOf(number)); // convert double to string

        // -----
        char primeiroNome[] = {'G', 'A', 'B', 'I'};
        System.out.println(String.valueOf(primeiroNome));


        System.out.println();
        // ================================================================================================

        // toCharArray()	converts the string to a char array
        String nomeCompleto = "Bruno Henrique";
        System.out.println( nomeCompleto + " é uma " + nomeCompleto.getClass().getSimpleName()); // verifica o tipo string

        char charArrayNomeCompleto[] = nomeCompleto.toCharArray();
        System.out.println( charArrayNomeCompleto + " é uma " + charArrayNomeCompleto.getClass().getSimpleName()); // verifica o tipo char array

        // startsWith()	checks if the string begins with the given string
        System.out.println(nomeCompleto.startsWith("Bruno")); // true

        // endsWith()	checks if the string ends with the given string
        System.out.println(nomeCompleto.endsWith("Henrique")); // true
        System.out.println(nomeCompleto.endsWith("Silva")); // false


        // isEmpty()	checks whether a string is empty of not
        System.out.println("is empty ? " + nomeCompleto.isEmpty()); // false

        System.out.println();


//        subSequence()	returns a subsequence from the string
        // The Java String subSequence() method returns a character sequence (a subsequence) from the string.
        // The subSequence() method returns a CharSequence.

        String finalLibertadores2022 = "Flamengo e Athlético-PR";

        System.out.println(finalLibertadores2022.subSequence(0, 11));
//        System.out.println(finalLibertadores2022.subSequence(0, 11).getClass().getSimpleName());


    }

}
