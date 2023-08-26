package br.com.cursojava.d00colecoes;

public class EqualsTest01 {

    public static void main(String[] args) {

        String nome = "Cristiano Ronaldo"; // criando string no pool de strings
        String nome2 = "Cristiano Ronaldo"; // criando string no pool de strings
        System.out.println(nome == nome2); // true, pois as variáveis de referencia (nome e nome2) apontam para a mesma string constant pool ("Cristiano Ronaldo")
        System.out.println(nome.equals(nome2));


        System.out.println("----");


        String nome03 = "Messi";
        String nome04 = new String("Messi");
        System.out.println(nome03 == nome04); // false pois as referencias são diferentes.
        System.out.println(nome03.equals(nome04)); // true




    }

}
