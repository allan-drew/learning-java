package br.com.cursojava.b18enum03;

public class Test {

    public static void main(String[] args) {

        Cabelo cabelo001 = new Cabelo("loiro", TamanhoCabelo.GRANDE);

        Cabelo cabelo002 = new Cabelo("preto", TamanhoCabelo.PEQUENO);

        System.out.println(cabelo001.toString());
        System.out.println(cabelo002.toString());

        // Assim, podemos, por exemplo, enviar para o banco de dados os valores numéricos...
        // porém mantemos de forma intuitiva para quem está trabalhando no código ao visualizar PEQUENO, MEDIO e GRANDE
        
    }

}
