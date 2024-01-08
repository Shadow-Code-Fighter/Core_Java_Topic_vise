package Interview_code_QP;

import java.util.Scanner;

// Write a Java Program to check if any number is a magic number or not. A number is said to
//  be a magic number if after doing sum of digits in each step and inturn 
// doing sum of digits of that sum, the ultimate result (when there is only one digit left) is 1.

// like: 
// step 1:- 910 -> 9+1+0 = 10
// step 2:- 10 -> 1+0 = 1 //correct out at end is 1 

public class MagicNumber {
    public static void main(String[] args) {
        long num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check is magic number or not: ");
        num=in.nextLong();
        long sumOfDigits = 0;
        System.out.println("Enter your choice Lucky number is: ");
        int choice =in.nextInt();

        // Check here given number
            while (num>0 || sumOfDigits>9) {
                if (num==0) {
                    num=sumOfDigits;
                    sumOfDigits=0;
                }
                sumOfDigits += num % 10;
                num /=10;
            }
            System.out.println("Sum of given number is: " +sumOfDigits);

        // If sum is 1, original number is magic number 
            if(sumOfDigits == choice) {
                System.out.println("magic number: ");
            }else {
                System.out.println("Not magic number: ");
            }
    in.close();

    }
}
