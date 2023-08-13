package br.com.cursojava.b22exceptions08;

public class RuntimeExceptionTest06 {

    public static void main(String[] args) {

        // Multi catch em linha
        try {
            throw new IllegalArgumentException();

        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            // Multi catch em linha...
            // não fazer com classes na mesma linha de heranca. Por isso arrayindex e indexout não estão
            // juntas no multi catch em linha (Types in multi-catch must be disjoint)
            System.out.println("arrayIndexOut or illegal or arithmetic...");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("indexOut...");
        } catch (RuntimeException e){
            System.out.println("runtime...");
        }


    }



}
