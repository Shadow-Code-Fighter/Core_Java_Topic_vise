package StreamApi;

import java.util.*;

public class DeciReverseStream {
    public static void main(String[] args) {

        List<Double> decimalData = Arrays.asList(12.45,23.58,17.13,42.89,33.78,71.85,56.98,21.22);
        decimalData.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);;
    }
}
