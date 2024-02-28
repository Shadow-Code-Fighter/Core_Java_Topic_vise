package StreamApi;

import java.util.stream.Stream;

// This method gurantees to respect the encounter 
// order in sequential and parallel strams both.

public class ForEachOrdered {
    public static void main(String[] args) {

        // for sequential
        System.out.println(" for sequential");
        Stream.of(1,2,3,4,5)
        .forEachOrdered(a->System.out.println(a));

        // for parallel
        System.out.println(" for Parallel");
        Stream.of(1,2,3,4,5).parallel()
        .forEachOrdered(a->System.out.println(a));
    }
}
