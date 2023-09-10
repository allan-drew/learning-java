package br.com.cursojava.i04parallelstream;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest11 {

    // ------------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors()); // Returns the number of processors available to the Java virtual machine.

        long num = 70_000_000;

        sumForLowLevel(num); // o 'for' nativo tem o melhor desempenho para iterações em LowLevel
        sumStreamGenericIterate(num); // Stream faz a iteracao um por um
        sumParallelStreamGenericIterateNotPerformance(num); // com parallel, sem performance! motivo:

        sumLongStreamIterateNotPerformance(num); // usando LongStream, porém sem parallel

        // Solução:
        // rangeClosed() do LongStream contém valor inicial e final,
        // e por conta disso o java consegue saber como irá distribuir a tarefa entre os nucleos.
        sumParallelLongStreamIteratePerformance(num); // usando LongStream, porém com parallel

    }
    // ------------------------------------------------------------------------------------------------------------------------------------------


    private static void sumForLowLevel(long num) {
        System.out.print("Sum for (nativo Java): ");
        long result = 0;
        long timeInit = System.currentTimeMillis();

        for (long i = 1; i <= num; i++) {
            result += i;
        }

        long timeEnd = System.currentTimeMillis();
        System.out.println(result + " -----> " + (timeEnd - timeInit) + "ms");
    }

    // usa iterate
    private static void sumStreamGenericIterate(long num) {
        System.out.print("Sum StreamIterate genérico: ");
        long timeInit = System.currentTimeMillis();

        long result = Stream.iterate(1L, n -> n + 1).limit(num).reduce(0L, Long::sum);

        long timeEnd = System.currentTimeMillis();
        System.out.println(result + " -----> " + (timeEnd - timeInit) + "ms");
    }

    // usa iterate
    private static void sumParallelStreamGenericIterateNotPerformance(long num) {
        System.out.print("Sum StreamIterate genérico COM parallel: ");
        long timeInit = System.currentTimeMillis();

        long result = Stream.iterate(1L, n -> n + 1).parallel().limit(num).reduce(0L, Long::sum); // com parallel

        long timeEnd = System.currentTimeMillis();
        System.out.println(result + " -----> " + (timeEnd - timeInit) + "ms");
    }

    // LongStream usa rangeClosed
    private static void sumLongStreamIterateNotPerformance(long num) {
        System.out.print("Sum LongStream SEM parallel: ");
        long timeInit = System.currentTimeMillis();

        // rangeClosed especifica o valor final de iteração, logo o java consegue
        // definir e distribuir corretamente as tarefas para as Threads
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);

        long timeEnd = System.currentTimeMillis();
        System.out.println(result + " -----> " + (timeEnd - timeInit) + "ms");
    }

    // LongStream usa rangeClosed
    private static void sumParallelLongStreamIteratePerformance(long num) {
        System.out.print("Sum LongStream COM parallel ** MAIS PERFORMANCE ** : ");
        long timeInit = System.currentTimeMillis();

        // rangeClosed especifica o valor final de iteração, logo o java consegue
        // definir e distribuir corretamente as tarefas para as Threads
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum); // com parallel

        long timeEnd = System.currentTimeMillis();
        System.out.println(result + " -----> " + (timeEnd - timeInit) + "ms");
    }

}

