package codingWithMosh;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharater {

    public static void main(String[] args) {
        System.out.print(firstRepeatedChar("a green apple"));
    }

    private static char firstRepeatedChar(String s) {
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
