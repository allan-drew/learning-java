package br.com.cursojava.b24strings;

public class StringsTest01 {

    public static void main(String[] args) {

        String nomeTime = "Real Madrid"; // criando string no pool de strings
        String nomeTime02 = "Real Madrid"; // criando outra string no pool de strings

        System.out.println(nomeTime.equals(nomeTime02)); // true, pois os valores das strings são iguais
        System.out.println(nomeTime == nomeTime02); // true, pois as variáveis de referencia (nomeTime e nomeTime02) apontam para a mesma string constant pool ("Real Madrid")


        // Strings são imutáveis
        nomeTime.concat(" Club de Fútbol");
        System.out.println(nomeTime); // portanto, ainda temos "Real Madrid" como resposta, mesmo com o concat.

        // Para utilizar o novo valor é necessário associar o novo valor para a variável de referência.
        nomeTime = nomeTime.concat(" Club de Fútbol");
        System.out.println(nomeTime);

        //--------------
        String nomeTime03 = new String("Real Madrid Club de Fútbol"); // 1- cria variavel de referencia / 2- cria objeto do tipo string no heap/ 3 - cria string no pool
        System.out.println(nomeTime.equals(nomeTime03)); // true, pois os valores das strings são iguais
        System.out.println(nomeTime == nomeTime03); // false, pois as referências são diferentes

        System.out.println("=================================================");


        // Principais métodos para strings:
        String nomePais = "Brasil";
        System.out.println(nomePais.charAt(0)); // B
        System.out.println(nomePais.length()); // método length para saber o tamanho (*atencao: em arrays o length é um atributo e nao um método como nas strings)
        System.out.println(nomePais.replace("s", "z"));
        System.out.println(nomePais.toLowerCase());
        System.out.println(nomePais.toUpperCase());
        System.out.println();

        System.out.println(nomePais.substring(0, 3)); // beginIndex(inclusive) , endIndex(exclusive)
        System.out.println(nomePais.substring(0, nomePais.length()));
        System.out.println();


        String nomePais2 = "    Argentina  ";
        System.out.println(nomePais2.trim()); // remove os espacos em branco no comeco e no final

    }

}
