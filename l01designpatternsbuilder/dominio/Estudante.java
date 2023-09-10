package br.com.cursojava.l01designpatternsbuilder.dominio;

// O padrão de projeto Builder é um dos padrões de criação (creational design patterns) em Java,
// e é usado quando queremos criar objetos complexos com muitos parâmetros configuráveis.


public class Estudante {

    private String primeiroNome;
    private String sobrenome;
    private Integer idade;
    private String email;
    private String curso;

    // Construtor privado para forçar o uso do Builder
    private Estudante(String primeiroNome, String sobrenome, Integer idade, String email, String curso) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.email = email;
        this.curso = curso;
    }

    // a classe interna (EstudanteBuilder) tem acesso aos atributos da classe externa (Estudante)
    public static class EstudanteBuilder {
        private String primeiroNome;
        private String sobrenome;
        private Integer idade;
        private String email;
        private String curso;

        public EstudanteBuilder criarPrimeiroNome(String primeiroNome) {
            this.primeiroNome = primeiroNome;
            return this;
        }

        public EstudanteBuilder criarSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public EstudanteBuilder criarIdade(Integer idade) {
            this.idade = idade;
            return this;
        }

        public EstudanteBuilder criarCurso(String curso) {
            this.curso = curso;
            return this;
        }

        public EstudanteBuilder criarEmail(String email) {
            this.email = email;
            return this;
        }

        public Estudante build() {
            return new Estudante(primeiroNome, sobrenome, idade, email, curso);
        }


    }

    @Override
    public String toString() {
        return "Estudante {" + "\n" +
                "   primeiroNome= " + primeiroNome + "\n" +
                "   sobrenome= " + sobrenome + "\n" +
                "   idade= " + idade + "\n" +
                "   email= " + email + "\n" +
                "   curso= " + curso + "\n" +
                '}';
    }

}
