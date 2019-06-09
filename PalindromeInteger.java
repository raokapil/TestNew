package Program;

public class PalindromeInteger {
    public static void main(String[] args) {
        System.out.println(isPalindrome(45212154) ? "Palindrome number" : "Not a palindrome number");
    }

    private static boolean isPalindrome(int num) {
        int temp = num, reverse = 0;

        while (temp > 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }

        if (num == reverse) {
            return true;
        }
        return false;
    }
}
