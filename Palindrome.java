package Program;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        System.out.println("Is naman palindrom?: " + isPalindromString("naman"));
        //System.out.println("Is abc palindrom?: " + isPalindromString("abc"));
        //System.out.println("Is 454 palindrom?: " + isPalindromString("454"));
        //System.out.println("Is defg palindrom?: " + isPalindromString("defg"));
    } /** * Java method to check if given String is Palindrome * @param text * @return true if text is palindrome, otherwise false */
    public static boolean isPalindromString(String text) {
        String reverse = reverse(text);
        if (text.equals(reverse)) {
            return true;
        }
        return false;
    } /** * Java method to reverse String using recursion * @param input * @return reversed String of input */
    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        char s1 = input.charAt(input.length() - 1);
        String s2 = input.substring(0, input.length() - 1);
        System.out.println("s1: "+s1+" ,s2: "+s2);
        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
    }
}

