package codingWithMosh;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashTableFirstNonRepeatedChar {

    public static void main(String[] args) {

        System.out.print(firstNonRepeatedChar("a green apple"));

    }

    private static char firstNonRepeatedChar(String s) {
        Map<Character, Integer> map = new TreeMap<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) +1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            if (item.getValue() == 1) {
                return item.getKey();
            }
        }
        return Character.MIN_VALUE;
    }

}
