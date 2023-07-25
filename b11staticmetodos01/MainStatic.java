package br.com.cursojava.b11staticmetodos01;

// O método main em Java é estático porque não precisa de uma instância da classe para ser chamado.
// O main não pertence a uma instância em particular.
// Logo, o método main existe antes do objeto/instância ser criado.

// Com isso, conseguimos acesso a atributos static (que pertencem à classe),
// porém não temos acesso a atributos não static (que pertencem a uma instância em particular).

public class MainStatic {

    String testEnglish = "Hello World";
    static String testPortuguese = "Olá mundo";

    public static void main(String[] args) {

        // Non-static field 'testEnglish' cannot be referenced from a static context
        // System.out.println(testEnglish);

        // Para ser possível acessar o atributo não static dentro do método main, é necessário criar uma instância da classe MainStatic
        MainStatic language01 = new MainStatic();
        System.out.println(language01.testEnglish);

        //---------------------
        System.out.println(testPortuguese);

        // ----
        // O método main também é público porque precisa ser acessível de fora da classe.
        // A JVM precisa ser capaz de chamar o método main, e ela só pode fazer isso se o método for público.

    }

}
