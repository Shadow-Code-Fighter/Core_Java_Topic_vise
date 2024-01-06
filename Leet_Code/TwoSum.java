package Leet_Code;

import java.util.ArrayList;

public class TwoSum {
    public int[] twosum(int[] nums, int target){
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result.add(i);
                    result.add(j);
                    break;
                }
            }

        }
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
    return arr;
    }
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 6;
        int[] result = ts.twosum(nums, target);

        System.out.println(result);
        System.out.println("Indices of the two numbers that add up to the target:");
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}
