package Program;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        printDuplicateCharacters("Mississipi");
    }

    private static void printDuplicateCharacters(String str) {
        char[] charArray = str.toCharArray();

        Map<Character, Integer> characterCountMap = new HashMap<>();
        for (char ch : charArray) {
            if (characterCountMap.containsKey(ch)) {
                characterCountMap.put(ch, characterCountMap.get(ch) + 1);
            } else {
                characterCountMap.put(ch, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = characterCountMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Character: " + entry.getKey() + " ,Count: " + entry.getValue());
            }
        }
    }
}
