package StreamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamFuncInterface {
    public static void main(String[] args) {

        // Given a list of integers, find out all the even 
        // numbers that exist in the list using Stream functions?
        List<Integer> mylist = Arrays.asList(12,23,34,45,56,67,8,98,12,23,34,56);
        mylist.stream()
        .filter(n->n%2==0)
        .forEach(System.out::println);

        System.out.println("Next Answer: ");

        // Given a list of integers, find out all
        //  the numbers starting with 1 using Stream functions?
        mylist.stream()
        .map(str->str+"") //convert integer to String
        .filter(str->str.startsWith("1"))
        .forEach(System.out::println);

        System.out.println("Next Answer: ");

        // How to find duplicate elements in a given
        //  integers list in java using Stream functions?
        Set<Integer> set = new HashSet<>();
        mylist.stream()
        .filter(n->!set.add(n)).forEach(System.out::println);
    }
}
