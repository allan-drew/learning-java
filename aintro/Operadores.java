package br.com.cursojava.aintro;

public class Operadores {

    public static void main (String[] args) {

        // 1. Java Arithmetic Operators

        // +	Addition
        //-	Subtraction
        //*	Multiplication
        // / Division
        //%	Modulo Operation (Remainder after division)

        int numero_1 = 100;
        int numero_2 = 200;

        System.out.println(numero_1 + numero_2); // Java entende como adição

        // em Java, o operador "+" é sobrecarregado, portanto, pode se comportar de diferentes maneiras:

        // adição (string está depois):
        System.out.println(numero_1 + numero_2 + " é a soma");

        // concatenação (string está antes) (CUIDADO!!)
        System.out.println("A soma é " + numero_1 + numero_2);

        //alternativa 1 - utilizar outra variável:
        int soma = numero_1 + numero_2;
        System.out.println("(alternativa 1) A soma é --> " + soma);

        //alternativa 2 - utilizar parenteses
        System.out.println("(alternativa 2) A soma é --> " + (numero_1 + numero_2));

        // ======================
        System.out.println();
        // ======================

        System.out.println("A divisao é : " + (numero_1/numero_2)); //dá zero pois são inteiros

        double resultDiv = numero_1/ (double) numero_2;
        System.out.println("Divisão com type casting --> " + resultDiv); // dá 0.5, pois fizemos o type casting

        System.out.println("A multiplicacao é : " + (numero_1*numero_2));

        System.out.println("A substracao é : " + (numero_1 - numero_2));


        // ======================
        System.out.println();
        // ======================

        System.out.println("O resto da divisao é : " + (numero_1 % numero_2));
        System.out.println("O resto da divisao é : " + (numero_2 % numero_1));
        System.out.println("O resto da divisao é : " + (20%2)); //resto 0, portanto numero par
        System.out.println("O resto da divisao é : " + (21%2)); //resto 1, portanto numero impar

        // ======================
        System.out.println();
        // ======================


        // 2. Java Assignment Operators
        // used in Java to assign values to variables.
        //                Operator	Example	    Equivalent to
        //                =	        a = b;	    a = b;
        //                +=	    a += b;	    a = a + b;
        //                -=	    a -= b;	    a = a - b;
        //                *=	    a *= b;	    a = a * b;
        //                /=	    a /= b;	    a = a / b;
        //                %=	    a %= b;	    a = a % b;

        int a = 10;
        System.out.println("printando a : " + a);

        int b = 5;

        a += b; // a = a + b
        System.out.println("printando a : " + a);



        // ======================
        System.out.println();
        // ======================


        // 3. Java Relational Operators
        // used to check the relationship between two operands

        //              Operator	Description	                Example
        //                ==	    Is Equal To	                3 == 5 returns false
        //                !=	    Not Equal To	            3 != 5 returns true
        //                >	        Greater Than	            3 > 5 returns false
        //                <	        Less Than	                3 < 5 returns true
        //                >=    	Greater Than or Equal To	3 >= 5 returns false
        //                <=	    Less Than or Equal To	    3 <= 5 returns true

        double alturaPessoa1 = 1.78;
        double alturaPessoa2 = 1.80;
        System.out.println(alturaPessoa1 == alturaPessoa2);

        System.out.println(alturaPessoa1 != alturaPessoa2);

        int idade01 = 25;
        int idade02 = 30;
        boolean isIdade01MaiorQueIdade02 = idade01 > idade02;
        System.out.println("isIdade01MaiorQueIdade02    " + isIdade01MaiorQueIdade02);

        // ======================
        System.out.println();
        // ======================


        // 4. Java Logical Operators
        // Logical operators are used to check whether an expression is true or false.

        // && (Logical AND)
        // || (Logical OR)
        // ! (Logical NOT)

        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true

        // ! operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false


        // ======================
        System.out.println();
        // ======================


        // 5. Java Unary Operators
        // used with only one operand.

        //        Operator	Meaning
        //        +	        Unary plus: not necessary to use since numbers are positive without using it
        //        -	        Unary minus: inverts the sign of an expression
        //        ++	    Increment operator: increments value by 1
        //        --	    Decrement operator: decrements value by 1
        //        !	        Logical complement operator: inverts the value of a boolean

        System.out.println("Java Unary Operators...");

        // prefixes (++a, --b). We can also use postfix (a++, b++).
        // ***** There is a slight difference when these operators are used as prefix versus when they are used as a postfix.
        int incr = 0;
        incr++;
        System.out.println(incr); // resultado 1

        ++incr;
        System.out.println(incr); // resultado 2

        System.out.println(++incr); // resultado 3

        System.out.println(incr++); // resultado 3 (printou e depois incrementou)
        System.out.println(incr); // resultado 4 (printou o incrementado anteriormente)



        int variavel2 = 20;
        System.out.println(-variavel2); // unary minus


        // ======================
        System.out.println();
        // ======================


        // Java instanceof Operator
        // checks whether an object is an instanceof a particular class.
        String primeiroNome = "Allan";
        boolean resultado;

        // checando se primeiroNome é uma instanceof da classe String
        resultado = primeiroNome instanceof String;

        System.out.println(primeiroNome + " é uma instanceof de String ? " + resultado);


        // ======================
        System.out.println();
        // ======================


        // Java Ternary Operator
        // The ternary operator (conditional operator) is shorthand for the if-then-else statement.
        // variable = Expression ? expression1 : expression2

        int idade = 30;

        String resultIdade;
        resultIdade = (idade > 18) ? "maior de idade" : "menor de idade";

        System.out.println(resultIdade);


        // ======================
        System.out.println();
        // ======================

        int v1 = 10;
        int v2 = 20;

        v1 *= 3 + 5;
        v2 *= 3 + 5;

        System.out.println(v1);
        System.out.println(v2);




    }

}
