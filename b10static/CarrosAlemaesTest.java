package br.com.cursojava.b10static;

public class CarrosAlemaesTest {

    public static void main(String[] args) {

        CarrosAlemaes carro01 = new CarrosAlemaes("Audi", 250);
        CarrosAlemaes carro02 = new CarrosAlemaes("BMW", 230);
        CarrosAlemaes carro03 = new CarrosAlemaes("Mercedes", 220);


        carro01.imprimeinfo();
        carro02.imprimeinfo();
        carro03.imprimeinfo();

        System.out.println("=========================================");

        // Alterando a velocidade limitada (que possui o static)
        carro01.setVelocidadeLimitada(200);
                // mesmo alterando apenas no carro01, a mudança reflete em todos os outros objetos

        carro01.imprimeinfo();
        carro02.imprimeinfo();
        carro03.imprimeinfo();

    }

}
