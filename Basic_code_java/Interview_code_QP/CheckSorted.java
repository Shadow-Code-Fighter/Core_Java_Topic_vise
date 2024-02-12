package Interview_code_QP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckSorted {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size: ");
        int size = Integer.parseInt(br.readLine());

        //Taking input from user
        System.out.println("Enter array elements : ");
        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine()); //store input
        }
        int n = arr.length; //check store input size
        System.out.println("Number of array is: "+n);

        boolean isSorted = true; //check whether sorted or not

        //This will be check sorted or unsorted array
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }

        //this is show user input if sorted input then it will be give sorted other wise
        //it is not sorted
        if(isSorted){
            System.out.println("Sorted");
        }else{
            System.out.println("Not Sorted");
        }

        //sorting the array
        for(int i =0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        //after sorting array print 
        System.out.println("After Sorting");
        for(int value: arr){
            System.out.println(value);
        }
    }
}
