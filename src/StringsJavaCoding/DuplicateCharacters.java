package StringsJavaCoding;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String str = "programming"; // Example string

        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count character occurrences
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

}
