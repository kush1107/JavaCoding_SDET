package BasicJavaCoding;

import java.util.Scanner;

public class OddEvenNumber {

        public static void main(String[] args) {
            //Taking user input from console
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter any number: ");
            int num = scanner.nextInt();
            scanner.close();

            if (num % 2 == 0) {
                System.out.println(num + " is an even number.");
            } else {
                System.out.println(num + " is an odd number.");
            }
        }
}
