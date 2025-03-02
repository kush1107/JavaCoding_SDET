package StringsJavaCoding;

public class PalindromeStrings {
    public static void main(String[] args) {

        String inputString = "Mom";

        String revStr = "";

        for (int i = inputString.length() - 1; i >= 0; i--) {
            revStr = revStr + inputString.charAt(i);
        }

        if (inputString.equalsIgnoreCase(revStr)) {

            System.out.println("Given String is Palindrome...");
        } else {
            System.out.println("Given String is not Palindrome..");
        }

    }
}
