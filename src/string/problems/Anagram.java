package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "CAT";
        String str2 = "ACT";
        if (isAnagram(str1, str2)){
            System.out.println(str1+ "and" + str2 + "are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + "are not anagrams.");
        }

    }

    public static boolean isAnagram(String str1, String str2){
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        return Arrays.equals(charArr1,charArr2);

    }



}
