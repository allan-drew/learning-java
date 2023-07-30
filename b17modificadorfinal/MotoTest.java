package br.com.cursojava.b17modificadorfinal;

public class MotoTest {

    public static void main(String[] args) {

        Moto moto1 = new Moto();
        System.out.println(Moto.VELOCIDADE_LIMITADA);
//        Moto.VELOCIDADE_LIMITADA = 270; //ERRO! Não podemos alterar o valor, pois é uma variável 'final

        System.out.println(Moto.POTENCIA_MINIMA);


        // neste caso, como a variável não é static, logo acessamos pelo objeto moto1
        System.out.println(moto1.PRECO_MINIMO);

        // printando a variável 'final' que foi inicializada dentro do construtor
        System.out.println(moto1.NUMERO_DE_REVISOES);


    }

}
