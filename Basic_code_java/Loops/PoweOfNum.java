package Loops;

import java.util.Scanner;

public class PoweOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt();
        int ans=1;

        for(int i=1;i<=b;i++){
            ans *=a;
        }
        System.out.println(ans);
    }
}
