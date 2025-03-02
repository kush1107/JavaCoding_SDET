package StringsJavaCoding;

public class CountNumberOfWords {

    public static void main(String[] args) {
        String str = "Hello world! Welcome to Test Automation."; // Example string

        if (str == null || str.trim().isEmpty()) {
            System.out.println("Number of words: 0");
            return;
        }

        String[] words = str.trim().split("\\s+"); // Splitting by spaces
        System.out.println("Number of words: " + words.length);
    }

}
