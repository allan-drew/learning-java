package br.com.cursojava.b18enum;


// In Java, an enum (short for enumeration) is a type that has a fixed set of constant values.
// We use the 'enum' keyword to declare enums.

// ------------------------------------------------------------------------------------------------
// A enumeracao faz sentido quando temos que fazer uma escolha dentro de uma quantidade limitada de opcoes,
// e é necessário forçar o tipo a ser utilizado.
// ------------------------------------------------------------------------------------------------

// TipoCarro é uma enumeracao (um tipo especial de classe). Todos os atributos são constantes.
public enum TipoCarro {
    HATCH,
    SEDAN,
    SUV
}

// ------------------------------------------------------------------------------------------------
// Ao criarmos uma enumeracao, podemos forçar a pessoa que está trabalhando no código
// a passar apenas um dos tipos informados e da exata maneira como está escrita
            // it is guaranteed that the variable will hold one of the 3 values (HATCH, SEDAN or SUV).
            // Now, If we try to pass values other than those values, the compiler will generate an error.
// ------------------------------------------------------------------------------------------------

// ------------------------------------------------------------------------------------------------
// Dependendo do que queremos, não faz sentido criar uma enumeracao.
    // Por exemplo, no caso do exemplo da Moto, nao faz sentido criar
    // uma enumeracao para a constante VELOCIDADE_LIMITADA, pois é um valor único
// ------------------------------------------------------------------------------------------------

// ------------------------------------------------------------------------------------------------
// Why Java Enums???
// In Java, enum was introduced to replace the use of int constants.
        //class Size {
        //    public final static int SMALL = 1;
        //    public final static int MEDIUM = 2;
        //    public final static int LARGE = 3;
        //    public final static int EXTRALARGE = 4;
        //}
// Here, the problem arises if we print the constants. It is because only the number is printed which might not be helpful.
// instead of using int constants, we can simply use enums

        //enum Size {
        //    SMALL, MEDIUM, LARGE, EXTRALARGE
        //}
// ------------------------------------------------------------------------------------------------

