package StringsJavaCoding;

import java.util.HashSet;

public class LongestNoRepeatingSubstring {

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "";

        System.out.println("Longest substring in \"" + s1 + "\": " + findLongestUniqueSubstring(s1));
        System.out.println("Longest substring in \"" + s2 + "\": " + findLongestUniqueSubstring(s2));
        System.out.println("Longest substring in \"" + s3 + "\": " + findLongestUniqueSubstring(s3));
        System.out.println("Longest substring in \"" + s4 + "\": " + findLongestUniqueSubstring(s4));
    }

    public static String findLongestUniqueSubstring(String str) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0, left = 0;
        String longestSubstring = "";

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                longestSubstring = str.substring(left, right + 1);
            }
        }
        return longestSubstring + ", length: " + maxLength;
    }
}
