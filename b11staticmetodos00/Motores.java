package br.com.cursojava.b11staticmetodos00;

public class Motores {

    private String nomeMotor;
    private double rpmMaximo;
    private static double rpmLimite;

    public Motores(String nomeMotor, double rpmMaximo) {
        this.nomeMotor = nomeMotor;
        this.rpmMaximo = rpmMaximo;
    }

    public void imprimeInfo() {
        System.out.println("o nome do motor é " + this.nomeMotor);
        System.out.println("O rpm maximo é " + this.rpmMaximo);
        System.out.println("o rpm limitado é " + Motores.rpmLimite);
        System.out.println("-------");
    }


    // Método estático é um método que não depende de instâncias ou objetos.
    // Dentro de metodos statics nao acessamos nenhuma variável nao estatica.
    public static void setRpmLimite(double rpmLimite) {
        Motores.rpmLimite = rpmLimite;

        // System.out.println("o nome do motor é " + this.nomeMotor);
                    // variáveis não estáticas, como nomeMotor, nao podem ser usadas em métodos statics
                    // pois variáveis não estáticas dependem de um objeto
    }

    public static double getRpmLimite() {
        return Motores.rpmLimite;
    }

    // A utilização de métodos static, portanto, poderá ser feita quando esses métodos
    // não acessam atributos de instância (ex.: nomeMotor e rpmMaximo)


}
