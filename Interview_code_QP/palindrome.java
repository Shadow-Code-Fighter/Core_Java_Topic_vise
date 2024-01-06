package Interview_code_QP;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        String original ,reverse="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to check if it is a pelidrome: ");
        original=sc.nextLine();

        int length = original.length();
        System.out.println(length);

        for(int i=length-1;i>=0;i--)
            reverse=reverse+original.charAt(i);
        if(original.equals(reverse)){
            System.out.println("Entered string is a pelidrome");
        }else{
            System.out.println("Entered string is not pelidrome");
        }
        sc.close();
    }
    
}
