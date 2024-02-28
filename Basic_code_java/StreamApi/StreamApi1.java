package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class StreamApi1 {
    public static void main(String[] args) {
        List<Integer> myList =  Arrays.asList(12,3,76,22,33,23);
        myList.stream().filter(n->n%2==0).forEach(System.out::println);

        // Consumer<Integer> c = n->System.out.println(myList);
        // myList.forEach(c);

    }
}
