package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingMethodFindisEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = numbers.stream().filter(UsingMethodFindisEven::isEven).collect(Collectors.toList());
        System.out.println(collect);
        
    }

    public static boolean isEven(int number) { 
        return number % 2 == 0; 
    }
    
}
