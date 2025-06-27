package w2;

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        String text = "Java is simple and Java is powerful. Java is everywhere.";
        text = text.toLowerCase().replaceAll("[^a-z\\s]", "");

        String[] words = text.split("\\s+");
        Map<String, Integer> freqMap = new HashMap<>();

        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

