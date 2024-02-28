package Practice;

import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        int compare=0,a=1,b=1;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        while (compare<=n) {
            compare=a+b;
            System.out.println(compare);
            a=b;
            b=compare;
        }
    }
}
