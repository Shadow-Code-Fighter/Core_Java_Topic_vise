package StreamApi;

import java.util.*;

public class DeciReverseStream {
    // public static void main(String[] args) {

    //     List<Double> decimalData = Arrays.asList(12.45,23.58,17.13,42.89,33.78,71.85,56.98,21.22);
    //     decimalData.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);;
    // }
        // public static void main(String[] args) {
        //     int[] numbers = {36, 85, 72, 91, 18};
    
        //     // Extract the last digit of each number and print
        //     System.out.print("Last digit of each number: ");
        //     for (int num : numbers) {
        //         int lastDigit = num % 10;
        //         num++; // Extract the last digit using modulo operation
        //         System.out.print(num + " ");
        //     }
        // }
    public static void main(String[] args) {
        int[] array = {36, 85, 72, 91, 18};
        
        // Sorting array in descending order
        Arrays.sort(array);
        
        // Reversing the sorted array
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        
        // Printing the sorted array
        System.out.println("Sorted array in descending order: " + Arrays.toString(array));
    }
}

