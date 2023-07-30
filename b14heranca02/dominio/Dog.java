package br.com.cursojava.b14heranca02.dominio;

public class Dog extends Animal {


    public void relatorioDoBicho () {
        System.out.println("O nome é " + this.name);
                // O acesso a name está protected, mas ainda sim é possível o acesso
                // pois Dog é uma subclasse de Animal

//        System.out.println("O nome é " + this.idade);
                // Não é possível acessar a idade pela subclasse pois idade está como private.
                // Para acessá-la, seria necessário um método set/get
    }


}
