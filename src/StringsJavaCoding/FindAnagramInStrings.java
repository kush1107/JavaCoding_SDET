package StringsJavaCoding;

import java.util.Arrays;

/***
 *
 * Program to find two strings are anagrams of each other
 * ( if the strings are anagrams, then their characters will be the same)
 *
 * */

public class FindAnagramInStrings {

    public static void main(String[] args) {

        String str1 = "silent";
        String str2 = "listen";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }


    public static boolean isAnagram(String str1, String str2)
    {
         char[] result1_array,result2_array;

         //Case 1 - Check null values
         if(str1 == null || str2 ==null){
             return false;
         }

        //Case 2 - Check length of strings are equal
         if(str1.length()!=str2.length()){
             return false;
         }

        //Case 3 - Check all characters of strings are same
         result1_array = str1.toCharArray();
        result2_array = str2.toCharArray();

        //Sorting the char arrays
        Arrays.sort(result1_array);
        Arrays.sort(result2_array);

        return Arrays.equals(result1_array, result2_array);

    }
}
