package StringsJavaCoding;

public class ExtractLowerUpperCharacter {

    public static void main(String[] args) {
        String str = "aBACbcEDed";

        System.out.println("Given string is " + str);

        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                lowerCase.append(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                upperCase.append(ch);
            }
        }

        System.out.println("String to lowercase is : "+lowerCase.toString()); // Output: abcde
        System.out.println("String to uppercase is : "+upperCase.toString()); // Output: ABCDE
    }
}
