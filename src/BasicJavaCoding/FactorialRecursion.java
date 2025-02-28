package BasicJavaCoding;

import java.util.Scanner;

public class FactorialRecursion {

    // Recursive method to calculate factorial
    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1; // Edge case: factorial of 0 and 1 is 1
        }
        return num * factorial(num - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 6;

        // Calling the recursive function
        long result = factorial(num);

        // Displaying the factorial result
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
