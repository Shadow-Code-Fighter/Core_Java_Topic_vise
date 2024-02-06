package Practice;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < i + 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

