package StreamApi.practice_code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringFrequecy {
    public static void main(String[] args) {
        // List<String> names = Arrays.asList("Ram","Shayam","Ram","Shayam","Mohan");
        // Map<String,Long> countNames = names.stream().distinct().collect(Collectors.groupingBy(word->word,Collectors.counting()));
        // System.out.println(countNames);

        List<Integer> numbers = Arrays.asList(1,1,2,3,3,4,2,5,4,4);
        Map<Integer,Long> countNumber = numbers.stream().collect(Collectors.groupingBy(number-> number,Collectors.counting()));
        System.out.println(countNumber);
    }
}
