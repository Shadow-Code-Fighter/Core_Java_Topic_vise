package Practice;

public class practice2 {
    public static void main(String[] args) {
        
        int arr [] =  {2,4,1,5,6,8,9};
        int sumArray = 0;
        
        for (int i : arr) {
            sumArray+=i;
        }

        if(sumArray%2==0){
            // sumArray +=1;
            System.out.println("Your Number is Even: "+sumArray);
        }else{
            System.out.println("Your Number is Odd: "+sumArray);
        }
    }
}
