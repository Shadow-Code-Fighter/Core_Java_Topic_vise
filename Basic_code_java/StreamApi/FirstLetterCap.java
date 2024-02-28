package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstLetterCap {
    public static void main(String[] args) {
        String str ="gaurav";
        List<String> newData = Arrays.stream(str.split(" ")).map(s->s.length() > 0 ? s.substring(0,1).toUpperCase()+s.substring(1):s).collect(Collectors.toList());
        System.out.println(newData);

    }
}
