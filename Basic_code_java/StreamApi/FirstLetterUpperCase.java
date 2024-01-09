package Basic_code_java.StreamApi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstLetterUpperCase {
        public static void main(String[] args) {
            // String input = "gaurav";
    
            String result = Arrays.stream("gaurav".split(" "))
                    .map(s -> s.length() > 0 ? s.substring(0, 1).toUpperCase() + s.substring(1) : s)
                    .collect(Collectors.joining());
    
            System.out.println(result);
        }
    }