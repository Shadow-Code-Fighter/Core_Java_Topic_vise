package Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordOccurenceNextPrevious {
    public static void main(String[] args) {
        String sentence = "jagannath is boss in jagannath companay";
        String targetWord = "jagannath";
        int count = 1;
        Pattern pattern = Pattern.compile("(?:(\\S+)\\s)?"+targetWord+"\\s(\\S+)");
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {            
            String previousWord = matcher.group(1);
            String nextWord = matcher.group(2);
            if (previousWord==null) {
                previousWord="null";
            }
            System.out.println("Occurence Word: "+targetWord+" Count: "+count++);
            System.out.println("Previous Word: "+previousWord); 
            System.out.println("Next Word: "+nextWord);
        }
    }







}
