package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        System.out.println(integers);

        Iterator<Integer> itr = integers.iterator();
        while (itr.hasNext()) {
             Integer a = itr.next();
             System.out.println(a);     
             System.out.println(integers.remove(a));;
        }
    }
}