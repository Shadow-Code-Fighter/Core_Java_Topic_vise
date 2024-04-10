package StreamApi.practice_code;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMinNum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,4,1,2,6);
        Optional<Integer> max = nums.stream().max((x,y)->x.compareTo(y));
        System.out.println(max);
        Optional<Integer> min = nums.stream().min((x,y)->x.compareTo(y));
        System.out.println(min);

    }
}
