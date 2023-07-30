package br.com.cursojava.b19abstractclass;

public class Developer extends Funcionario {

    public Developer(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    // Implementando na subclasse um método que foi marcado como abstract na superclasse
    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario*0.05;
    }

}
