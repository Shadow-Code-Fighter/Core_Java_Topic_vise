package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstLetterUpperCase {
        public static void main(String[] args) {
            List<String> input = Arrays.asList("gaurav","rohan","ram");
    
            String result = input.stream().map(s -> s.length() > 0 ? s.substring(0, 
                    1).toUpperCase() + s.substring(1) : s)
                    .collect(Collectors.joining());
    
            System.out.println(result);
        }
    }