package br.com.cursojava.b05paramArray;

public class ComputadorTest {

//    public static void main(String[] args) {
    public static void main(String... args) { // a sintaxe do var args também funciona no método main

        Computador computador1 = new Computador();
        computador1.marcaDoComputador = "DELL";
        computador1.precoDoComputador = 3000;
        computador1.InfoImprime();

        // ----------------------------------------------------
        int[] nums = {4, 5, 6, 1};
        computador1.somaArray(nums); // passando array para o método

        computador1.somaArray(new int[]{0, 5, 6, 1}); // passando diretamente array para o método:

        computador1.somaVarArgs(4, 5, 61, 10); // passando array para o método que usa varargs

        computador1.somaVarArgs2(2, 4, 50, 6, 1); // passando numero e array para o segundo método que usa varargs

    }

}
