package Program;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("army","mkry") ? "Anagram strings" : "Non-Anagram strings");
    }

    private static boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }

        char[] charArray = word.toCharArray();
        for (char ch : charArray) {
            int index = anagram.indexOf(ch);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }
}
