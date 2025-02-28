package BasicJavaCoding;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        // Taking user input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number range: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci series till " + n + "th term is:");
        scanner.close();

        int first = 0, second = 1, next;
        System.out.println("Fibonacci series is ");
        for ( int i = 0; i<=n; i++)
        {
            System.out.println(first + "");
            next = first + second;
            first = second;
            second = next;
        }
    }
}
