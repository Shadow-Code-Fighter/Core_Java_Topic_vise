package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//flatMap is a method that is used to combined multiple lists to one list.
public class FlatMapStream {
    public static void main(String[] args) {
        List<Integer> list_1 = Arrays.asList(1,2,3,4);
        List<Integer> list_2 = Arrays.asList(5,6,7,8);
        List<Integer> list_3 = Arrays.asList(11,12,13,14);

        List<Integer> listAll = Stream.of(list_1,list_2,list_3).flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println(listAll);
    }
}
