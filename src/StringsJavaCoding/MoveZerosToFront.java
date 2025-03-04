package StringsJavaCoding;

public class MoveZerosToFront {

        public static void main(String[] args) {
            String input = "32400121200";
            System.out.println("Input: " + input);
            String output = moveZerosToFront(input);
            System.out.println("Output: " + output);
        }

        public static String moveZerosToFront(String input) {
            StringBuilder nonZeroDigits = new StringBuilder();
            int zeroCount = 0;

            // Separate zeros and count them
            for (char c : input.toCharArray()) {
                if (c == '0') {
                    zeroCount++;  // Count zeros
                } else {
                    nonZeroDigits.append(c);  // Collect non-zero digits
                }
            }

            // Create the final string with zeros in front
            StringBuilder result = new StringBuilder();
            while (zeroCount-- > 0) {
                result.append('0');  // Append zeros first
            }
            result.append(nonZeroDigits);  // Append non-zero digits

            return result.toString();
        }
}
