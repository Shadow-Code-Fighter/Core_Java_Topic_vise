package Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int originnal_n = n;
        int sumOfDigit = 0;

        while (n>0) {
            
            sumOfDigit += n%10;
            n /=10;
        }
        System.out.println(originnal_n+"="+sumOfDigit);
    }
}
