package StreamApi;

import java.util.stream.Stream;

// In parallel operation this method does not gurantee
// to respect the encounter order

public class ForEach {

    //for sequential 
    public static void main(String[] args) {
        System.out.println(" for sequential");
        Stream.of(1,2,3,4,5)
        .forEach(a->System.out.println(a));
    

        //for parallel
    System.out.println(" for Parallel");
    Stream.of(1,2,3,4,5).parallel()
    .forEach(a->System.out.println(a));
    
    }
}
