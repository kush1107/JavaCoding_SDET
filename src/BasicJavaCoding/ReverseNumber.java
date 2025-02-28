package BasicJavaCoding;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;  // Get the last digit
            reversedNumber = reversedNumber * 10 + lastDigit;  // Append last digit
            number /= 10;  // Remove last digit from number
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}
