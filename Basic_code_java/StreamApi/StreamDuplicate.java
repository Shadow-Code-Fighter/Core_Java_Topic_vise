package Basic_code_java.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDuplicate {
    
    public static void main(String[] args) {
        List<String> listData = Arrays.asList("Java","Python","C#","Kotlin","Java","Python");
        List<String> newData = listData.stream().distinct().collect(Collectors.toList());
        System.out.println(newData);
    }
}
