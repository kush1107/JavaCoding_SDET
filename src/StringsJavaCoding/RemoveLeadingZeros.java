package StringsJavaCoding;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        String str = "32400121200";
        System.out.println("Removing leading zeros from " + str);
        String output = moveZerosToEnd(str);
        System.out.println("Output: " + output);
    }

    public static String moveZerosToEnd(String input) {
        StringBuilder nonZeroDigits = new StringBuilder();
        int zeroCount = 0;

        // Loop through characters and separate zeros
        for (char c : input.toCharArray()) {
            if (c == '0') {
                zeroCount++;  // Count zeros
            } else {
                nonZeroDigits.append(c); // Collect non-zero digits
            }
        }

        // Append zeros at the end
        while (zeroCount-- > 0) {
            nonZeroDigits.append('0');
        }
        return nonZeroDigits.toString();

    }
}

