package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringOccurences {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Paragrapgh");
        String sentence = sc.nextLine();

        //spilt the sentence
        String [] words = sentence.split("\\s+");

        Map<String,Integer> wordFrequency = new HashMap<>();

        for(String word : words){
            //remove punctuation and convert lowercase
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0)+1);
            }
        }
        System.out.println("Word Frequency");
        for(Map.Entry<String,Integer> entry : wordFrequency.entrySet()){
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }
        sc.close();
    }
}
