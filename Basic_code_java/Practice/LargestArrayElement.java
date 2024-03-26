package Practice;

public class LargestArrayElement {
    public static void main(String[] args) {
        int arr[]={10,50,70,40,50}; //unsorted
        int arr1[]={10,20,30,40,50}; //sorted
        System.out.println(arr1[arr1.length-1]);//when sorted element then last maximum number

        for(int i=1;i<arr.length;i++){ //unsorted array then use loop
            if(arr[i]>arr[0]){
                arr[0]=arr[i];
            }
        }
        System.out.println(arr[0]);
    }
}

