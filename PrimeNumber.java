package Program;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("isPrime: " + isPrime(2));
        System.out.print("isPrime: " + isPrime(3));
        System.out.print("isPrime: " + isPrimeNumber(4));
    }

    private static boolean isPrimeNumber(int num) {
        if (num == 2 || num == 3) {
            return true;
        }
        if (num == 1 || num == 0 || num % 2 == 0) {
            return false;
        }

        int sqrt = (int) (Math.sqrt(num) + 1);
        for (int i = 3; i < sqrt; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime(int num) {

        if (num == 1 || num == 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(num) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
