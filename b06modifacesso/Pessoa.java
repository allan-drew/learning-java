package br.com.cursojava.b06modifacesso;

public class Pessoa {

    // There are four access modifiers keywords in Java and they are:
                //Default	declarations are visible only within the package (package private)
                            // If we do not explicitly specify any access modifier for classes, methods, variables, etc,
                            // then by default the default access modifier is considered.
                            // The class is visible to all the classes that belong to the package
                //Private	declarations are visible within the class only
                //Protected	declarations are visible within the package or all subclasses
                //Public	declarations are visible everywhere

    // The principle of ENCAPSULATION says that these properties should NOT be public
    // So, the way to change the value the data that you store inside these properties
    // should be really USING METHODS that you expose and then you give access to those methods to your users
    private String nome;
    private int idade;

    // ao colocar os atributos como private, a classe PessoaTest perde o acesso direto a nome e idade
    // Para ter este acesso, podemos usar métodos para se ter o acesso, colocando-os como public
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Ou..........
        //    public void setNome (String theName) {
        //        nome = theName; // Neste caso, não precisa do this, mas é uma boa prática usá-lo
        //    }


    public void setIdade (int idade) {
        if (idade < 0) {
            System.out.println("a idade é inválida.");
            return; // neste caso, return funciona como break
        }
        this.idade = idade;
    }

    // para pegar o nome, o retorno precisa ser String
    public String getNome() {
        return this.nome;
    }

    // para retornar a idade, o retorno precisa ser int
    public int getIdade() {
        return this.idade;
    }


    public void imprimirInfo () {
        System.out.println("o nome é => " + this.nome);
        System.out.println("a idade é => " + this.idade);

    }


}
