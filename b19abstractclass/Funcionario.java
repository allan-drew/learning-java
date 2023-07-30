package br.com.cursojava.b19abstractclass;

// The major use of abstract classes and methods is to achieve abstraction in Java.
// The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes).

// ============================================================================================================
// Uma classe abstrata foi feita para ser uma superclasse... pois só podemos criar objetos das subclasses dela...
// Portanto, uma classe 'abstract' é o inverso de uma classe 'final'(que não pode ser feita herança)
// ============================================================================================================

// Para evitarmos a criação de um Funcionario e permitirmos apenas a criação de Developer ou Gerente,
// podemos implementar a classe Funcionario como sendo abstract
public abstract class Funcionario {  // "Funcionario" em si é algo abstrato.

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus(); // chamando o método dentro do construtor para se realizar o cálculo do bonus
        // e imprimir o salário com o toString de Developer e Gerente com salário já calculado com bonus
    }

    // Métodos Abstratos: A method that doesn't have its body is known as an abstract method.
    /* Se a classe abstrata possui algum método abstrato,
    então todas as subclasses que foram herdadas dela
    devem fornecer uma implementação para este método abstrato. */
    public abstract void calculaBonus ();

}




