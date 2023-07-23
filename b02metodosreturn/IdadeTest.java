package br.com.cursojava.b02metodosreturn;

public class IdadeTest {

    public static void main(String[] args) {

        Idade idadePessoa1 = new Idade();

        System.out.println("idade antes de chamar o método: ");
        int idadeAtual = 5;
        System.out.println(idadeAtual);

        System.out.println("idade após chamar o método : ");
        System.out.println(idadePessoa1.idadeAposUmAno(idadeAtual));

        System.out.println("idade novamente sem chamar o método : (o valor não se altera, pois a passagem é por cópia)");
        System.out.println(idadeAtual);


    }

}
