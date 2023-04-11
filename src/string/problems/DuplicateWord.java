package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {


        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String[] words = st.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println("Duplicate words and their number of occurrences: ");
        for (Map.Entry<String, Integer> entry: wordCount.entrySet()){
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()+ ": " + entry.getValue());
            }
        }

        int wordLengthSum = 0;
        for (String word: words) {
            wordLengthSum += word.length();
        }
        double averageLength = (double) wordLengthSum / words.length;
        System.out.println("Average length of words: " + averageLength);





    }

}
