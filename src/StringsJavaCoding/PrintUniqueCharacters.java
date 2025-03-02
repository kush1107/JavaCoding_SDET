package StringsJavaCoding;

import java.util.HashMap;

public class PrintUniqueCharacters {

    public static void main(String[] args) {
        String str = "Automation"; // Example input
        printUniqueCharacters(str);
    }

    public static void printUniqueCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print unique characters (characters that appear only once)
        System.out.print("Unique characters: ");
        for (char ch : str.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                System.out.print(ch + " ");
            }
        }
    }
}
