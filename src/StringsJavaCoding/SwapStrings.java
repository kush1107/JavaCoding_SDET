package StringsJavaCoding;

import java.util.Scanner;

public class SwapStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        scanner.close(); // Close scanner to prevent memory leaks

        System.out.println("\nBefore Swap: ");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Swapping without using third variable
        str1 = str1 + str2;        // Concatenate both strings
        str2 = str1.substring(0, str1.length() - str2.length()); // Extract original str1
        str1 = str1.substring(str2.length()); // Extract original str2

        System.out.println("\nAfter Swap: ");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}
