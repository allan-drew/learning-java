package br.com.cursojava.g05methodreference;

/*
      Method references in Java provide a way to refer to methods without actually invoking them.
      They are often used as shorthand for lambda expressions when the lambda expression just calls a single method.
      Method references can make your code more concise and readable.

  Method references in Java are often used as shorthand for lambda expressions when the lambda expression just calls a single method.

  There are four types of method references in Java:
       1) Reference to a static method;
       2) Reference to an instance method of a particular object;
       3) Reference to an instance method of an arbitrary object of a particular type;
       4) Reference to a constructor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


public class MethodReferenceTest01 {

    // (usando o mesmo exemplo de g04function)....
    private static <T, R> List<R> mapeando(List<T> list, Function<T, R> function) {
        List<R> resultado = new ArrayList<>();

        for (T element : list) {
            R r = function.apply(element);
            resultado.add(r);
        }
        return resultado;
    }


    //----------------------------------------------------------------
    public static void main(String[] args) {

        // --------------------------------------------------------------------------------------------------------
        // 1) Reference to a static method:
        List<String> times = List.of("Barcelona", "Milan", "Internazionale", "Liverpool");

        System.out.println(mapeando(times, (String s) -> s.length())); // usando lambda

        System.out.println("----");

        // This references a static method of a class.

        // The syntax is ClassName::staticMethodName.
        System.out.println(mapeando(times, String::length)); // usando method reference
        // *** obs.: usando a classe String
        // --------------------------------------------------------------------------------------------------------

        System.out.println("==========");

        // --------------------------------------------------------------------------------------------------------
        // 2) Reference to an instance method of a particular object;
        List<String> times02 = List.of("Real Madrid", "Juventus", "Sevilla", "Roma");

        Consumer<String> stringsTimes01 = time -> System.out.println(time);
        times02.forEach(stringsTimes01);

        System.out.println("----");

        // This references an instance method of a particular object.
        // The syntax is objectReference::instanceMethodName.
        Consumer<String> stringsTimes02 = System.out::println;
        times02.forEach(stringsTimes02);
        // --------------------------------------------------------------------------------------------------------

        System.out.println("==========");

        // --------------------------------------------------------------------------------------------------------
        // 3) Reference to an instance method of an arbitrary object of a particular type;
        List<String> names = Arrays.asList("Bob", "Alice", "Endrews", "Charlie", "Duda");

        names.sort((a, b) -> a.compareTo(b)); // usando lambda
        System.out.println(names);

        System.out.println("----");


        // This references an instance method of an arbitrary object of a particular type.
        List<String> names02 = Arrays.asList("Bernard", "Amanda", "Patrick", "Rapha", "Clarice");

        // The syntax is ClassName::instanceMethodName.
        names02.sort(String::compareTo); // usando method reference
        System.out.println(names02);
        // --------------------------------------------------------------------------------------------------------

        System.out.println("==========");


        // --------------------------------------------------------------------------------------------------------
        // 4) Reference to a constructor.

        // A interface Supplier não recebe argumento e retorna T
        Supplier<List<String>> listSupplierLambda = () -> new ArrayList<>(); // usando lambda
        List<String> listFromLambda = listSupplierLambda.get();

        listFromLambda.add("Manchester United");
        listFromLambda.add("Manchester City");
        listFromLambda.add("Chelsea");
        listFromLambda.add("Liverpool");
        listFromLambda.add("Arsenal");

        System.out.println(listFromLambda);

        System.out.println("----");

        // This references a constructor.
        // The syntax is ClassName::new.
        Supplier<List<String>> listSupplierReference = ArrayList::new; // usando method reference
        List<String> listFromReference = listSupplierReference.get();

        listFromReference.add("Porto");
        listFromReference.add("Benfica");
        listFromReference.add("Sporting");

        System.out.println(listFromReference);



    }

}

