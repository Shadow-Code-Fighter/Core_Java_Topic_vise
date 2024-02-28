package Loops;
import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); 
        int num = 1; 
        
        while (num<=n) {
            System.out.println(num);
            num++;
        }
    }
}
