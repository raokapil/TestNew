package Program;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Reverse string recursively :" + reverseRecursively("kapil"));
        System.out.println("Reverse string recursively :" + reverseIteratively("kapil"));
    }

    private static String reverseIteratively(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    private static String reverseRecursively(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverseRecursively(str.substring(0, str.length()-1));
    }
}
