package br.com.cursojava.f01classesinternas;

public class ClasseExternaTest03 {

    private static int valorExterno = 10;
    private int valorExterno02 = 23;

    // Static Nested Class (Classe Aninhada Estática):
    // Uma classe estática definida dentro de outra classe. Ela não possui acesso direto aos membros não estáticos da classe externa.
    public static class ClasseAninhadaEstatica {

        public void mostrarValorExterno() {
            System.out.println(valorExterno);

            // System.out.println(valorExterno02); // erro

            // para ser possível chamar valorExterno02:
            System.out.println(new ClasseExternaTest03().valorExterno02);

        }

    }

    // ------------------------------------------------------------------
    public static void main(String[] args) {

        ClasseAninhadaEstatica classeAninhadaEstatica = new ClasseAninhadaEstatica();
        classeAninhadaEstatica.mostrarValorExterno();
        // Com isso, não precisamos de algum objeto da ClasseExternaTest03

    }

}

