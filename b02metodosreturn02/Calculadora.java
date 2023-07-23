package br.com.cursojava.b02metodosreturn02;

public class Calculadora {


    // In Java, there are two types of methods:

    // ===============================================================================================================
    // 1) User-defined Methods: We can create our own method based on our requirements.

    // método sem retorno (retorna void):
    public void multiplicaInteiros (int num1, int num2) {  // num1 e num2 são parametros
        System.out.println( num1 * num2 );
    }

    //        The complete syntax of declaring a method is:

    //        modifier static returnType nameOfMethod (parameter1, parameter2, ...) {
    //            // method body
    //        }

    //        static -------> If we use the static keyword, it can be accessed without creating objects.
    //        For example, the sqrt() method of standard Math class is static.
    //        Hence, we can directly call Math.sqrt() without creating an instance of Math class.


    // método com retorno
    // neste exemplo, o tipo de retorno é int
    public int adicao (int num1, int num2) {
        return num1+num2;
    }



    // ===============================================================================================================
    // 2) Standard Library Methods
    //Standard Library Methods: These are built-in methods in Java that are available to use.
    // The standard library methods are built-in methods in Java that are readily available for use.
    // These standard libraries come along with the Java Class Library (JCL) in a Java archive (*.jar) file
    // with JVM and JRE.

    // For example,
    // sqrt() is a method of Math class. It returns the square root of a number.
    // print() is a method of java.io.PrintSteam. The print("...") method prints the string inside quotation marks.


}
