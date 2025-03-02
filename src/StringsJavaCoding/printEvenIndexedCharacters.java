package StringsJavaCoding;

import java.util.Scanner;

public class printEvenIndexedCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close(); // Close the scanner to avoid resource leaks

        System.out.println("Even indexed characters in \"" + input + "\":");
        printEvenIndexedCharacters(input);
    }

    public static void printEvenIndexedCharacters(String str) {
        for (int i = 0; i < str.length(); i += 2) { // Increment by 2 for even index
            System.out.print(str.charAt(i));
        }
    }
}
