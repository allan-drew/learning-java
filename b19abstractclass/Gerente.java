package br.com.cursojava.b19abstractclass;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    // Implementando na subclasse um método que foi marcado como abstract na superclasse
    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario*0.20;
    }
}
