package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
        // Set<Integer> s = new HashSet<>();
        Set<Integer> s = new TreeSet<>();
        
        s.add(12);
        s.add(36);
        s.add(24);
        //Add Duplicate Element
        s.add(48);
        s.add(48);

        System.out.println(s);

        // for (Integer integer : s) {
        //     System.out.println(integer);
            
        // }

        

    }
}
