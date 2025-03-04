package StringsJavaCoding;

public class SeparateAlphabetsNumbers {
    public static void main(String[] args) {
        String str = "Subbu123raj";
        System.out.println("Given string is " + str);

        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                numbers.append(ch);
            }
        }

        System.out.println("Output - Letters : "+letters.toString()); // Output: Subburaj
        System.out.println("Output - Numbers : "+numbers.toString()); // Output: 123
    }
}
