package BasicJavaCoding;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int sum = 0;
        int remainder;

        while (number > 0) {
            remainder = number % 10;
            sum = sum + (remainder * remainder * remainder);
            number = number / 10;
        }

        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
