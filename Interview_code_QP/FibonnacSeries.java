package Interview_code_QP;

import java.util.Scanner;

//Fibonnac number is series numbers in which each number is the sum of the two preceding 
// numbers. The simplest is the series 1,1,2,3,5,8 etc.
public class FibonnacSeries {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0,b=1;
    System.out.println("Enter a number to check finnoacSeries");
    int n=sc.nextInt();

    int count=2;

    while(count<=n){
        int temp=b;
        b=b+a;
        a=temp;  //temp holds 1,1,2,3,5,8
        count++;
    }
    System.out.println("Nth position: "+b);
   }
}
