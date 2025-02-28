package StringsJavaCoding;

public class ReverseEachWord {
    public static void main(String[] args) {
        String inputString = "Hello Automation Testers";
        String[] words = inputString.split(" ");
        String reverseString = "";
        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String rev = "";
            char ch;
            for (int j = 0; j < word.length(); j++)
            { ch = word.charAt(j);
                rev = ch + rev;
            }
            reverseString = reverseString + rev + " ";

        }
        System.out.println("Input String is : "+inputString);
        System.out.println("Reverse strings with each words: "+reverseString);
    }
}
