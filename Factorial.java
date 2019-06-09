package Program;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial: " + factorialRecursive(5));
        System.out.print("Factorial: " + factorialIterative(6));
    }

    private static int factorialIterative(int num) {
        int result = 1;
        while (num > 0) {
            result = result * num;
            num --;
        }
        return result;
    }

    private static int factorialRecursive(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorialRecursive(num - 1);
    }
}
