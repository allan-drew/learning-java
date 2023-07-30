package br.com.cursojava.b21polimorfismo02;

public class Test {

    public static void main(String[] args) {

        // create an object of Square
        Square s1 = new Square();
        s1.render();

        // create an object of Circle
        Circle c1 = new Circle();
        c1.render();

        //==================== Why Polymorphism? ============================ //
        /*
         Polymorphism allows us to create consistent code.
         In the previous example, we can also create different methods:
         renderSquare() and renderCircle() to render Square and Circle, respectively.

        This will work perfectly.
         However, for every shape, we need to create different methods. It will make our code inconsistent.

        To solve this, polymorphism in Java allows us to create a single method render()
         that will behave differently for different shapes.


         We can achieve polymorphism in Java using the following ways:
             - Method Overriding
             - Method Overloading
             - Operator Overloading

         Conferir: https://www.programiz.com/java-programming/polymorphism
        */

    }

}
