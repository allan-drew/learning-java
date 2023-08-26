package br.com.cursojava.f01classesinternas;


// classes internas significam uma classe dentro da outra...

// Têm um escopo especial e podem acessar os membros (campos e métodos) da classe externa,
// incluindo os membros privados, como se fossem membros da classe interna.

public class ClasseExternaTest01 {
        // neste exemplo, temos ClasseExternaTest01 como a classe externa
        // e InnerClass como a classe interna.

    private Integer age = 29;

    // ----------------------------------
    // classe interna
    // Inner Class (Classe Interna): classe definida dentro de outra classe. Ela pode acessar os membros da classe externa, mesmo os privados.
    class InnerClass {
        public void printAttribute() {
            System.out.println("the age is " + age); // acesso aos atributos da classe externa (ClasseExternaTest01) a partir da classe interna (InnerClass)
            System.out.println("O this se refere a classe interna ----> " + this);
            System.out.println("Para o this da classe externa, temos ---> " + ClasseExternaTest01.this);
        }
    }
    // ----------------------------------


    public static void main(String[] args) {

        // ----------------
        // primeira maneira:
        ClasseExternaTest01 classeExternaTest01 = new ClasseExternaTest01();
        InnerClass innerClass = classeExternaTest01.new InnerClass(); // criando objeto da classe interna:
        innerClass.printAttribute();

        System.out.println();

        // --------------
        // segunda maneira:
        InnerClass innerClass02 = new ClasseExternaTest01().new InnerClass();
        innerClass02.printAttribute();

        // --------------
        // InnerClass innerClass03 = new InnerClass(); //  cannot be referenced from a static context

    }

}
