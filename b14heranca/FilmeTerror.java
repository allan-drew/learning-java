package br.com.cursojava.b14heranca;


// Fazendo a Herança...
    // FilmeTerror ==> subclass (child or derived class)
    // Filme ==> superclass (parent or base class).
public class FilmeTerror extends Filme {
                // atencao: heranca multipla nao existe no Java
                // (In multiple inheritance, a single subclass extends from multiple superclasses)
    private int idadeMinima;

    // sobrescrita (método com mesma assinatura da classe Pai)
    // The same method in the subclass overrides the method in superclass ===> imprimeinfo()
    // In such a situation, the 'super' keyword is used to call the method of the parent class from the method of the child class.
                // atencao : It is NOT mandatory to use @Override when overriding a method.
                // However, if we use it, the compiler gives an error if something is wrong
                // (such as wrong parameter type) while overriding the method.
    public void imprimeInfo() {
        super.imprimeInfo(); // executa o método da maneira como está na classe Filme (classe pai), mas...
                            // ...assim como o 'this', 'super' se refere ao objeto em si...
                            // ...portanto, vai chamar os atributos do objeto instanciado em filme de terror
        System.out.println("A classificacao indicativa do filme é : " + this.getIdadeMinima()); //
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

}
