package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.print(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        /*int[] arr = new int[128];

        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(arr[s.charAt(j)], i);
            char ch = s.charAt(j);
            int dd= arr[s.charAt(j)];
            ans = Math.max(ans, j - i +1);
            arr[s.charAt(j)] = j + 1;
        }*/

        Map<Character, Integer> map = new HashMap<>();

        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }

        return ans;
    }
}
