package StringsJavaCoding;


public class StringCompression {
    public static void main(String[] args) {
        String str = "aabbcccdd";
        System.out.println("Entered string is : " + str);

        System.out.println("Compressed Output: " + compressString(str));
    }

    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i)).append(count);
                count = 1; // Reset count for next character
            }
        }

        return compressed.toString();
    }
}
