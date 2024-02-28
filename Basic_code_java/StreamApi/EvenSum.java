package StreamApi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenSum {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum =numList.stream().filter(num->num%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}
