package Basic_code_java.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

public class StreamApi1 {
    public static void main(String[] args) {
        List<Integer> myList =  Arrays.asList(12,22,76,3,33,23);
        myList.stream().filter(n->n%2==0).forEach(System.out::println);

    }
}
