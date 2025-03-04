package StringsJavaCoding;

public class AppendCharacterCount {

    public static void main(String[] args) {
        String str = "aabbcccdd";
        System.out.println("Given String is :" +str);
        int n = str.length();
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        result.append(str.charAt(n - 1)).append(count); // Append last character count

        System.out.println("Output is : "+result.toString()); // Output: a2b2c3d2
    }
}
