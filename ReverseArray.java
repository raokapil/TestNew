package Program;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        String[] arr = {"abc","def","ghi","jkl","mno","pqr"};
        System.out.println(Arrays.toString(arr));
        reverseArrayInPlace(arr);
        System.out.println(Arrays.toString(arr));

        String str = "kapil";
        System.out.println(str);
        String reversedString = reverseStringInPlace(str);
        System.out.println(reversedString);

    }

    private static void reverseArrayInPlace(String[] arr) {
        if (arr == null && arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    private static String reverseStringInPlace(String str) {

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 -i];
            charArray[charArray.length - 1 -i] = temp;
        }

        return new String(charArray);

    }


}
