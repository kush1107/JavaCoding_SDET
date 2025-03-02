package StringsJavaCoding;


public class PrintDoubleLetters {

    public static void main(String[] args) {
        String input = "Testing";

        System.out.println("Output:");
        printDoubleLetters(input);
    }

    public static void printDoubleLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print("" + str.charAt(i) + str.charAt(i)); // Single print statement
        }
    }
}
