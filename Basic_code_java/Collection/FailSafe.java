package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class FailSafe {
    public static void main(String[] args) {
        List<Integer> integers = new CopyOnWriteArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers);

        Iterator<Integer> itr = integers.iterator();
        while (itr.hasNext()) {
            Integer a = itr.next();
            System.out.println(a);;
            System.out.println(integers.remove(a));
        }
        System.out.println(integers);
    }
    
}