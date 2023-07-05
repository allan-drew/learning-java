package br.com.cursojava.aintro;

public class ControleFluxo1 {

    public static void main(String[] args) {

        int a = 10;

        if (a > 5) {
            System.out.println("é maior do que 5");
        }

        // ==================
        // se tiver apenas uma instrucao, nao é necessário usar chaves
        if (a > 7)
            System.out.println("é maior do que 7");
        // ==================

        if (true)
            System.out.println("entrou no if");
        // ==================

        if (a == 10)
            System.out.println("sim, 'a' é igual a 10");


        // CUIDADO !!!!!!!!!
        boolean c = false;

        if (c = true) // aqui está sendo feita uma atribuicao (e nao comparacao), portanto, cuidado!!
            System.out.println("entrou no if c = true");
        // ==================

        // comparando :
        boolean d = false;
        if (d == true)
            System.out.println("c é verdadeiro");



        // ======================
        System.out.println();
        // ======================


        // Java if...else (if-then-else) Statement
        String nome = "GABIGOL";

        if (nome == "GABIGOL") {
            System.out.println("Nome é GABIGOL");
        } else {
            System.out.println("nome não é GABIGOL");
        }


        // Usando else if...

        int number = 0;

        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        else if (number < 0) {         // checks if number is less than 0
            System.out.println("The number is negative.");
        }
        else {        // if both condition is false
            System.out.println("The number is 0.");
        }



        // ======================
        System.out.println();
        // ======================



        // ATENÇÃO !!!!!!!!!!!!!
        // ao retirar o ultimo else, por exemplo, o codigo da erro de compilacao
        // pois variaveis declaradas dentro de um método precisam ser inicializadas (terem valores atribuidos),
        // e o código roda dentro do método main.

        // Deixando o ultimo else, sempre a variavel categoria será inicializada!
        // ou com crianca, ou com adolescente ou com adulto
        int idade = 32;
        String categoria;
        boolean isCrianca = idade < 13;
        boolean isAdolescente = idade >= 13 && idade < 18;

        if (isCrianca) {
            categoria = "é uma crianca";
        } else if (isAdolescente) {
            categoria = "é um adolescente";
        } else {
            categoria = "é um adulto";
        }

        System.out.println(categoria);


        int anosExperiencia = 4;
        boolean isSenior = anosExperiencia >= 7;

        if(isSenior){ // false
            System.out.println("é um senior");
        }

        // usando o !
        if (!isSenior) { // true
            System.out.println("não é senior");
        }


        // ======================
        System.out.println();
        // ======================


        // Java Ternary Operator
        // The ternary operator (conditional operator) is shorthand for the if-then-else statement.

        // variable = Expression ? expression1 : expression2
        // variable = Expression ? true : false

        int altura = 30;

        String resultAltura;
        resultAltura = (altura > 20) ? "altura maior que 20 metros" : "altura menor ou igual a 20 metros";
        // Neste caso, as expressoes 1 e 2 precisam ser do tipo string pois resultAltura é uma String

        System.out.println(resultAltura);

        // ===========================
        boolean isSinalVerde = true;
        String resultSinal;
        resultSinal = (isSinalVerde) ? "pode passar" : "pare";
        // Neste caso, as expressoes 1 e 2 precisam ser do tipo string pois resultAltura é uma String

        System.out.println(resultSinal);


        // ======================
        System.out.println();
        // ======================


        // Operador ternario dentro de operador ternario (evitar o uso):
        double alturaHomem = 1.70;
        String resultAlturaHomem;

        resultAlturaHomem = (alturaHomem < 1.65) ? "baixo" :
                (alturaHomem >= 1.65 && alturaHomem <1.80) ? "médio" : "alto";
        System.out.println(resultAlturaHomem);


        // =========================
        double pesoHomem = 150; // 150 kgs
        int status;

        status = (pesoHomem > 100) ? 1 : 2;
        // Neste caso, as expressoes 1 e 2 precisam ser do tipo int pois status é um inteiro

        System.out.println("o status é: " + status);


        // =================================
        // se colocar direto no print, então pode misturar string com int
        System.out.println (pesoHomem > 100 ? "acima do peso" : 2);



        // ======================
        System.out.println();
        // ======================


        // CUIDADO!!!!
        double salario = 2000;

        // Vai entrar nos dois ifs pois estamos utilizando if e if (e nao estamos usando else if)
        if (salario >= 2000) {
            System.out.println("primeiro if");
        }
        if (salario <= 2000) {
            System.out.println("segundo if");
        }

        // ======================
        // Neste caso, só entra no primeiro if
        // pois o outro é else if
        // o else if ficará inválido pois o Java já encontrou como verdadeiro o primeiro if
        double salarioEng = 5000;

        if (salarioEng >= 5000) {
            System.out.println("primeiro if salarioEng");
        } else if (salarioEng <= 5000) {
            System.out.println("segundo if salarioEng");
        }


    }

}
