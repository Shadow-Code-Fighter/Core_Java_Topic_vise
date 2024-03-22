package Practice;

import java.util.Scanner;

public class Floyds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows\n");

        int rows=sc.nextInt();
        System.out.println("Floyd's Triangke Generated");
        int count=1;

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
