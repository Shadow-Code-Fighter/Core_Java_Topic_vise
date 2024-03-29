package Practice;

// Bubble sort to sorting Array

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr ={32,11,22,12,45,4,1};
        int n =arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];  //swaping
                    arr[j] =arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array");
        for (int num : arr) {
            System.out.println(num+" ");
        }
    }
}
