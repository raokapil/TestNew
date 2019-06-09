package Program;

public class FibonacciNumber {
    public static void main(String[] args) {
        fibonacci(11);
    }

    private static void fibonacci(int number) {

        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacciWithRecursion(i)+ " ");
        }

        System.out.println();

        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacciWithIteration(i)+ " ");
        }

    }

    private static int fibonacciWithIteration(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        int f1 = 1, f2 = 1, fact = 1;
        for (int i = 3; i <= number; i++) {
            fact = f1 + f2;
            f1 = f2;
            f2 = fact;
        }
        return fact;
    }

    private static int fibonacciWithRecursion(int number) {

        if (number == 1 || number == 2) {
            return 1;
        }

        return fibonacciWithRecursion(number-1) + fibonacciWithRecursion(number-2);
    }

}
