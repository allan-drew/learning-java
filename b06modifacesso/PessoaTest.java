package br.com.cursojava.b06modifacesso;

public class PessoaTest {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        // pessoa1.nome = "Goku"; // nao funciona devido ao modificador de acesso private
        pessoa1.setNome("Goku");
        pessoa1.setIdade(16);

        System.out.println("pegando o nome com get ==> " + pessoa1.getNome());
        System.out.println("pegando a idade com get ==> " + pessoa1.getIdade());

        pessoa1.imprimirInfo();

    }

}
