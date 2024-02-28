package Loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=0;
        int sum =0;

        do{
            sum +=num;
            num=in.nextInt();            
        }while(num!=-1);
    
        System.err.println(sum);
    }
}
