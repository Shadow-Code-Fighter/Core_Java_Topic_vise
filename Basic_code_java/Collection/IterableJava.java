package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IterableJava {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(12);
        c.add(24);
        c.add(36);
        c.add(48);

        System.out.println(c);

        //for each loop first way of iterator 
        System.out.println("ForEach _________");
        for (Integer integer : c) {
            System.out.println(integer);
        }

        //second way iterator
        System.out.println("Iterator _________");
        Iterator<Integer> it = c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
