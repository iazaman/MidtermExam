package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {

        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        System.out.println(wordNLength.get(wordNLength.keySet().iterator().next()));

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String[] words = wordGiven.split("\\s+");
        int maxLength = 0;
        String determineLongestWord = "";

        for (String word: words) {
            if(word.length() > maxLength) {
                maxLength = word.length();
                determineLongestWord = word;
            }
        }
        map.put(maxLength, determineLongestWord);



        return map;
    }
}
