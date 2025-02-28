package BasicJavaCoding;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        // Taking user input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scanner.nextInt();
        scanner.close();

        // Prime number check
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Exit loop early if not prime
                }
            }
        }
        // Display result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
