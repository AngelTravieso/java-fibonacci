package test;

// https://www.javatpoint.com/
/**
 * In fibonacci series, next number is the sum of previous two numbers for
 * example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of
 * fibonacci series are 0 and 1.
 */
public class TestFibonacci {

    static int n1 = 0, n2 = 1, n3 = 0;
    static final int MAX = 10;

    public static void main(String[] args) {
        // fibonacci sin recursion (con bucle)
//        fibonacciWithOutRecursion(MAX);

        // fibonacci con recursion
        System.out.println("FIBONACCI CON RECURSION");
        System.out.print(n1 + " " + n2);
        fibonacciWithRecursion(MAX - 1);
    }

    // fibonacci sin recursion
    public static void fibonacciWithOutRecursion(int max) {

        System.out.println("FIBONACCI SIN RECURSION:");

        System.out.print(n1 + " " + n2);

        for (int i = 2; i <= max; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
        }

    }

    // fibonacci con recursion
    public static void fibonacciWithRecursion(int n) {

        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(" " + n3);
            fibonacciWithRecursion(n - 1);
        }

    }
}
