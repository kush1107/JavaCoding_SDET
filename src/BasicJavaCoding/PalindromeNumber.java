package BasicJavaCoding;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int reversed = 0;
        int original = num;

        while (num > 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }

        if (reversed == original) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
