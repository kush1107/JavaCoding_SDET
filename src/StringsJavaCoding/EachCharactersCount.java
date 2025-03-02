package StringsJavaCoding;

import java.util.HashMap;
import java.util.Map;

public class EachCharactersCount {

    public static void main(String[] args) {
        String str = "hello world"; // Example string

        str = str.replace(" ", ""); // Replace spaces

        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print character occurrences
        System.out.println("Character occurrences in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}
