package br.com.cursojava.b05paramArray;

public class Computador {

    public String marcaDoComputador;
    public int precoDoComputador;

    public void InfoImprime() {
        System.out.println("A marca é => " + this.marcaDoComputador);
        System.out.println("O preço é => " + this.precoDoComputador);
    }

    public void somaArray (int[] theArray) {
        int soma = 0;
        for(int aux : theArray) {
            soma+=aux;
        }
        System.out.println("o total de PCs vendidos foi de: " + soma + " -----> usando somaArray ");
    }

    // ---------------------------
    // Usando VAR-ARGS
    // var arg é uma forma conveniente de receber um array na chamada do método...
    // Com isso, no programa principal (main), basta apenas passar os numeros entre vírgulas
    public void somaVarArgs (int...theArray) {
        int soma = 0;
        for(int aux : theArray) {
            soma+=aux;
        }
        System.out.println("o total de PCs vendidos foi de: " + soma + " -----> usando somaVarArgs ");
    }

    // se tiver mais de um parametro, o varargs tem que ser o último para que o Java consiga entender
    public void somaVarArgs2 (int number, int...theArray) {
        int soma = 0;
        int somaTotal = 0;
        for(int aux : theArray) {
            soma+=aux;
        }

        somaTotal = soma + number;
        System.out.println("o total de PCs vendidos foi de: " + somaTotal + " -----> usando somaVarArgs2 ");
    }

}
