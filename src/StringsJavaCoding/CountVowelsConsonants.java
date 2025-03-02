package StringsJavaCoding;

public class CountVowelsConsonants {

    public static void main(String[] args){

        String input = "Automation Testing";
        input = input.toLowerCase(); // converting to lower case
        int count_vowels =0 ,count_consonants=0;

        //Here we need to check two case : 1)char from a,e,i,o,u as vowels 2) Special characters or spaces

        for(char c : input.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count_vowels++;
            } else if (c >= 'a' && c <= 'z')  {
                count_consonants++;
            }

        }

        System.out.println("Number of vowels: " + count_vowels);
        System.out.println("Number of consonants: " + count_consonants);
    }
}
