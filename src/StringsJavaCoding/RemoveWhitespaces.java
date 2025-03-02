package StringsJavaCoding;

public class RemoveWhitespaces {

    public static void main(String[] args) {
        String input = "H e ll  o Wo   rld";
        String output = input.replaceAll("\\s", "");
        System.out.println("String after removing all the whitespaces : "+output);
    }
}
