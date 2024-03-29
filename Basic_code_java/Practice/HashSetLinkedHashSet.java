package Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetLinkedHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(null);
        hashSet.add(null);

        System.out.println("HashSet: "+hashSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(5);
        linkedHashSet.add(4);
        linkedHashSet.add(null);
        linkedHashSet.add(null);

        System.out.println("LinkedHashSet: "+linkedHashSet);
    }
}
