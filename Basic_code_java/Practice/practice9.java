package Practice;

import java.util.HashMap;
import java.util.Map;

public class practice9 {
    public static Map<Integer, Integer> countFrequency(int[] arr){
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int num : arr){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
        }
        return frequencyMap;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,1,2,3,4,5};
        Map<Integer,Integer> frequencyMap = countFrequency(arr);
        System.out.println(frequencyMap);
    }
}
