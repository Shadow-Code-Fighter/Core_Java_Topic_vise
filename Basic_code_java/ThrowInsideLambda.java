

import java.util.Arrays;
import java.util.List;

public class ThrowInsideLambda {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 5, 10, 20);
        list.forEach(i -> {
            if (i < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed.");
            }
            System.out.println(i);
        });
    }
}
