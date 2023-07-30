package br.com.cursojava.b21polimorfismo00;

public class Test {

    public static void main(String[] args) {

        // criando um objeto da classe Java e atribuindo este objeto a uma referência do tipo Java
        Java j1 = new Java();
        j1.displayInfo();
            // o "controle remoto" Java j1 possui o botão displayInfo
            // o objeto do tipo Java executa o "Java Programming Language"

        Java j2 = new Java();
        j2.infoAboutJava();
            // o "controle remoto" Java j2 possui o botão infoAboutJava
            // o objeto do tipo Java executa o "Java is a high-level, class-based, object-oriented programming language"

        // criando um objeto da classe Language e atribuindo este objeto a uma referência do tipo Language
        Language l1 = new Language();
        l1.displayInfo();
            // o "controle remoto" Language l1 possui o botão displayInfo
            // o objeto do tipo Language executa o "Common English Language"

        System.out.println("---------------------------------");

        // criando um objeto da classe Java e atribuindo este objeto a uma referência do tipo Language
        Language l2 = new Java();
        l2.displayInfo();
            // o "controle remoto" Language l2 possui o botão displayInfo
            // o objeto do tipo Java executa o "Java Programming Language"

        // criando um objeto da classe Java e atribuindo este objeto a uma referência do tipo Language
        Language l3 = new Java();
//        l3.infoAboutJava();
            // o "controle remoto" Language l3 NÃO POSSUI o botão infoAboutJava
            // portanto, não conseguimos executar

    }

}
