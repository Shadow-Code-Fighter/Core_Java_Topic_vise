package Leet_Code;

import java.util.ArrayList;

public class TwoSum {
     public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 6;
        int[] result = ts.twosum(nums, target);

        System.out.println("Indices of the two numbers that add up to the target: ");
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
    
    public int[] twosum(int[] nums, int target){
        //store array sum index
        ArrayList<Integer> result = new ArrayList<>(); //ArrayList

        // check and run this code to sum of given target number and store result
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                //check sum of target element
                if(nums[i]+nums[j]==target){
                    result.add(i); //add ArrayList
                    result.add(j); //add ArrayList
                    break;
                }
            }

        }
        // convert ArrayList to array
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
    return arr;
    } 
}
